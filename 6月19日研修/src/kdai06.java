
import java.util.Scanner;
import java.util.function.Function;
public class kdai06 {
	public static int inputInteger(Scanner sc, Function<Integer, Boolean> isValid) {
        while (true) {
            System.out.print("数値を入力してください: ");
            System.out.flush();
            if (sc.hasNextInt()) {
                int value = sc.nextInt();

                //(個人メモ)受け取ったisValidによって条件チェック
                if (isValid.apply(value)) {
                    return value;
                }
                System.out.println("入力が間違っています、再入力してください。");
            } else {
                System.out.println("入力が間違っています、再入力してください。");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //条件を引数として渡す
        int number = inputInteger(sc, value -> value < 13);
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
		   default:
			   System.out.println("入力が間違っています、再入力してください。");
			   sc.next();
		}
    }
}
