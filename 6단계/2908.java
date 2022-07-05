import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = fr.next();
        String b = fr.next();
        
        //뒤집어서 저장할 문자열 생성
        String new_a = "";
        String new_b = "";
        
        //for문을 거꾸로 돌려서 역순으로 저장
        for(int i = a.length(); i > 0; i--)
        {
        	new_a += a.charAt(i - 1);
        	new_b += b.charAt(i - 1);
        }
        //비교해서 큰 문자열 출력
        if(new_a.compareTo(new_b) > 0)
        	bw.write(new_a + "");
        else
        	bw.write(new_b + "");
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
