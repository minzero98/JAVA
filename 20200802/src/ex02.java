import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

public class ex02 {
	public static void main(String[] args) {
		int A;
		int B;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하시오.");
		A = sc.nextInt();
		B = sc.nextInt();
		
		sum = A + B;
		
		System.out.println("두 정수의 합은 : ");
		System.out.println(sum);
		
		sc.close();
	}

}
