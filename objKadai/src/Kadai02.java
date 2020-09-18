/*[課題02] [課題01]のPersonクラスを使用して、次のプログラムを作成してください。
*1 Personクラスを継承した、Shainクラスの作成。
*2 Shainクラスに、会社名を保持する変数「companyName」と、会社名を設定するメソッド「 setCompanyName」を追加。
*3 Shainクラスのインスタンスを2つ作成する。(インスタンス化する値は各自決めてください。) 4 それぞれのプロフィールを表示する。
※名前、年齢、会社名*/

public class Kadai02 {
	public static void main(String args[]){
		//インスタンス化し引数を渡す
		Shain taro_tanaka = new Shain("taro tanaka",35,"AAA");
		//Personクラスで作成した自己紹介のメソッドを呼び出す
		taro_tanaka.showProfile();
		//インスタンス化し引数を渡す
		Shain yamada_hanako = new Shain("yamada hanako",25,"BBB");
		//Personクラスで作成した自己紹介のメソッドを呼び出す
		yamada_hanako.showProfile();
		}
}
