import java.util.Scanner;

/*���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
���ԵǾ� ���� ���� ��쿡��  -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[26]; //���ڿ� s�� �� ������ ��ġ�� ����ų �迭
		String s = sc.nextLine();

		for (int i = 0; i < n.length; i++) {
			n[i] = -1; //�迭 n = -1�� �ʱ�ȭ �� 
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); //charAt()�޼ҵ带 ����Ͽ� �������� -> ch�� ����

			if (n[ch - 'a'] == -1) {
				n[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}

		sc.close();
	}

}
