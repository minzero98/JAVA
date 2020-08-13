import java.util.Scanner;

/*알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
포함되어 있지 않은 경우에는  -1을 출력하는 프로그램을 작성하시오.*/

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[26]; //문자열 s에 각 문자의 위치를 가리킬 배열
		String s = sc.nextLine();

		for (int i = 0; i < n.length; i++) {
			n[i] = -1; //배열 n = -1로 초기화 됨 
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i); //charAt()메소드를 사용하여 문자추출 -> ch에 저장

			if (n[ch - 'a'] == -1) {
				n[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}

		sc.close();
	}

}
