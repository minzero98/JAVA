import java.util.Scanner;

/*������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.

����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. 
���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. 
����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.

�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		n1 = Integer.parseInt(new StringBuilder().append(n1).reverse().toString());
		n2 = Integer.parseInt(new StringBuilder().append(n2).reverse().toString());
		
		/*���� ����ϱ� ���� ���� StringBuilder ������ ���ÿ� append() ��� �޼ҵ忡 ���� �־��ش�.
		�̶� append()�� �־��� ���� Ÿ���� StringBuilder ��� Ÿ������ ��ȯ�ȴ�.
		�׸��� �׷��� ����� ���� reverse() ��� �޼ҵ带 ���� ����Ǿ��ִ� ���ڿ��� �����´�. 
		�׸��� StringBuilder Ÿ���� ���ڿ��� ��ȯ��Ű�� ���� toString() �� ���ָ� ���̴�.
		�׸��� ���ڿ��� ��ȯ�������� Integer.parseInt() �� String �� int �� Ÿ���� �����Ű�� ���̴�.*/
		
		System.out.print(n1 > n2 ? n1 : n2);

		sc.close();
	}

}
