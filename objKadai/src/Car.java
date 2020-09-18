/*[課題05] 課題04で作成した「Vehicleクラス」に対して、総走行距離を表すフィールドと、 値を取得するメソッドを追加した自動車クラス「Car」を作成してください。
 *  また、現在位置の移動時には、総走行距離に移動した距離を加えてください。。*/

public class Car extends Vehicle {
	//総走行距離のフィールド変数を定義
	private int mileage;
	//コンストラクタ作成
	Car(String vehicleNme, String maker, String date, int x, int leave, int mileage) {
		super(vehicleNme, maker, date, x, leave);
		this.mileage = mileage;
	}
	//setter、getterでそれぞれのメソッドを作成
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	//オーバーライドでVehicleクラスで作成したメソッドに移動距離が残り燃料を上回る時とそうで無い時に場合わけし総走行距離の計算を追加
	@Override
	public void getMovingDistance(int movingDistance) {
		int mileage =  Math.abs(super.getX()) + Math.abs(movingDistance);
		//移動距離が残り燃料を上回る時の計算
		if (Math.abs(movingDistance) > getLeave()) {
			super.getMovingDistance(movingDistance);
			int shortage = Math.abs(super.getX()) + getLeave();
			System.out.println("総走行距離は、" + shortage + "です。");
			return;
		}
		super.getMovingDistance(movingDistance);
		System.out.println( "総走行距離は、" + mileage + "です。" );
	}

}
