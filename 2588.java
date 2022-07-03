import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans1 = a * (b % 10);
    int ans2 = a * ((b % 100) / 10);
    int ans3 = a * (b / 100);
    
    System.out.println(ans1);
    System.out.println(ans2);
    System.out.println(ans3);
    System.out.println(a * b);
  }
}
