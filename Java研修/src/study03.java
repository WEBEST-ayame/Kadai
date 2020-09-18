//[演習03]
// コンソールに九九の表を表示してください。表示は見栄え良く桁を揃えてください。
public class study03 {
	public static void main(String[] args) {
		//掛け算の処理
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				//解が一桁の時は解の直前に半角スペース二つ
				System.out.printf("%3d", i*j);
			}
			//格段の処理が終わったら改行
			System.out.println();
		}
	}

}
