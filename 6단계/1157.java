import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = fr.nextLine();
        //알파벳 별 등장 횟수를 저장할 배열
        int[] count = new int[26];
        //대소문자 따로 처리하기 귀찮으니 대문자로 통일
        str = str.toUpperCase();
        //입력받은 문자열을 순회하며 각 알파벳 별로 등장할 때마다 값 증가
        for(int i = 0; i < str.length(); i++)
        {
        	count[str.charAt(i) - 'A']++;
        }
        
        int maxValue = 0;
        //최대값 개수 판별을 위해 최대값 인덱스를 담을 arraylist max 선언
        ArrayList<Integer> max = new ArrayList<>();
        //최대값 찾기
        for(int i = 0; i < count.length; i++)
        {
        	if(count[i] > maxValue)
        		maxValue = count[i];
        }
        //최대값에 해당하는 인덱스를 max에 저장
        for(int i = 0; i < count.length; i++)
        	if(count[i] == maxValue)
        		max.add(i);
        //인덱스가 두 개 이상이면 ? 출력하고 한개면 해당 알파벳 출력
        if(max.size() > 1)
        	bw.write("?");
        else
        	bw.write(max.get(0) + 'A');
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
