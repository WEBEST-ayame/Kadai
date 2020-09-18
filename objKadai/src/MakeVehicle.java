/*[課題05] 課題04で作成した「Vehicleクラス」に対して、総走行距離を表すフィールドと、 値を取得するメソッドを追加した自動車クラス「Car」を作成してください。
 *  また、現在位置の移動時には、総走行距離に移動した距離を加えてください。。*/

public class MakeVehicle {

	public static void main(String[] args) {
		//インスタンス化し一回目の移動時の引数を渡す
		Car car1 = new Car("noah", "toyota", "2020/01/01",0, 10, 0);
		//Vehicleクラスで作成した現在位置と残り燃料の計算のメソッドとCarクラスで作成した総走行距離の計算のメソッドを呼び出し、移動距離を引数として渡す
		car1.showProfile();
		car1.getMovingDistance(30);
		//インスタンス化し二回目の移動時の引数を渡す
		Car car2 = new Car("noah", "toyota", "2020/01/01",30, 470 , 0);
		//Carクラスで作成した総走行距離の計算のメソッドを呼び出し、移動距離を引数として渡す
		car2.getMovingDistance(-50);
		//インスタンス化し三回目の移動時の引数を渡す
		Car car3 = new Car("noah", "toyota", "2020/01/01",-50, 420, 0);
		//Carクラスで作成した総走行距離の計算のメソッドを呼び出し、移動距離を引数として渡す
		car3.getMovingDistance(80);
	}

}
