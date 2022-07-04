import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //ArrayList<Integer> arr = new ArrayList<>();
        
        int n = fr.nextInt();
        double[] arr = new double[n];
        
        for(int i = 0; i < n; i++)
        {
        	int input = fr.nextInt();
        	arr[i] = input;
        }
        
        int max = (int)arr[0];
        
        for(int i = 0; i < arr.length; i++)
        {
        	if(arr[i] > max)
        		max = (int)arr[i];
        }
        
        double sum = 0;
        
        for(int i = 0; i < arr.length; i++)
        	sum += arr[i];
        
        bw.write(sum / arr.length / max * 100 + "");
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
