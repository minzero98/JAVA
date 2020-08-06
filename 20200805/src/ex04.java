import java.util.Scanner;

/*두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오. */

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			b[i] = a[i] % 42;
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < i; j++) {
				if (b[i] == b[j]) {
					count--;
					break;
				}
			}
			count++;
		}

		System.out.print(count);
		sc.close();
	}

}
