import java.io.*;
public class S2_6_110360155
{
    public static void main(String[]args) throws IOException
    {
        System.out.println("Please input the letters a or b");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        char letter = str.charAt(0);
        
        switch(letter)
        {
            case 'a':
                {
                 System.out.println("The input letter is a");
                 break;
                }
            case 'b':
                {
                 System.out.println("The input letter is b");
                 break;
                }
            default:
                {
                 System.out.println("Please input the letters a or b");
                 break;
                }
            
        }
    }
}
