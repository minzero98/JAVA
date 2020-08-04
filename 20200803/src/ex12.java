import java.util.Scanner;

/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
 입력의 마지막에는 0 두 개가 들어온다.(종료조건)*/

public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println(a + b);
			}
		}

		sc.close();
	}

}
