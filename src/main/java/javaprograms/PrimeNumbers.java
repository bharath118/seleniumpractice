package javaprograms;

public class PrimeNumbers {

	public static void main(String[] args) {

		int k = 20;
		int flag;

		for (int i = 2; i <= k; i++) {
			flag = 0;
			for (int j = 1; j <= i; j++) {

				if (((i % j) == 0)) {

					flag++;
				}

			}

			if (flag == 2) {
				System.out.println(i + " is a prime no");
			}

		}

	}

}
