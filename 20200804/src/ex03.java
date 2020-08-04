import java.util.Scanner;

/*세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. */

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = 0;

		if (a >= b && b >= c || a <= b && b <= c) {
			num = b;
		} else if (b >= a && a >= c || b <= a && a <= c) {
			num = a;
		} else
			num = c;

		System.out.println(num);
		sc.close();
	}

}
