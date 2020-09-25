/*[課題03] [課題02]で作成したプログラムを用いて、以下のプログラムを作成してください。
*利用者に「円の面積」、「円の円周」、「球の表面積」、「球の体積」のうち、何を計算させるか選択させる。
*半径(数値)の入力を受け付け、選択された計算の答えを表示する。
*利用者が望む限り、何回でも計算できるようにする。*/

import java.util.Scanner;

public class Kadai03 {
	public static void main(String args[]) {
		// 選択肢の配列を用意
	    String[] options = new String[]{"円の面積", "円周", "球の体積", "球の表面積"};

	    System.out.println("計算したい項目をお選び下さい。");
	    for(int i = 0;i < options.length;i++){
	    	System.out.println(i + ":" + options[i]);
	    }
	    //選択するための文字の入力を受け付ける
	    Scanner firstScanner = new Scanner(System.in);
	    //精査された数字を変数に定義する
	    int select = readInt(firstScanner);
	    //選択された答えを出力
	    System.out.println("ご注文は" + options[select] + "ですね。");

	    //半径の入力を促すメッセージを表示
        System.out.println("半径を入力してください");
        //半径の値の入力を受け付ける
        Scanner secondScanner = new Scanner(System.in);
        double radius = secondScanner.nextDouble();

        //インスタンス化しCircleクラスのコンストラクタを呼び出す
        Circle circle = new Circle(radius);

        //インスタンス化しSphereクラスのコンストラクタを呼び出す
        Sphere sphere = new Sphere(radius);

        //入力された値によって計算を変えるよう条件分岐
        if (select == 0) {
        	 //Circleクラスで作成した円の面積の計算のメソッドを呼び出す
            double areaOfCircle = circle.area();
            System.out.println("円の面積は " + areaOfCircle);
        } else if (select == 1) {
        	//Circleクラスで作成した円周の計算のメソッドを呼び出す
            double lengthOfCircle = circle.length();
            System.out.println("円周の長さは" + lengthOfCircle);
        }else if (select == 2) {
            //Sphereクラスで作成した球の体積の計算のメソッドを呼び出す
            double volumeOfBall = sphere.volume();
            System.out.println("球の体積は" + volumeOfBall);
        }else {
        	 //Sphereクラスで作成した球の表面積の計算のメソッドを呼び出す
            double areaOfSurfaceOfBall = sphere.areaOfSurface();
            System.out.println("球の表面積は" + areaOfSurfaceOfBall);
        }


        //Scannerメソッドをクローズ
        firstScanner.close();
        secondScanner.close();
    }
	//入力された数字が適切か精査するためのメソッド作成
	public static int readInt(Scanner sc) {
	    String choices = sc.nextLine();
	    while(true){
	      try{
	    	  Integer.parseInt(choices);
	    	  if (choices.matches("^[0-3]*$")) {
	             //intに変換する
	             return Integer.parseInt(choices);
	    	  } else {
	  	         //変換に失敗した場合は警告してやり直し
		    	 System.out.println("正しい項目番号を半角数字で入力してください。");
		    	 return readInt(sc);
	    	  }
	      }catch(NumberFormatException e){
	        //変換に失敗した場合は警告してやり直し
	    	  System.out.println("数字ではありません。");
	    	  return readInt(sc);
	      }
	    }
	  }
}
