package hello.world;

import java.util.Scanner;

public class Se2As5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 2. Try different string functions
		String name = "Armstrong";

		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.hashCode());
		System.out.println(name.concat(" Moon"));
		System.out.println(name.contains("g M"));
		System.out.println(name.matches("Armstrong Moon"));
		System.out.println();

		// 3. Print first 100 even numbers
		int count1 = 0;
		for (int i = 0; i < 50; i++) {
			count1 = count1 + 2;
			System.out.print(count1 + " ");
		}

		System.out.println();

		// 4. Print the n odd numbers ,
		// starting from s , where both s and n are entered.
		int n = 20;
		int s = 4;

		if (s % 2 == 0)
			s++;

		for (int i = 0; i < 20; i++) {
			System.out.print(s + " ");
			s = s + 2;
		}

		System.out.println();

		// 5. Check for Primes from input
		int p = 7879;
		int check = 0;

		if (p != 0 || p != 1) {
			for (int i = 2; i <= (p / 2); i++) {
				if (p % i == 0) {
					check = 1;
					// System.out.println(p + " is divisible by " + i);
				}
			}
			if (check == 1)
				System.out.println(p + " is not prime.");
			else
				System.out.println(p + " is a prime number!");
		} else
			System.out.println(p + " is not prime.");
		System.out.println();

		// 6. Check for palindrome

		String str1 = "able was I ere I saw elba";
		String str1Rev = "";
		int strLength = str1.length();
		for (int i = strLength - 1; i >= 0; i--)
			str1Rev = str1Rev + str1.charAt(i);
		if (str1.equals(str1Rev))
			System.out.println(str1 + " is a palindrome.");
		else
			System.out.println(str1 + " is not a palindrome.");
		System.out.println();

		// 7. Check if a number is ArmStrong or not

		int arm = 153;
		String armCompare = Integer.toString(arm);
		int armInt = 0;
		strLength = armCompare.length();
		for (int i = 0; i < strLength; i++)
			armInt = (int) (armInt + Math.pow(Character.getNumericValue(armCompare.charAt(i)), 3));
		if (armInt == arm)
			System.out.println(arm + " is an Armstrong number.");
		else
			System.out.println(arm + " is not an Armstong number.");
		System.out.println();

		// 8. // Used as index in the modified string
		int index = 0;
		String remove = "Hello World";
		char str[] = remove.toCharArray();
		int dupCount = 0;
		for (int i = 0; i < str.length; i++) {

			int j;
			for (j = 0; j < i; j++)
				if (str[i] == str[j])
					break;

			if (j == i) {
				str[index++] = str[i];
				dupCount++;
			}
		}

		for (int i = 0; i < dupCount; i++)
			System.out.print(String.valueOf(str[i]));
		System.out.println();
		System.out.println();

		// 10. Answer B
		int x = 20;
		String sup = (x < 15) ? "small" : (x < 22) ? "tiny" : "huge";
		System.out.println(sup);

		// 11. Answer C
		int x1 = 0, y1 = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x1 > 2) && (++y1 > 2)) {
				x1++;
			}
		}
		System.out.println(x1 + " " + y1);

		// 12. Answer -2,2
		int x3 = -4;
		System.out.println(x3 >> 1);
		int y3 = 4;
		System.out.println(y3 >> 1);

		// 13. More than one public class in a single file?
		// No, the public class must share the same name as the source file.

		// 14. Can we execute a program without main method
		// No, mostly. Code contained within a static block will run, but amain method
		// must be invoked

		// 15. What is the difference b/w the >> and >>> operator?
		// >> is a signed right shift meaning it retains its negative, >>> is an
		// unsigned right shift.

		// 16. Which characters may be used as the second character of an identifier,
		// but not as the first character of an identifier?
		// Digits 0 through 9 cannot be used as the first but can be the second.

		// 17. Give an example where pass by value gives an error and pass by
		// reference rectifies the statement.
		// Java is pass by value only

		sc.close();
	}

}
