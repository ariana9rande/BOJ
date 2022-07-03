import java.util.*;

class Main
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	
    	int prize;
    	
    	if(a == b && a == c)
    		prize = 10000 + 1000 * a;
    	else if(a == b || a == c)
    		prize = 1000 + 100 * a;
    	else if(b == c)
    		prize = 1000 + 100 * b;
    	else
    	{
    		prize = (a > b && a > c) ? a : (b > c) ? b : c;
    		prize *= 100;
    	}
    	
    	System.out.println(prize);
    }
}
