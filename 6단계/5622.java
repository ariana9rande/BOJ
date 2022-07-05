import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //다이얼 번호마다 해당되는 알파벳 저장
        String[] arr = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        
        String str = fr.nextLine();
        
        int answer = 0;
        //입력받은 문자열을 순회하면서
        for(int i = 0; i < str.length(); i++)
        {
        	//contains()를 쓰려면 char가 아닌 String이어야 돼서 charAt()값을 String으로 변환
        	String temp = "";
        	temp += str.charAt(i);
        	//입력받은 문자열의 한 글자마다 arr를 돌면서 어느 번호에 해당되는지 확인
        	for(int j = 0; j < arr.length; j++)
        	{
        		//번호 j에 해당될 경우
        		if(arr[j].contains(temp))
        		{
        			//해당 번호에 필요한 시간을 더함
        			answer += j + 1;
        		}
        	}
        }
        bw.write(answer + "");
        bw.flush();
    }
    
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException {
        	br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
        	while (st == null || !st.hasMoreElements()) {
        		try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            } return st.nextToken(); }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str; } }
}
