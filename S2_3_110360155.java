import java.io.*;
public class S2_3_110360155
{
    public static void main(String[]args) throws IOException
    {
        System.out.println("Please input an integer:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num==1)
        {
            System.out.println("The input is 1");
        }
        else
        {
            System.out.println("Selection is not number 1");
        }
    }
}
