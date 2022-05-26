package junkiyun.kotlinstudy.functional;

/**
 * Java가 제공하는 functional interface 를 벗어난 형태라면 interface를 별도로 정의해야한다.
 */
@FunctionalInterface
interface TriFunction {
	int add(int a, String b, int c);
}
