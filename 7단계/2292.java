import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int input = fr.nextInt();
        bw.write(beehive(input) + "");
        
        bw.flush();
    }
    
    public static int beehive(int n)
    {
    	int cnt = 0, six = 6, plus = 0, res = 2;
    	if(n == 1)
    		return 1;
    	//1이 아닌 경우
    	else
    	{
    		//2부터 n까지 증가하면서
    		for(int i = 2; i < n; i++)
    		{
    			cnt++;
    			//경로에 방에 2개 존재하는 2 ~ 7을 다 지나왔을 경우
    			if(cnt == six)
    			{
    				//다음 줄은 방이 6개 늘어나고
    				six += 6;
    				//거쳐가는 방의 수가 1 증가함
    				plus++;
    				//cnt값 초기화
    				cnt = 0;
    			}
    		}
    		//초기값 2와 늘어난 방의 수를 더해서 리턴
    		return res + plus;
    	}
    	
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
