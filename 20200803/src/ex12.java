import java.util.Scanner;

/*�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 �Է��� ���������� 0 �� ���� ���´�.(��������)*/

public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			} else {
				System.out.println(a + b);
			}
		}

		sc.close();
	}

}
