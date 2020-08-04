import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. 
����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�
Java�� ����ϰ� �ִٸ�, 
Scanner�� System.out.println ���
BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

�� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.*/
/* BufferedReader, BufferedWriter */

public class ex04 {
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());
		int[] array = new int[t];

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			array[i] = a + b;
		}

		for (int output : array) {
			bw.write(String.valueOf(output));
			bw.newLine();
		}
		bw.flush(); // �����ִ� ������ ��� ���
		bw.close(); // ��Ʈ���� ����
	}

}
