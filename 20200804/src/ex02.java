import java.util.Scanner;

/*��ٳ��忡�� ���� �� �ȸ��� �޴��� ��Ʈ �޴��̴�.
�ֹ��� ��, �ڽ��� ���ϴ� �ܹ��ſ� ���Ḧ �ϳ��� ���, ��Ʈ�� �����ϸ�,
������ �հ迡�� 50���� �� ������ ��Ʈ �޴��� ������ �ȴ�.
�ܹ��Ŵ� �� 3���� �������, �ߴ�����, �ϴ����Ű� �ְ�, ����� �ݶ�� ���̴� �� ������ �ִ�.
�ܹ��ſ� ������ ������ �־����� ��, ���� �� ��Ʈ �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է��� �� �ټ� ���̴�. 
ù° �ٿ��� �������, ��° �ٿ��� �ߴ�����, ��° �ٿ��� �ϴ������� ������ �־�����. 
��° �ٿ��� �ݶ��� ����, �ټ�° �ٿ��� ���̴��� ������ �־�����. */

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int burger[] = new int[3];
		int drink[] = new int[2];
		int bmin = 0;
		int dmin = 0;
		int tmp = 0;

		for (int i = 0; i < 3; i++) {
			burger[i] = sc.nextInt();
		}

		tmp = burger[0];

		for (int i = 0; i < 3; i++) {
			if (tmp > burger[i]) {
				tmp = burger[i];
				bmin = tmp;
			} else {
				bmin = tmp;
			}
		}

		for (int j = 0; j < 2; j++) {
			drink[j] = sc.nextInt();
		}
		tmp = drink[0];
		for (int j = 0; j < 2; j++) {
			if (tmp > drink[j]) {
				tmp = drink[j];
				dmin = tmp;
			} else {
				dmin = tmp;
			}
		}

		System.out.println(bmin + dmin - 50);
		sc.close();
	}

}
