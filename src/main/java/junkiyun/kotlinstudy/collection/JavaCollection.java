package junkiyun.kotlinstudy.collection;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class JavaCollection {

	public static void main(String[] args) {
		List<Integer> integerList = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

		System.out.println("toStringList");
		toStringList(integerList).forEach(System.out::println);

		System.out.println("toIntegerSet");
		toIntegerSet(integerList).forEach(System.out::println);

		System.out.println("toStringSet");
		toStringSet(integerList).forEach(System.out::println);
	}

	/**
	 * 아래 코드의 integerList.set(0, 100)은 UnsupportedOperationException을 던지지만
	 * 컴파일 타임에 막아주지 못한다.
	 *
	 * 만약 parameter가 변경 가능한 list로 들어와도 실제로 변경이 되버리는 문제가 있다.
	 */
	private static List<String> toStringList(List<Integer> integerList) {
		integerList.set(0, 100);
		return integerList.stream()
						  .map(String::valueOf)
						  .toList();
	}

	/**
	 * List를 Set으로 전환하는 간단한 작업을 위해 많은 코드가 필요하다.
	 */
	private static Set<Integer> toIntegerSet(List<Integer> integerList) {
		return integerList.stream()
						  .collect(Collectors.toSet());
	}

	private static Set<String> toStringSet(List<Integer> integerList) {
		return integerList.stream()
						  .map(String::valueOf)
						  .collect(Collectors.toSet());
	}
}
