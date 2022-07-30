import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = fr.nextInt();
        int k = fr.nextInt();
        int[] a = new int[n * 2];
        boolean[] robot = new boolean[n * 2];
        
        for(int i = 0; i < n * 2; i++)
        	a[i] = fr.nextInt();
        
        int first = -1;
        int zeroCount = 0;
        int ans = 0;
        
        while(true)
        {
        	ans++;
        	turn(a, robot);
        	
        	if(robot[n - 1])
        		robot[n - 1] = false;
        	
        	for(int i = n; i > 0; i--)
        		if(robot[i])
        		{
        			if(i != -1 && robot[i + 1] == false && a[i + 1] >= 1)
                	{
                		robot[i] = false;
                		robot[i + 1] = true;
                		a[i + 1]--;
                	}
        		}
        	
        	if(robot[n - 1])
        		robot[n - 1] = false;
        	
        	if(a[0] != 0)
        	{
        		robot[0] = true;
        		a[0]--;
        	}
        	
        	for(int i = 0; i < a.length; i++)
        		if(a[i] == 0)
        			zeroCount++;
        	if(zeroCount >= k)
        		break;
        	zeroCount = 0;
        }
        bw.write(ans + "");
        bw.flush();
    }
    
    public static void turn(int[] a, boolean[] b)
    {
    	int temp = a[a.length - 1];
    	boolean temp2 = b[b.length - 1];
    	
    	for(int i = a.length - 1; i > 0; i--)
    	{
    		a[i] = a[i - 1];
    		b[i] = b[i - 1];
    	}
    	a[0] = temp;
    	b[0] = temp2;
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
