
public class Kadai01 {

	public static void main(String[] args) {
		//インスタンス化
		Person taro_yamada = new Person();
		//setterで名前を定義
		taro_yamada.setName("Taro yamada");
		//setterで年齢を定義
		taro_yamada.setAge(47);
		//Personクラスで作成した自己紹介のメソッドを呼び出す
		taro_yamada.showProfile();

	}

}
