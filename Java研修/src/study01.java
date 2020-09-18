//[課題1]
//		1から30まで順番に数をコンソールに表示してください。
//		ただしその数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"両方で割り切れるなら"Fizzbuzz"と表示してください。
public class study01 {
	
	public static void main (String[] args) {
		for (int num = 1;num<31; num++) {
//			3で割り切れるときはFizzと表示
			if (num%3 == 0) {
				System.out.println("Fizz");
			}
//			5で割り切れるときはBuzzと表示
			if (num%5 == 0) {
				System.out.println("Buss");
			}
//			3と5で割り切れるときはFizzbuzzと表示
			if (num%3 ==0 && num%5 == 0) {
				System.out.println("Fizzbuzz");
			}
//			その他の数字の場合は数字を表示
			else {
				System.out.println(num);
			}
		}
	}

}
