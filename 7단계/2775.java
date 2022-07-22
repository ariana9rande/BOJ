import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = fr.nextInt();
        for(int a = 0; a < t; a++)
        {
        	int k = fr.nextInt();
        	int n = fr.nextInt();
        	//사람수를 담을 배열
        	int[][] x = new int[15][15];
        	
        	//0층 i호는 i명
        	for(int i = 1; i < 15; i++)
        	{
        		x[0][i] = i;
        	}
        	
        	//k, n 범위가 1 ~ 14
        	for(int i = 1; i <= 14; i++)
        	{
        		for(int j = 1; j < 15; j++)
        		{
        			for(int m = 1; m <= j; m++)
        			{
        				//i층 j호는 i - 1층 1호 ~ j호 더한 값
        				x[i][j] += x[i - 1][m];
        			}
        		}
        	}
        	bw.write(x[k][n] + "\n");
        }
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
