import java.util.Scanner;

/*������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 
1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
������, 2000���� 400�� ����̱� ������ �����̴�.
*/

public class ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			System.out.print(1);
		else 
			System.out.print(0);
		
		sc.close();
	}

}
