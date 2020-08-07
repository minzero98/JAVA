import java.util.Scanner;

/*어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 
1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. */

// 잘 모르겠음 2

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(hansu(n));
		sc.close();
	}

	public static int hansu(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i < 100) {
				count++;
			} else if (i < 1000) {
				int i1 = i % 10;
				int i2 = (i / 10) % 10;
				int i3 = (i / 100) % 10;

				if (i1 - i2 == i2 - i3) {
					count++;
				}
			}
		}
		return count;
	}

}
