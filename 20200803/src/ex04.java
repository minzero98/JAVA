import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 
입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다
Java를 사용하고 있다면, 
Scanner와 System.out.println 대신
BufferedReader와 BufferedWriter를 사용할 수 있다. 
BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.*/
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
		bw.flush(); // 남아있는 데이터 모두 출력
		bw.close(); // 스트림을 닫음
	}

}
