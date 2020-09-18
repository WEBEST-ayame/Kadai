
public class Circle {
	//フィールド変数を定義
    private double radius;

   //コンストラクタ作成
    Circle(double radius) {
        this.radius = radius;
    }

    //円の面積の計算メソッド
    public double area() {
        return(Math.PI * Math.pow(radius,2));
    }

    //円周の計算メソッド
    public double length() {
        return(2.0 * Math.PI * radius);
    }
}
