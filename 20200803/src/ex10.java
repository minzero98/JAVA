import java.util.Scanner;

/*첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.*/

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = (n + 1) - i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
