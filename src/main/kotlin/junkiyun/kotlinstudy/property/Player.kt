package junkiyun.kotlinstudy.property

class Player {

    /**
     * age에 들어갈 값을 검증하는 logic이 age의 선언과 잘 모여있다.
     * 이 class 내부에서도 age 값 변경시 validation은 작동한다.
     * age에 유효하지 않은 값을 넣는 것은 불가능하다.
     */
    var age = PlayerConstants.MIN
        set(age) {
            if (age in PlayerConstants.MIN..PlayerConstants.MAX) {
                field = age
            } else {
                throw IllegalArgumentException()
            }
        }

    fun printAge() {
        println(age)
    }

    /**
     * age를 변경할 때 유효성 검사에 대해 신경을 쓸 필요가 없다. property가 해주기 때문이다.
     */
    fun increase() {
        age += 1
    }

    fun decrease() {
        age -= 1
    }
}