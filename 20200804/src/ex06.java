import java.util.Scanner;

/*ù° �ٺ��� ���ʴ�� ���� ����Ѵ�.
 * �� ������ */

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < 2 * n; i++) {

			if (i % 2 == 1) {
				for (int j = 0; j < n; j++) {
					if (j % 2 == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}

			else {
				for (int j = 0; j < n; j++) {
					if (j % 2 == 1) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}

			System.out.println();
		}
		sc.close();

	}
}
