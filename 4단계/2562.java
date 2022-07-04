import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int n = 9;
        
        for(int i = 0; i < n; i++)
        {
        	int val = fr.nextInt();
        	arr.add(val);
        }
        
        int maxValue = 0;
        int maxIndex = -1;
        
        for(int i = 0; i < n; i++)
        {
        	if(arr.get(i) > maxValue)
        	{
        		maxValue = arr.get(i);
        		maxIndex = i;
        	}
        }
        
        bw.write(maxValue + "\n" + (maxIndex + 1));
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
