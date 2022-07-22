import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = fr.nextInt();
        int count = 0;
        //n이 음수가 되지 않도록 n에서 5씩 빼봄
        while(n >= 5)
        {
        	n -= 5;
        	count++;
        }
        
        //5씩 빼고 나서
        while(count >= 0)
        {
        	//3으로 나눠 떨어질 경우
        	if(n % 3 == 0)
        	{
        		//while문 탈출
        		count += n / 3;
        		break;
        	}
        	//3으로 나눠 떨어지지 않으면
        	else
        	{
        		//5씩 증가시키면서 count 감소 -> count가 음수가 되면 while문 탈출
        		n += 5;
        		count--;
        	}
        }
        //count가 음수면 -1 출력 아니면 count 출력
        bw.write(count < 0 ? -1 + "" : count + "");
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
