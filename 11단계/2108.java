import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = fr.nextInt();
        int[] arr = new int[n];
        
        double sum = 0;
        for(int i = 0; i < n; i ++)
        {
        	int input = fr.nextInt();
        	arr[i] = input;
        	sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        int count = 0;
		int maxCount = -1;
		int mod = arr[0];
		boolean check = false;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] == arr[i + 1])
			{
				count++;
			}
			else
			{
				count = 0;
			}
			
			if(count > maxCount)
			{
				maxCount = count;
				mod = arr[i];
				check = true;
			}
			else if(count == maxCount && check == true)
			{
				mod = arr[i];
				check = false;
			}
		}
        
        
		System.out.println(Math.round(sum / arr.length));
		System.out.println(arr[arr.length / 2]);
		System.out.println(mod);
		System.out.println(arr[arr.length - 1] - arr[0]);
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
