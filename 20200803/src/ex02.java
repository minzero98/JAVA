import java.util.Scanner;

/* �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
�� �׽�Ʈ ���̽����� A+B�� ����Ѵ�. */

//�ٽ� �غ���

public class ex02 {
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
			System.out.println(sum[i]);
		}
		sc.close();
	}

}
