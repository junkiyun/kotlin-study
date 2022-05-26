package junkiyun.kotlinstudy.parameter;

import java.util.List;
import java.util.function.Predicate;

class JavaParameterMain {
	public static void main(String[] args) {
		var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

		System.out.println(count(list));
		System.out.println(count(list, x -> x % 3 == 0));
	}

	private static int count(List<Integer> list, Predicate<Integer> filter) {
		return (int)list.stream()
				   .filter(filter)
				   .count();
	}

	/**
	 * Java에서 default parameter는 아래와 같이 장황한 방법으로 구현할 수 있다.
	 */
	private static int count(List<Integer> list) {
		return count(list, x -> true);
	}
}
