/*[課題05] 課題04で作成した「Vehicleクラス」に対して、総走行距離を表すフィールドと、 値を取得するメソッドを追加した自動車クラス「Car」を作成してください。
 *  また、現在位置の移動時には、総走行距離に移動した距離を加えてください。。*/

public class Vehicle {

	//フィールド変数を定義
	private String vehicleNme;
	private String maker;
	private String date;
	private int x;
	private int leave;

	//setter、getterでそれぞれのメソッドを作成
	public void setVehicleNme(String vehicleNme) {
		this.vehicleNme = vehicleNme;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setLeave(int leave) {
		this.leave = leave;
	}

	public String getBuyDate() {
		return date;
	}

	public int getX() {
		return x;
	}

	public int getLeave() {
		return leave;
	}

	//コンストラクタ作成
	Vehicle(String vehicleNme, String maker, String date, int x,int leave){
		this.vehicleNme = vehicleNme;
		this.maker = maker;
		this.date = date;
		this.x = x;
		this.leave = leave;
	}

	//移動距離が残り燃料を上回る時とそうで無い時に場合わけし現在位置と残り燃料の計算のメソッドを作成、燃料が足りない時はメッセージを表示
	public void getMovingDistance(int movingDistance) {
		if (Math.abs(movingDistance) > leave) {
			//移動距離が残り燃料を上回る時の計算
			System.out.println( "現在位置は、" + ( x + (movingDistance - (Math.abs(movingDistance)-leave)) ) + "です。" );
			System.out.println("燃料が足りません");
			return;
		}
			System.out.println( "現在位置は、" + ( x + movingDistance ) + "です。" );
			System.out.println( "残り燃料は、" + ( leave - Math.abs(movingDistance)) + "Lです。" );
	}

	//それぞれの情報を紹介するメソッドを作成
	public void showProfile() {
		System.out.println( "乗り物名は、" + vehicleNme + "です。" );
		System.out.println( "メーカーは、" + maker + "です。" );
		System.out.println( "購入日は、" + date + "です。" );
	}
	public void getMovingDistance(int movingDistance, int result) {
		System.out.println( "現在位置は、" + (x + movingDistance ) + "です。" );
		System.out.println( "残り燃料は、" + (leave - Math.abs(movingDistance)) + "Lです。" );
	}

}
