import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> arr = new ArrayList<>();
        
        int n = fr.nextInt();
        String str = "";
        int count = 0, sum = 0;
        
        for(int i = 0; i < n; i++)
        {
        	str += fr.nextLine();
        	arr.add(str);
        	str = "";
        }
        
        for(int i = 0; i < n; i++)
        {
        	for(int j = 0; j < arr.get(i).length(); j++)
        	{
        		if(arr.get(i).charAt(j) == 'O')
        			count++;
        		else
        			count = 0;
        		sum += count;
        	}
        	bw.write(sum + "\n");
        	count = 0;
        	sum = 0;
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
