package junkiyun.kotlinstudy.property;

import junkiyun.kotlinstudy.property.PlayerConstants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class JavaPlayer {
	private int age = PlayerConstants.MIN;

	public void setAge(int age) {
		validateAge(age);
		this.age = age;
	}

	public void printAge() {
		System.out.println(age);
	}

	public void increase() {
		setAge(age + 1);
	}

	/**
	 * 자바 필드의 문제점은 클래스 내에서는 어떠한 행위든 할 수 있다는 것이다.
	 * 클래스 내부에서 아래와 같은 코드를 방어할 방법이 없다.
	 * age = 1500;
	 */
	public void decrease() {
		int newAge = age - 1;
		validateAge(newAge); // 검증 코드를 실수로 누락한다면?
		age = newAge;
	}

	/**
	 * field에 들어갈 값을 검증하기 위해 private method가 만들어진 상황이다.
	 */
	private void validateAge(int age) {
		if (age < PlayerConstants.MIN || age > PlayerConstants.MAX ) {
			throw new IllegalArgumentException();
		}
	}
}
