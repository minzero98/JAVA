import java.util.Scanner;

/*(�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
(3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */

// �ٽ� �غ���
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
