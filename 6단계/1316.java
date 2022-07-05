import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //알파벳이 나왔는지 확인하기 위한 boolean 배열 생성
        Boolean[] check = new Boolean[26];
        //false로 초기화
        for(int i = 0; i < 26; i++)
        {
        	check[i] = false;
        }
        int n = fr.nextInt();
        //테스트케이스의 개수로 초기화
        int count = n;
        
        for(int i = 0; i < n; i++)
        {
        	String str = fr.nextLine();
        	
        	//현재와 이전 인덱스의 알파벳값을 저장할 now, prev 선언
        	int now, prev;
        	//두번째 인덱스부터 순회할 것이므로 check 첫번째 인덱스 값에 true 대입
        	check[str.charAt(0) - 'a'] = true;
        	for(int j = 1; j < str.length(); j++)
        	{
        		//알파벳에 - 'a'를 해주어 인덱스 접근
        		now = str.charAt(j) - 'a';
        		prev = str.charAt(j - 1) - 'a';
        		//알파벳이 연속되지 않았을 경우
        		if(now != prev)
        		{
        			//현재 알파벳이 이전에 나온 적이 있으면
        			if(check[now])
        			{
        				//System.out.println("now : " + now + " prev : " + prev);
        				//System.out.println("check[" + now + "] : " + check[now] + " check[" + prev + "] : " + check[prev]);
        				//그룹 단어 수를 감소시키고, 한 단어에서 그룹 단어에 위배되는 경우가 여러 번일 경우 값을 여러번 뺄 수 있으니 break해줌
        				count--;
        				break;
        			}
        		}
        		//문제가 없으면 현재의 알파벳을 true 처리해주고 다음 인덱스로 넘어감
        		check[now] = true;
        	}
        	//한 단어가 끝날 때마다 check를 false로 초기화
        	for(int j = 0; j < 26; j++)
            {
            	check[j] = false;
            }
        }
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
