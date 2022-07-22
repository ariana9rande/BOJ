import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = fr.nextInt();
        int b = fr.nextInt();
        int v = fr.nextInt();
        
        int count = 0;
        
        //v에 도달한 날에도 내려간 것으로 가정하여 v - b를 목표로 잡고 a - b로 나눔. (v - b) % (a - b) != 0일 경우 올림
        count = (int)(Math.ceil((double)(v - b) / (a - b)));
        //v - a에 도달하면 다음날 a를 올라가면서 v에 도달하게 되므로 v - a를 목표로 잡고 결과값에 1을 더함. 마찬가지로 나머지가 있을 경우 올림
        //count = (int)(Math.ceil((double)(v - a) / (a - b)) + 1);
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
