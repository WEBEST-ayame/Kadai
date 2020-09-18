//[課題2]
//整数型の配列「numbers」を宣言して、{10,4,340,180,79}を代入してください。
//また、配列の中から最大値をコンソールに表示するプログラムを作成してください。
public class study02 {
	public static void main(String[] args) {
        // 配列「numbers」に数字を代入
        int numbers[] = {10,4,340,180,79};
        // 配列の要素の1番目で初期化
        int max = numbers[0];
        // 要素0番目のは代入済みのため1番目からループ処理を開始
        for(int i = 1; i < numbers.length; i++) {
            // maxに代入されている値と配列の要素を比較して、
            // 配列の要素のほうが大きい場合値は上書きして表示する
        	if(max < numbers[i]) {
        		max = numbers[i];
        	    System.out.println(max);
        	}
        }
	}
}
