import java.util.*;
import java.io.*;

public class Main
{
	static boolean hansu(int n)
	{
		if(n < 100)
			return true;
		else if(n >= 100 && n < 1000)
		{
			int a = n / 100;
			int b = n % 100 / 10;
			int c = n % 10;
			
			if(a - b == b - c)
				return true;
			else
				return false;
		}
		else
		{
			int a = n / 1000;
			int b = n % 1000 / 100;
			int c = n % 100 / 10;
			int d = n % 10;
			
			if(a - b == b - c && a - b == c - d)
				return true;
			else
				return false;
		}
	}
	
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = fr.nextInt();
        int count = 0;
        
        for(int i = 1; i <= n; i++)
        {
        	if(hansu(i))
        		count++;
        }
        bw.write(count + "");
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
