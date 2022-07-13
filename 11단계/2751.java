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
        //시간복잡도 O(nlogn)인 퀵소트 
        quick_sort(arr, 0, arr.size() - 1);
        
        for(int i = 0; i < arr.size(); i++)
        {
        	bw.write(arr.get(i) + "\n");
        }
        bw.flush();
    }
    
    public static void quick_sort(ArrayList<Integer> arr, int start, int end)
    {
    	if(start >= end)
    		return;
    	
    	int pivot = start;
    	int left = start + 1;
    	int right = end;
    	
    	while(left <= right)
    	{
    		while(left <= end && arr.get(left) <= arr.get(pivot))
    			left++;
    		while(right > start && arr.get(right) >= arr.get(pivot))
    			right--;
    		
    		if(left > right)
    		{
    			int temp = arr.get(pivot);
    			arr.set(pivot, arr.get(right));
    			arr.set(right, temp);
    		}
    		else
    		{
    			int temp = arr.get(right);
    			arr.set(right, arr.get(left));
    			arr.set(left, temp);
    		}
    	}
    	quick_sort(arr, start, right - 1);
    	quick_sort(arr, right + 1, end);
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
