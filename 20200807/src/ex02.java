import java.util.Scanner;

/*N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.*/

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String n2 = sc.next();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += n2.charAt(i) - '0';
		}

		System.out.println(sum);
		sc.close();
	}

}
