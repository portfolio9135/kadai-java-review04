package animal;

public class Human extends Animal implements Thinkable {
	private String hobby;

	//コンストラクタ (クラス名と同じ文字列にする)
	public Human(String name, int age, String hobby) {
		//「Humanクラスのコンストラクタの中」で、「Animalクラスのコンストラクタを呼び出して」初期化する
		super(name, age);

		//ここは
		this.hobby = hobby;
	}

	@Override
	public void say() {
        System.out.println(getName() + "です。" + getAge() + "歳です。");
	}


	@Override
	public void think() {
		System.out.println("私は" + hobby + "について考えてます。");
	}
}