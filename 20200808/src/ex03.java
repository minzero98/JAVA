import java.util.Scanner;

/*���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
�� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.*/

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				n[s.charAt(i) - 'A']++;
			} else {
				n[s.charAt(i) - 'a']++;
			}
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
				ch = (char) (i + 65);
			} else if (n[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);

		sc.close();
	}

}
