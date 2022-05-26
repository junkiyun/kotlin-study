package junkiyun.kotlinstudy.property;

class PropertyMain {

	public static void main(String[] args) {
		var invalidAge = 80;
		JavaPlayer javaPlayer = new JavaPlayer();
		javaPlayer.setAge(invalidAge);
		javaPlayer.printAge();

		Player player = new Player();
		player.setAge(invalidAge);
		player.printAge();
	}
}
