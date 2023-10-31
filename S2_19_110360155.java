public class S2_19_110360155
{
    public static void main(String[]args)
    {
        int[]test = {80,60,22,50,75};
        
        for(int i=0; i<test.length; i++)
        {
            System.out.println("The person " +(i+1)+ "'s grade is " +test[i]+ " points");  
        }
        System.out.println("There are " +test.length+ " people taking the test"); 
    }
}
