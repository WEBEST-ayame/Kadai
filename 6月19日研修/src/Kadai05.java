/*[演習05]演習04のプログラムをつかって、月を表す文字列を入力して、その月の日数を表示する
プログラムを作成してください。
2月は一律 28日とします。
また、1~12以外が入力された場合には、”入力が間違っています。”と表示してください。*/

//スキャナーを読み込む
import java.util.Scanner;

public class Kadai05 {
	public static void main (String[] args) {
		System.out.println("月を1〜12で入力してください。（Enterキーで終了）");
		//Scannerを呼び出し、キーボードの標準入力を取得する。
		Scanner scan = new Scanner(System.in);
		//ScannerクラスのnextLineメソッドを使ってキーボード入力された文字を読み込む。
		int number= scan.nextInt();
		//Scannerクラスのインスタンスをクローズ
		scan.close();
		//31日まである月のcaseを作成し、条件に合う場合は出力
		switch (number) {
		  case 1:
		  case 3:
		  case 5:
		  case 7:
		  case 8:
		  case 10:
		  case 12:
		    System.out.println(number+"月は31日です");
		    break;
		  //30日まである月のCaseを作成し、条件に合う場合は出力
		  case 4:
		  case 6:
		  case 9:
		  case 11:
			 System.out.println(number+"月は30日です");
		    break;
		  //28日の月のCaseを作成し、条件に合う場合は出力
		  case 2:
			 System.out.println(number+"月は28日です");
		    break;
		  //その他の文字が入力された場合はエラ〜メッセージを出力
		  default:
			  System.out.println("入力が間違っています、再入力してください。");
		    break;
		}
	}

}
