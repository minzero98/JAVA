import java.util.Scanner;

/*���� N���� �̷���� ���� A�� ���� X�� �־�����. 
�̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. 
X���� ���� ���� ��� �ϳ� �����Ѵ�.*/

public class ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (x > a[i]) {
				System.out.print(a[i] + " ");
			}
		}

		sc.close();
	}

}
