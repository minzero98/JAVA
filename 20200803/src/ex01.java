import java.util.Scanner;

/*N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 ������İ� ���� N*1���� N*9���� ����Ѵ�*/

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
		sc.close();
	}

}
