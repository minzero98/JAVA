import java.util.Scanner;

/*��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� 
�� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.
�� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, 
��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ١� 
�� ��� ������ �� ��Ű�� ���;� �Ѵ�.
����Ʈ�� ����ִ� ���� ���� ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, 
�־����� ���� ���� k�� n�� ���� k���� nȣ���� �� ���� ��� �ִ��� ����϶�. 
��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������, 0���� iȣ���� i���� ���.*/
//�� ����

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] apart = new int[15][14];
		for (int i = 0; i < 14; i++) {
			apart[0][i] = i + 1;
		}
		for (int i = 1; i <= 14; i++) {
			for (int j = 0; j < 14; j++) {
				for (int q = 0; q <= j; q++) {
					apart[i][j] += apart[i - 1][q];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			int a = sc.nextInt();

			System.out.println(apart[k][a - 1]);

		}
		sc.close();
	}

}
