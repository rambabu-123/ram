package ram;

import java.util.Scanner;

public class Code {
public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        int time = in.nextInt();
        
        int fare = 0;
        
        if (time<= 0)
        {
            fare = 0;
            System.out.println("the fare is:"+fare);
        }
        else if (time<= 8)
            fare = 25;
        else if (time <= 24)
            fare = 8+(time - 10)+0.5;
        else if (time <= 72)
            fare = 8 + 50 + (time - 72)* 5;
        else if (time > 30)
            fare = 80 + 60 + 50 + (time- 30) * 4;
            
        System.out.println(" total Fare = " + fare);
    }

}
