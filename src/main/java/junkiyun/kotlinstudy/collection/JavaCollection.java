package junkiyun.kotlinstudy.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class JavaCollection {

	public static void main(String[] args) {
		//var integerList = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
		var integerList = IntStream.rangeClosed(1, 10)
											 .mapToObj(integer -> integer % 5)
											 .collect(Collectors.toList());

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
						  .collect(Collectors.toList());
	}

	private static Set<Integer> toIntegerSet(List<Integer> integerList) {
		return new HashSet<>(integerList);
	}

	private static Set<String> toStringSet(List<Integer> integerList) {
		return integerList.stream()
						  .map(String::valueOf)
						  .collect(Collectors.toSet());
	}
}
