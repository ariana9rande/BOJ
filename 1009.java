import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = fr.nextInt();
        
        for(int i = 0; i < t; i++)
        {
        	int a = fr.nextInt();
        	int b = fr.nextInt();
        	
        	int c = 1;
        	
        	for(int j = 0; j < b; j++)
        	{
        		c *= a;
        		c %= 10;
        	}
        	if(c == 0)
        		c = 10;
        	bw.write(c + "\n");
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
