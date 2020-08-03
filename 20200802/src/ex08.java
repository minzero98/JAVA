import java.util.Scanner;

/* 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C,
 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.*/

public class ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(89<score)
			System.out.print("A");
		else if(79<score)
			System.out.print("B");
		else if(69<score)
			System.out.print("C");
		else if(59<score)
			System.out.print("D");
		else 
			System.out.print("F");

		/*
		switch(score/10) {
		case 9 : 
			System.out.println("A");
		case 8 :
			System.out.println("B");
		case 7 :
			System.out.println("C");
		case 6 :
			System.out.println("D");
		default :
			System.out.println("F");
		}
		*/
		
		sc.close();
	}

}
