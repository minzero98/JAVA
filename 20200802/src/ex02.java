import java.util.Scanner;

//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)

public class ex02 {
	public static void main(String[] args) {
		int A;
		int B;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �Է��Ͻÿ�.");
		A = sc.nextInt();
		B = sc.nextInt();
		
		sum = A + B;
		
		System.out.println("�� ������ ���� : ");
		System.out.println(sum);
		
		sc.close();
	}

}
