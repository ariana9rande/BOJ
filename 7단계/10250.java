import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = fr.nextInt();
        
        for(int i = 0; i < t; i++)
        {
        	int h = fr.nextInt();
        	int w = fr.nextInt();
        	int n = fr.nextInt();
        	
        	//첫번째 방은 101
        	int cnt = 1;
        	int floor = 1, room = 1;
        	
        	while(true)
        	{
        		//입력값에 해당하는 방에서 멈춤
        		if(cnt == n)
        			break;
        		//층을 증가시키다가
        		floor++;
        		cnt++;
        		//h 범위를 벗어나면
        		if(floor > h)
        		{
        			//방 번호를 증가시키고 1층부터 반복
        			floor = 1;
        			room++;
        		}
        	}
        	//방 번호가 10보다 작으면 앞에 0을 붙임
        	bw.write(floor + "" + (room < 10 ? "0" + room : room) + "\n");
        	
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
