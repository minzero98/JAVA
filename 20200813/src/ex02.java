import java.util.Scanner;

/*상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 
이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다. 
상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.*/

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		n1 = Integer.parseInt(new StringBuilder().append(n1).reverse().toString());
		n2 = Integer.parseInt(new StringBuilder().append(n2).reverse().toString());
		
		/*위를 사용하기 위해 먼저 StringBuilder 생성과 동시에 append() 라는 메소드에 값을 넣어준다.
		이때 append()로 넣어진 값은 타입이 StringBuilder 라는 타입으로 변환된다.
		그리고 그렇게 저장된 수를 reverse() 라는 메소드를 통해 저장되어있던 문자열을 뒤집는다. 
		그리고 StringBuilder 타입을 문자열로 반환시키기 위해 toString() 을 써주면 끝이다.
		그리고 문자열로 반환시켰으니 Integer.parseInt() 로 String 을 int 로 타입을 변경시키면 끝이다.*/
		
		System.out.print(n1 > n2 ? n1 : n2);

		sc.close();
	}

}
