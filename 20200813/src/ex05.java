import java.util.Scanner;

/*�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. 
���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, 
kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������,
aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.

�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int str[] = new int[100];
		int t = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			String s = sc.next();

			for (int j = 0; j < s.length(); j++) {
				str[j] = s.charAt(j);
			}
			for (int j = 0; j < s.length(); j++) {
				for (int k = j + 2; k < s.length(); k++) {
					if (str[j] == str[k - 1]) {

					} else if (str[j] == str[k]) {
						t = 1;
					}

				}

			}
			if (t == 0) {
				count++;
			}
			t = 0;

		}
		System.out.println(count);
		sc.close();
	}

}
