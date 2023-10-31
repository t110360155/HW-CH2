import java.io.*;
public class S2_7_110360155
{
    public static void main(String[]args) throws IOException
    {
        System.out.println("Are you a boy?");
        System.out.println("Please enter Y or N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        char letter = str.charAt(0);
        
        if(letter=='Y' || letter=='y')
        {
            System.out.println("You are a boy!");
        }
        else if(letter=='N' || letter=='n')
        {
            System.out.println("You are a girl!");
        }
        else 
        {
            System.out.println("Please enter Y or N");
        }
    }
}
