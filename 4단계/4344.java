import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        FastReader fr = new FastReader();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int t = fr.nextInt();
        
        //테스트케이스 숫자만큼 반복
        for(int i = 0; i < t; i++)
        {
        	//테스트케이스마다 배열 따로 생성
        	ArrayList<Integer> arr = new ArrayList<>();
        	//배열당 입력받을 점수의 개수
        	int n = fr.nextInt();
        	
        	//배열에 점수 입력
        	for(int j = 0; j < n; j++)
        	{
        		int val = fr.nextInt();
        		arr.add(val);
        	}
        	
        	int sum = 0;
        	double avg = 0;
        	//합계 구한 다음 평균 구하기
        	for (int j = 0; j < arr.size(); j++)
        	{
        		sum += arr.get(j);
        	}
        	
        	avg = (double)sum / arr.size();
        	int count = 0;
        	//평균 넘는 학생 수 구하기
        	for (int j = 0; j < arr.size(); j++)
        	{
        		if(arr.get(j) > avg)
        			count++;
        	}
        	//문자열 포매팅 이용해서 형식에 맞게 출력
        	bw.write((String.format("%.3f", (double)count / arr.size() * 100)) + "%\n");
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
