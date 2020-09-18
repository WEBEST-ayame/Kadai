
//Scannerをインポート
import java.util.Scanner;

public class study04 {
	 public static void main(String args[]){
		 //「入力してください」の文字を出力する。
		 System.out.println("入力してください。");
		 	//Scannerを呼び出し、キーボードの標準入力を取得する。
		    Scanner scan = new Scanner(System.in);
		    //ScannerクラスのnextLineメソッドを使ってキーボード入力された文字を読み込む。
		    String str = scan.nextLine();
		    System.out.println(str);
		    //Scannerクラスのインスタンスをクローズ
		    scan.close();
		  }
}
