import java.io.IOException;
public class S2_17_110360155
{
    public static void main(String[]args) throws IOException
    {
        int[]test;
        test = new int[5];
        
        test[0] = 80;
        test[1] = 60;
        test[2] = 22;
        test[3] = 50;
        test[4] = 75;
        
        test[10] = 75;
        
        for(int i=0; i<5; i++)
        {
            System.out.println("The person " +(i+1)+ "'s grade is " +test[i]+ "points");  
        }
    }
}