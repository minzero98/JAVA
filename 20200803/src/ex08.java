import java.util.Scanner;

/*�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. 
x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.*/

public class ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int at[] = new int[t];
		int bt[] = new int[t];
		int sum[] = new int[t];

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			at[i] = a;
			bt[i] = b;
			sum[i] = a + b;
		}
		for (int i = 0; i < t; i++) {

			System.out.println("Case #" + (i + 1) + ": " + at[i] + " + " + bt[i] + " = " + sum[i]);

		}
		sc.close();
	}

}
