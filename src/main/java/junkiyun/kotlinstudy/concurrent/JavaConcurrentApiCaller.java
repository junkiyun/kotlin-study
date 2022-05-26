package junkiyun.kotlinstudy.concurrent;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.Random;
import java.util.concurrent.TimeUnit;

class JavaConcurrentApiCaller {
	private static final Random random = new Random();

	public static void main(String[] args) {
		var disposable = Flowable.range(0, ConcurrentConstants.iteration)
								 .map(i -> callApi())
								 .toList()
								 .subscribe(singleList -> Single.merge(singleList)
																.blockingSubscribe(System.out::println));
		assert disposable.isDisposed();
	}

	private static Single<Integer> callApi() {
		return Single.just(random.nextInt())
					 .delay(ConcurrentConstants.delay, TimeUnit.MILLISECONDS)
					 .subscribeOn(Schedulers.io())
					 .map(r -> Math.max(r, 0));
	}
}

