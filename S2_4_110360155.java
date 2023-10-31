import java.io.*;
public class S2_4_110360155
{
    public static void main(String[]args) throws IOException
    {
        System.out.println("Please input an integer:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num==1)
        {
            System.out.println("The input number is 1");
        }
        else if(num==2)
        {
            System.out.println("The input number is 2");
        }
        else 
        {
            System.out.println("Please enter the numbers 1 or 2");
        }
    }
}