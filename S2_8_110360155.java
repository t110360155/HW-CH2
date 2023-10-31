import java.io.*;
public class S2_8_110360155
{
    public static void main(String[]args) throws IOException
    {
        System.out.println("Which route you want to choose?");
        System.out.println("Please input an integer");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int res = Integer.parseInt(str);
        
        char ans = (res == 1)?'A':'B';
        
        System.out.println("Route " + ans + " was chosen");
    }
}
