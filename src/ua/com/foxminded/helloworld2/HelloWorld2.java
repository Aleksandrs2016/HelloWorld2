package ua.com.foxminded.helloworld2;

public class HelloWorld2 {

	public static void main(String[] args) {
		float i = 6;
		float j = 7;
		float answer = j / i;
		float result;
		double d = 2.5;
		int hugeNumber = 521124244;
		boolean isMoreThanOne;
		boolean evenNumberIf;

		String message = "Helo World!";
		String stringAnswer = message + " " + answer;
		String words = "Java forever";
		String space = " ";
		String number = "-2";
		String oneMoreAnswer;

		if (answer > 1) {
			isMoreThanOne = true;
		} else {
			isMoreThanOne = false;
		}

		if (j % 2 == 0) {
			evenNumberIf = true;
		} else {
			evenNumberIf = false;
		}
		System.out.println((int) j + " Чётное число? (if..else) - " + evenNumberIf);

		if (i % 2 == 0) {
			evenNumberIf = true;
		} else {
			evenNumberIf = false;
		}
		System.out.println((int) i + " Чётное число (if..else) - " + evenNumberIf);

		result = answer + Integer.parseInt(number);
		oneMoreAnswer = message + " " + result;

		System.out.println(message);
		System.out.println(words);
		System.out.println(message + space + words);
		System.out.println((int) i + " / " + (int) j + " = " + answer);
		System.out.println((int) i + " + " + (int) j + " * " + d + " = " + (i + j * d));
		System.out.println(stringAnswer);
		System.out.println(oneMoreAnswer);
		System.out.println("Остаток от деления 521124244 / " + (int) i + " = " + hugeNumber % (int) i);
		System.out.println((int) j + " / " + (int) i + " > 1 ? " + isMoreThanOne);
		System.out.println((int) i + " Чётное число (метод) - " + evenNumber((int) i));
		System.out.println((int) j + " Чётное число (метод) - " + evenNumber((int) j));
	}

	static boolean evenNumber(int a) {

		return (a % 2 == 0);

	}

}
