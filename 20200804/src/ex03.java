import java.util.Scanner;

/*�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = 0;

		if (a >= b && b >= c || a <= b && b <= c) {
			num = b;
		} else if (b >= a && a >= c || b <= a && a <= c) {
			num = a;
		} else
			num = c;

		System.out.println(num);
		sc.close();
	}

}
