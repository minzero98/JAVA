import java.util.Scanner;

/*첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.*/

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
