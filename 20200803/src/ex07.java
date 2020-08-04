import java.util.Scanner;

/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 
테스트 케이스 번호는 1부터 시작한다.*/

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum[] = new int[t];

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			sum[i] = a + b;
		}

		for (int i = 0; i < t; i++) {
			System.out.println("Case #" + (i + 1) + ": " + sum[i]);

		}

		sc.close();
	}

}
