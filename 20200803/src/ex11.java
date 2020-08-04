import java.util.Scanner;

/*정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. 
X보다 작은 수는 적어도 하나 존재한다.*/

public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (x > a[i]) {
				System.out.print(a[i] + " ");
			}
		}

		sc.close();
	}

}
