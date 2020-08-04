import java.util.Scanner;

/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.*/

public class ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int at[] = new int[t];
		int bt[] = new int[t];
		int sum[] = new int[t];

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			at[i] = a;
			bt[i] = b;
			sum[i] = a + b;
		}
		for (int i = 0; i < t; i++) {

			System.out.println("Case #" + (i + 1) + ": " + at[i] + " + " + bt[i] + " = " + sum[i]);

		}
		sc.close();
	}

}
