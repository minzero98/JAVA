import java.util.Scanner;

/*�� ���� �ڿ��� A, B, C�� �־��� ��
A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� A = 150, B = 266, C = 427 �̶�� 
A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������. */

// �� ����

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a * b * c;
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			int tmp = result;

			while (tmp != 0) {
				if (tmp % 10 == arr[i]) {
					count++;
				}
				tmp /= 10;
			}
			
			System.out.println(count);

		}

		sc.close();
	}

}
