import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = fr.nextInt();
        int a = 1;
        int b = 1;
        int i = 1;
        
        while(true)
        {
        	//입력값에 해당하는 번호에서 멈춤
        	if(n == i)
        		break;
        	//1/1에서 1/2로
        	if(a == 1 && b == 1)
        	{
        		b++;
        		i++;
        	}
        	//분자가 1이면
        	if(a == 1 && n != i)
        	{
        		//분자를 증가시키고 분모를 감소시킴
        		while(true)
        		{
        			a++;
        			b--;
        			i++;
        			//분모가 1이 되면 멈춤
        			if(b == 1 || n == i)
        				break;
        		}
        		//다음줄로 넘어감
        		if(b == 1 && n != i)
        		{
        			a++;
        			i++;
        		}
        	}
        	//분모가 1이면
        	else if(b == 1)
        	{
        		//분모를 증가시키고 분모를 감소시킴
        		while(true)
        		{
        			b++;
        			a--;
        			i++;
        			//분자가 1이 되면 멈춤
        			if(a == 1 || n == i)
        				break;
        		}
        		//다음줄로 넘어감
        		if(a == 1 && n != i)
        		{
        			b++;
        			i++;
        		}
        	}
        }
        bw.write(a + "/" + b);
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
