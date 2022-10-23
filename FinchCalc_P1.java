import com.birdbraintechnologies.Finch;

public class FinchCalcP1
{
    public static void main(String[] args)
    {
        Finch jeroo = new Finch();
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Put your finchs beak up for however long until you get the first number to add.");
        System.out.println("Put your finchs beak down for however long until you get the second number to add.");
        
        
        while(!jeroo.isBeakDown())
        {
            if(jeroo.isBeakUp())
            {
                num1++;
                jeroo.setLED(0, 0, 200, 500);
                jeroo.sleep(200);
            }
        }
        jeroo.sleep(1000);
        while(!jeroo.isBeakUp())
        {
            if(jeroo.isBeakDown())
            {
                num2++;
                jeroo.setLED(0, 200, 0, 500);
                jeroo.sleep(200);
            }
        }
        
        jeroo.sleep(500);
        int sum = num1 + num2;
        jeroo.sleep(1000);
        
        for(int i = 0; i < sum; i++)
        {
            jeroo.setLED(200, 0, 0, 500);
            jeroo.sleep(200);
        }

        
        jeroo.quit();
        System.exit(0);
    }
}
