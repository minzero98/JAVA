import java.util.Scanner;

/*���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. 
����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, 
�̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�. 
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ� */

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum, over, count;
		double result, per;

		for (int i = 0; i < n; i++) {
			count = sc.nextInt();
			sum = 0;
			over = 0;
			result = 0.0;
			int score[] = new int[count];

			for (int j = 0; j < count; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}

			for (int j = 0; j < count; j++) {
				if (score[j] > (double) sum / count) {
					over++;
				}
			}

			result = (double) over / count * 100;
			
			per = Math.round(result * 1000) / 1000.0;

			System.out.printf("%.3f", per);
			System.out.println("%");
		}

		sc.close();
	}

}
