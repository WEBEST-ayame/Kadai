

public class Shain extends Person {
	//会社名のフィールド変数を定義
	private String companyName;

	//コンストラクタ作成
	Shain (String name, int age, String companyName){
		super(name,age);
		this.companyName = companyName;
	}

	//オーバーライドでPersonクラスで作成したメソッドに会社名を追加
	@Override
	public void showProfile() {
		super.showProfile();
		System.out.println("会社名は" + companyName + "です。");
	}
}
