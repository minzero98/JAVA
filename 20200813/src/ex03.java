import java.util.Scanner;

/*������� �ҸӴϴ� �Ʒ� �׸��� ���� ������ ���̾� ��ȭ�⸦ ����Ѵ�.
��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�,���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. ���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.
���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 
1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���,�� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. 
��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. 
���� ���, UNUCIC�� 868242�� ����.

�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {

			case 'A':
			case 'B':
			case 'C':
				count += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				count += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				count += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				count += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				count += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				count += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				count += 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				count += 10;
				break;
			}
		}
		System.out.print(count);

		sc.close();
	}

}
