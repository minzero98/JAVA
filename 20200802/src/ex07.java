import java.util.Scanner;

/*�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
			System.out.print(">");
		else if(a<b)
			System.out.print("<");
		else if(a==b)
			System.out.print("==");
		
		sc.close();
	}

}
