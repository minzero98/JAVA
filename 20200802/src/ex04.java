import java.util.Scanner;

/*�� �ڿ��� A�� B�� �־�����. 
 �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 �� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000) */
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
