import java.util.Scanner;

/*(A+B)%C�� ((A%C) + (B%C))%C �� ������?
(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000) */

public class ex05 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		sc.close();
	}
}
