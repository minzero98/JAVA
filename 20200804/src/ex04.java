import java.util.Scanner;

/*ù° �ٺ��� 2��N-1��° �ٱ��� ���ʴ�� ���� ����Ѵ�.*/

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
