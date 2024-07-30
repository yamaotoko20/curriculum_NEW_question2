package curriculum_New_question2;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// 引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
	public static void printMessage(String str, int num) {
		System.out.println(str + " " + num);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// 引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
	public static void multiplyNumbers(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("乗算結果: " + result);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// 引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// Q2のメソッドをオーバーロードして、引数を小数2つに変更し、引数同士を和算してコンソールに出力するメソッド
	public static void multiplyNumbers(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("和算結果: " + result);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// 引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して、格納した値を返すメソッド
	public static int[] storeRandomNumbers(int count) {
		Random random = new Random();
		int[] numbers = new int[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = random.nextInt(100) + 1; // 1から100までのランダムな数字を格納
		}
		return numbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// 引数にQ5で作成したメソッドの返り値を受け取り、配列の要素の平均値を計算してコンソールに出力するメソッド
	public static double calculateAverage(int[] numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		double average = (double) sum / numbers.length;
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	// 引数にQ6で作成したメソッドの返り値を受け取り、50以上ならtrue、それ以外はfalseを返すメソッド
	public static boolean checkValue(double value) {
		return value >= 50;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		//Q1
		printMessage("Hello JavaSE", 11);

		//Q2
		multiplyNumbers(5, 3);

		//Q3
		int[] numbers = { 1, 2, 3, 4, 5 };
		printArray(numbers);

		//Q4
		// Q2のメソッドをオーバーロードして和算メソッドを呼び出す
		multiplyNumbers(2.5, 3.7);

		//Q5
		// メソッドを呼び出して、ランダムな数字を格納し、出力する
		int[] randomNumbers = storeRandomNumbers(5);
		for (int num : randomNumbers) {
			if (num != 0) {
				System.out.println(num);
			}
		}

		//Q6
		// Q5で作成したメソッドの返り値を受け取り、平均値を出力する

		double average = calculateAverage(randomNumbers);
		System.out.println("配列の平均値: " + average);

		//Q7
		// Q6で作成したメソッドの返り値を受け取り、50以上かどうかを判定して出力する
		boolean result = checkValue(average);
		System.out.println(result);

	}
}
