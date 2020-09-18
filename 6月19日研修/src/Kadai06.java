/*[演習06]演習05のプログラムを以下のように変更してください。
 *1~12以外が入力された場合には、入力が間違っています、再度入力してください。と表示し、再入力を受け付けてください。*/

//スキャナーを読み込む
import java.util.Scanner;

public class Kadai06 {
	public static void main (String[] args) {
		System.out.println("月を1〜12で入力してください。（Enterキーで終了）");

		//Scannerを呼び出し、キーボードの標準入力を取得する。
		Scanner Scanner = new Scanner(System.in);
		//変数の初期値を設定
		int num = 0;
		
		boolean input = true;

		while (input) {
			try {
				num= Scanner.nextInt();

			}

		catch(Exception e) {
			Scanner.next();

		}

		//31日まである月のcaseを作成し、条件に合う場合は出力

			switch (num) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(num+"月は31日です");
				input = false;
				break;
				//30日まである月のCaseを作成し、条件に合う場合は出力
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(num+"月は30日です");
				input = false;
				break;
				//28日の月のCaseを作成し、条件に合う場合は出力
			case 2:
				System.out.println(num+"月は28日です");
				input = false;
				break;
			default:
				System.out.println("入力が間違っています、再入力してください。");
			}
	}   //Scannerクラスのインスタンスをクローズ
		Scanner.close();
	}
}


