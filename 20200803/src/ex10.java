import java.util.Scanner;

/*ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.*/

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = (n + 1) - i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
