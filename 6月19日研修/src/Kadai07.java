import java.util.Scanner;

public class Kadai07 {
	 public static void main(String[] args) {
		 System.out.println("1つ目の文字列を入力してください。");

		 Scanner Scanner = new Scanner(System.in);
		 String str1= Scanner.next();

		 System.out.println("2つ目の文字列を入力してください。");
		 String str2= Scanner.next();


		    if( str1.contentEquals(str2) ){
		      System.out.println("入力された文字列は等しいです");
		    }
		    else{
		      System.out.println("入力された文字列は異なっています");
		    }
		    Scanner.close();
		  }
}
