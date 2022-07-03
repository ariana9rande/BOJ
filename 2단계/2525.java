import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int m = sc.nextInt();
    int cook = sc.nextInt();
    
    //시간에 60을 곱해 분과 더해주고 요리시간을 더함
    m = h * 60 + m + cook;
    
    //24:00을 넘어간 경우을 대비해 1440보다 큰 경우 빼줌
    m %= 1440;
    
    h = m / 60;
    m %= 60;
    System.out.println(h + " " + m);
  }
}
