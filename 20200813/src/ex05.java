import java.util.Scanner;

/*그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int str[] = new int[100];
		int t = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			String s = sc.next();

			for (int j = 0; j < s.length(); j++) {
				str[j] = s.charAt(j);
			}
			for (int j = 0; j < s.length(); j++) {
				for (int k = j + 2; k < s.length(); k++) {
					if (str[j] == str[k - 1]) {

					} else if (str[j] == str[k]) {
						t = 1;
					}

				}

			}
			if (t == 0) {
				count++;
			}
			t = 0;

		}
		System.out.println(count);
		sc.close();
	}

}
