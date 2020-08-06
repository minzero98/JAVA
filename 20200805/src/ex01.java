
import java.util.Arrays;
import java.util.Scanner;

/*N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.*/

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
//		int min = 0;
//		int max = 0;
//		int tmp = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		System.out.print(a[0] + " " + a[n - 1]);

//		tmp = a[0];
//		for (int i = 0; i < n; i++) {
//			if (tmp > a[i]) {
//				tmp = a[i];
//				min = tmp;
//
//			} else
//				min = tmp;
//
//			if (tmp < a[i]) {
//				tmp = a[i];
//				max = tmp;
//			} else
//				max = tmp;
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (tmp < a[i]) {
//				tmp = a[i];
//				max = tmp;
//			} else
//				max = tmp;
//		}
//
//		System.out.print(min + " " + max);
		sc.close();
	}

}
