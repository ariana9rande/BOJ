import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = fr.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i ++)
        {
        	int input = fr.nextInt();
        	arr.add(input);
        }
        //삽입정렬
        for(int i = 0; i < arr.size(); i++)
        {
        	for(int j = i; j > 0; j--)
        	{
        		if(arr.get(j) < arr.get(j - 1))
        		{
        			int temp = arr.get(j);
        			arr.set(j, arr.get(j - 1));
        			arr.set(j - 1, temp);
        		}
        	}
        }
        
        for(int i = 0; i < arr.size(); i++)
        {
        	bw.write(arr.get(i) + "\n");
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
