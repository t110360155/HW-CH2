import java.io.*;

public class S2_13_110360155
{
    public static void main(String[]args) throws IOException
    {
        System.out.println("What loop you want to terminate looping?(1~10)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String str = br.readLine();

      int res = Integer.parseInt(str);
      
        for(int i=1; i<=10; i++)
        {
            System.out.println("The number " +i+ " of the process");  
            if(i==res)
            break;
        }
    }
}
