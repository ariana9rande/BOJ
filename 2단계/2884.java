import java.util.*;

class Main
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int h = sc.nextInt();
    	int m = sc.nextInt();
    	
    	//시간에 60을 곱해 분과 더해주고 문제에 따라 45를 빼줌
    	m = h * 60 + m - 45;
    	
    	//m값이 0보다 작아졌을 경우 날짜가 바뀌므로 24시간을 더함
    	if(m < 0)
    		m += 1440;
    	
    	System.out.println(m / 60 + " " + m % 60);
    }
}
