import java.util.Scanner;

/*9���� ���� �ٸ� �ڿ����� �־��� ��, 
�̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���, ���� �ٸ� 9���� �ڿ���
3, 29, 38, 12, 57, 74, 40, 85, 61
�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.*/

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];
		int max = 0;
		int count = 0;

		for (int i = 0; i < 9; i++) {
			a[i] = sc.nextInt();
		}

		max = a[0];

		for (int i = 0; i < 9; i++) {
			if (max < a[i]) {
				max = a[i];
				count = i;
			}

		}

		System.out.println(max);
		System.out.print(count + 1);
		sc.close();
	}

}
