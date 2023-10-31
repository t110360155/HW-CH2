import java.io.*;
import java.util.Collections;
import java.util.Arrays;

public class S2_21_110360155
{
    public static void main(String[]args) throws IOException
    {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Please enter 5 scores");
        
    Integer test[] = new Integer[5];
        
        for(int i=0; i<test.length; i++)
        {
            String str = br.readLine();
            test[i]=Integer.parseInt(str);
        }
        Arrays.sort(test,Collections.reverseOrder());
        for(int i=0; i<test.length; i++)
        {
            System.out.println("The number " +(i+1)+ "'s place score is " +test[i]);
        }
    }
}
