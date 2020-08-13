import java.util.Scanner;

/*알파벳 대소문자로 된 단어가 주어지면, 
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
단, 대문자와 소문자를 구분하지 않는다.

첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.*/

public class ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				n[s.charAt(i) - 'A']++;
			} else {
				n[s.charAt(i) - 'a']++;
			}
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
				ch = (char) (i + 65);
			} else if (n[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);

		sc.close();
	}

}
