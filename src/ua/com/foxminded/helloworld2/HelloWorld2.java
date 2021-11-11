package ua.com.foxminded.helloworld2;

public class HelloWorld2 extends CheckNumber {

	public static void main(String[] args) {
		float i = 6;
		float j = 7;
		float answer = j / i;
		float result;
		double d = 2.5;
		int hugeNumber = 521124244;
		boolean isMoreThanOne;
//		boolean evenNumber;

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

		/*
		 * if (j % 2 == 0) { evenNumber = true; } else { evenNumber = false; }
		 * System.out.println(evenNumber);
		 * 
		 * if (i % 2 == 0) { evenNumber = true; } else { evenNumber = false; }
		 * System.out.println(evenNumber);
		 */

		System.out.println(evenNumber((int) i));

		result = answer + Integer.parseInt(number);
		oneMoreAnswer = message + " " + result;

		System.out.println(message);
		System.out.println(words);
		System.out.println(message + space + words);
		System.out.println(answer);
		System.out.println(i + j * d);
		System.out.println(stringAnswer);
		System.out.println(oneMoreAnswer);
		System.out.println(hugeNumber % (int) i);
		System.out.println(isMoreThanOne);
	}

}
