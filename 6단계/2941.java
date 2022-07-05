import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //단어들을 배열에 저장 - z=는 dz=에 포함되므로 dz= 먼저 처리하도록 순서 조정
        String[] words = {"c=", "c-", "d-", "lj", "nj", "s=", "dz=", "z="};
        
        String str = fr.nextLine();
        //입력받은 문자열 중 크로아티아 알파벳이 있는 경우 .로 치환해서 한 글자로 취급
        for(int i = 0; i < words.length; i++)
        {
        	str = str.replace(words[i], ".");
        }

        bw.write(str.length() + "");
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
