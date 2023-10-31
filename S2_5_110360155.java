import java.io.*;
public class S2_5_110360155
{
    public static void main(String[]args) throws IOException
    {
        System.out.println("Please input an integer:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        switch(num)
        {
            case 1:
                {
                 System.out.println("The input number is 1");
                 break;
                }
            case 2:
                {
                 System.out.println("The input number is 2");
                 break;
                }
            default:
                {
                 System.out.println("Please input the numbers 1 or 2");
                 break;
                }
            
        }
       
    }
}