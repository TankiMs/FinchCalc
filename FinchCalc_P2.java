import com.birdbraintechnologies.Finch;

public class FinchCalcP2
{
    public static void main(String[] args)
    {
        
        Finch jeroo = new Finch();
        int num1 = 0;
        int num2 = 0;
        int math = 0;
        int operation = 0;
        
        jeroo.buzz(100, 500);
        while(!jeroo.isBeakDown())
        {
            if(jeroo.isBeakUp())
            {
                jeroo.sleep(500);
                num1++;
                jeroo.setLED(0, 0, 200, 500);
            }
        }
        jeroo.sleep(1000);
        jeroo.buzz(200, 500);
        System.out.println("Num1: " + num1); 
        while(!jeroo.isBeakUp())
        {
            if(jeroo.isBeakDown())
            {
                jeroo.sleep(500);
                num2++;
                jeroo.setLED(0, 200, 0, 500);
            }
        }
        jeroo.sleep(1000);
        jeroo.buzz(300, 500);
        System.out.println("Num2: " + num2); 
        while(!jeroo.isFinchUpsideDown() && math < 5)
        {
            if(jeroo.isFinchLevel())
            {
                jeroo.sleep(2000);
                math++;
                jeroo.setLED(240, 200, 0, 500);
            }
        }
        
        System.out.println("Math type: " + math); 
        jeroo.sleep(2000);
        
        if(math == 1)
        {
            operation = num1 + num2;
            jeroo.sleep(1000);
            System.out.println(operation);
            for(int i = 0; i < Math.abs(operation); i++)
            {
                jeroo.sleep(200);
                jeroo.setLED(200, 0, 0, 500);
            }
        }
        if(math == 2)
        {
            operation = num1 - num2;
            jeroo.sleep(1000);
            System.out.println(operation);
            if(operation < 0)
            {
                jeroo.setLED(240, 0, 240, 500);
                jeroo.sleep(200);
            }
            if(operation == 0)
            {
                jeroo.setWheelVelocities(100, 100, 2000);
            }
            for(int i = 0; i < Math.abs(operation); i++)
            {
                jeroo.sleep(200);
                jeroo.setLED(200, 0, 0, 500);
            }
        }
        if(math == 3)
        {
            operation = num1 * num2;
            jeroo.sleep(1000);
            System.out.println(operation);
            if(operation == 0)
            {
                jeroo.setWheelVelocities(100, 100, 2000);
            }
            for(int i = 0; i < Math.abs(operation); i++)
            {
                jeroo.sleep(200);
                jeroo.setLED(200, 0, 0, 500);
            }
        }
        if(math == 4)
        {
            if(num2 == 0)
            {
                jeroo.buzz(600, 1000);
            }
            
            operation = num1 / num2;
            jeroo.sleep(1000);
            System.out.println(operation);
            if(operation == 0)
            {
                jeroo.setWheelVelocities(100, 100, 2000);
            }
            for(int i = 0; i < Math.abs(operation); i++)
            {
                jeroo.sleep(200);
                jeroo.setLED(200, 0, 0, 500);
            }
        }
        /*
        jeroo.sleep(500);
        int sum = num1 + num2;
        jeroo.sleep(1000);
        
        for(int i = 0; i < sum; i++)
        {
            jeroo.setLED(200, 0, 0, 500);
            jeroo.sleep(200);
        }
        */

        
        jeroo.quit();
        System.exit(0);
    }
}
