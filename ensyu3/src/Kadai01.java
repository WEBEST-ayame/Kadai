/*[課題01] 数値の入力を受け付け、入力された数値の数だけ、掛け算の表をコンソールに出力してください。
 *  例えば、15と入力されたら、 1×1~15×15までの掛け算の表を出力してください。*/

import java.util.Scanner;

public class Kadai01 {
	public static void main (String[] args) {
		System.out.println("数字を入力して下さい");

		//Scannerを呼び出し、キーボードの標準入力を取得する。
		Scanner scanner = new Scanner(System.in);
		//取得した値を変数に定義
		int num = scanner.nextInt();
		scanner.close();
		//LongクラスのvalueOfメソッドを使って数字を文字列に変更し掛け算の解の長さを取得し、答えを表示するフィールドの変数を用意
        int lengthOffield = String.valueOf(num * num).length() + 1;
        String format = "%" + lengthOffield + "d";

        //scannerで取得した値の掛け算
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
                System.out.printf(format, i*j);
            }
            //格段の処理が終わったら改行
            System.out.println();
        }

    }
}

