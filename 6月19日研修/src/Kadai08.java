/*
[演習08]
キーボードから5人分の点数の入力を受け付け、
5人の合計点数、平均点数、最高点数を表示してください。
さらに、小さい順に並べて表示してください。
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Kadai08 {
	 private static final String Calculate = null;

	public static void main(String[] args) {
		 System.out.println("1人目の点数を入力してください。");
		//Scannerを呼び出し、キーボードの標準入力を取得する。
		 Scanner Scanner = new Scanner(System.in);
		 int num1= Scanner.nextInt();
		 //2〜5人目までの入力を受け付ける
		 System.out.println("2人目の点数入力してください。");
		 int num2= Scanner.nextInt();

		 System.out.println("3人目の点数入力してください。");
		 int num3= Scanner.nextInt();

		 System.out.println("4人目の点数入力してください。");
		 int num4= Scanner.nextInt();

		 System.out.println("5人目の点数入力してください。");
		 int num5= Scanner.nextInt();
		 //入力された点数の配列を作成
		 List<Integer> score = new ArrayList<>();

	        score.add(num1);
	        score.add(num2);
	        score.add(num3);
	        score.add(num4);
	        score.add(num5);

	     //合計値の算出
		 int sum = (num1 + num2 + num3 + num4 + num5);
		 System.out.print("合計点数は"+sum+ "点です。");
		 //平均点の算出
		 int ave = sum/score.size();
		 System.out.print("平均点は"+ ave + "点です。");
		 //最高得点の算出
		 Integer maxPara = Collections.max(score);
	     System.out.println("最高得点は"+maxPara+"点です。");

	     //点数を昇順に
	     Collections.sort(score);
	     System.out.print("点数は小さい順に");
	         for (Integer a : score) {
	        	 System.out.print(a+" ");
	         }

	      Scanner.close();
	 }
}
