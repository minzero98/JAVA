import java.util.Arrays;
import java.util.Scanner;

/*�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. 
 �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. 
 �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾�����
 ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score[] = new int[n];
		double nscore[] = new double[n];
		double max = 0;
		double sum = 0;

		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		}

		Arrays.sort(score);
		max = score[n - 1];

		for (int i = 0; i < n; i++) {

			nscore[i] = (score[i] / max) * 100;
			sum += nscore[i];

		}
		System.out.print(sum/n);
		sc.close();
	}

}
