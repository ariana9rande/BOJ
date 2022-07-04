import java.util.*;
import java.io.*;

public class Main
{
	static int d(int n)
	{
		int res = n;
		while(n > 0)
		{
			res += n % 10;
			n /= 10;
		}
		return res;
	}
	
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] check = new boolean[12000];
        
        for(int i = 1; i < 10000; i++)
        {
        	check[d(i)] = true;
        }
        
        for(int i = 1; i < 10000; i++)
        {
        	if(check[i] == false)
        		bw.write(i + "\n");
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
