
public class Sphere {
	//フィールド変数を定義
    private double radius;

    //コンストラクタ作成
    Sphere(double radius) {
        this.radius = radius;
    }

    //球の体積の計算メソッド
    public double volume() {
        return(4.0 / 3.0 * Math.PI * Math.pow(radius,3));
    }

    //球の表面積の計算メソッド
    public double areaOfSurface() {
        return(4.0 * Math.PI * Math.pow(radius,2));
    }
}
