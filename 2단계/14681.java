import java.util.*;

class Main
{
	static int check(int x, int y)
	{
		if(x > 0)
			if(y > 0)
				return 1;
			else
				return 4;
		else
			if(y > 0)
				return 2;
			else
				return 3;
	}
	
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	
    	System.out.println(check(x, y));
    }
}
