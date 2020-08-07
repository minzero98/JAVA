import java.util.Scanner;

/*� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. N�� �־����� ��, 
1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

// �� �𸣰��� 2

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(hansu(n));
		sc.close();
	}

	public static int hansu(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i < 100) {
				count++;
			} else if (i < 1000) {
				int i1 = i % 10;
				int i2 = (i / 10) % 10;
				int i3 = (i / 100) % 10;

				if (i1 - i2 == i2 - i3) {
					count++;
				}
			}
		}
		return count;
	}

}
