import java.util.Scanner;

/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.*/

public class ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			// hasNext를 조건으로 사용하여 while loop에서 벗어나는 방법
			// Scanner는 "파일 끝" 조건을 찾을 때까지 계속 읽음 (eof 문자 사용)
			// -----> 즉, sc.hasNext() : while반복문으로 데이터가 있을 때까지 반복함을 나타냄
			
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);

		}

		sc.close();
	}

}
