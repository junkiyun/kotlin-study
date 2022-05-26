package junkiyun.kotlinstudy.extfunc;

class Utils {
	private Utils() {}
	static int power(int x, int y) {
		if (y == 0) {
			return 1;
		}
		if (y == 1) {
			return x;
		}
		var half = power(x, y / 2);
		if (y % 2 == 0) {
			return half * half;
		}
		return half * half * x;
	}
}
