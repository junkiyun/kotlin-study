package junkiyun.kotlinstudy.singleton;

/**
 * singleton 을 직접 구현한 예제
 */
public class RestClientManual {
	public static RestClientManual getInstance() {
		return RestClientManualHolder.instance;
	}

	private static class RestClientManualHolder {
		private static final RestClientManual instance = new RestClientManual();
	}

	private RestClientManual() {

	}
}
