import java.util.Scanner;

/*�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. 
�׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.*/

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum[] = new int[t];

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			sum[i] = a + b;
		}

		for (int i = 0; i < t; i++) {
			System.out.println("Case #" + (i + 1) + ": " + sum[i]);

		}

		sc.close();
	}

}
