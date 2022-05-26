package junkiyun.kotlinstudy.functional;

class JavaFunctional {
	public static void main(String[] args) {
		System.out.println(myFunction(100).add(1, "abc", 3));
	}

	/**
	 * TriFunction이 functional interface 인데,
	 * function의 형태를 확인하려면 TriFunction의
	 * 코드를 다시 확인해야한다.
	 */
	private static TriFunction myFunction(int x) {
		return (a, b, c) -> x * (a * b.length() + c);
	}
}
