import java.util.Scanner;

/*두 자연수 A와 B가 주어진다. 
 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000) */
public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
		
		sc.close();
	}

}
