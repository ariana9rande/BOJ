import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = fr.nextInt();
        int n = fr.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int sum = 0, min = 0, check = 0;
        
        for(int i = m; i <= n; i++)
        	if(isPrime(i))
        	{
        		sum += i;
        		arr.add(i);
        		if(check == 0)
        		{
        			min = i;
        			check = 1;
        		}
        	}
        
        bw.write(check == 0 ? "-1" : sum + "\n" + min);
        bw.flush();
    }

    public static boolean isPrime(int n)
    {
    	if(n == 1)
    		return false;
    	for(int i = 2; i <= (int)Math.pow(n, 0.5); i++)
    	{
    		if(n % i == 0)
    			return false;
    	}
    	return true;
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
