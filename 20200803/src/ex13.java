import java.util.Scanner;

/*�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			// hasNext�� �������� ����Ͽ� while loop���� ����� ���
			// Scanner�� "���� ��" ������ ã�� ������ ��� ���� (eof ���� ���)
			// -----> ��, sc.hasNext() : while�ݺ������� �����Ͱ� ���� ������ �ݺ����� ��Ÿ��
			
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);

		}

		sc.close();
	}

}
