import java.util.Scanner;

/*(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오. */

// 다시 해보기
public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //(1)
		int b = sc.nextInt(); //(2)

		
		System.out.println(a*(b%10));
		System.out.println(a*(b%100 - b%10)/10);
		System.out.println(a*(b/100));

		System.out.println(a*b);
		
		sc.close();
	}

}
