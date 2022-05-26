package junkiyun.kotlinstudy.nullsafety;

import java.util.Optional;

class JavaNullSafetyMain {

	public static void main(String[] args) {
		System.out.println(lengthNullSafe(null));
		System.out.println(length(null));
	}
	private static int length(String s) {
		return s.length();
	}

	private static int lengthNullSafe(String s) {
		if (s == null) {
			return 0;
		}
		return s.length();
	}

	private static int lengthNullSafeOptional(String s) {
		return Optional.ofNullable(s).map(String::length).orElse(0);
	}
}
