import java.util.Random;
import java.util.Scanner;
public class GuessingGame
{
    public static void main(String[] args)
    {
        
        Scanner myNum= new Scanner(System.in);
        Random num = new Random();
       
        boolean playAgain = true;
        while(playAgain)
        {
            System.out.print("enter the interval you want to play: ");
            int interval = myNum.nextInt();
            int ranNum= num.nextInt(interval)+1;
            
            System.out.print("enter the number : ");
            int guessedNumber= myNum.nextInt();
            
            
            int attempts=1;

            while(guessedNumber!=ranNum && attempts<=Math.min(interval/5, 10))
            {
                if(guessedNumber<ranNum)
                {
                    if(((double)(guessedNumber-ranNum)/interval )*100>=-20)
                    {
                    System.out.println("low, but very close ");
                    }
                    else if(((double)(guessedNumber-ranNum)/interval)*100 >=-30)
                    {
                        System.out.println("low");
                    }
                    else if(((double)(guessedNumber-ranNum)/interval)*100 <-30)
                    {
                    System.out.println("too low");

                    }
                }
                else
                {
                    if(((double)(guessedNumber-ranNum)/interval)*100 <=20)
                    {
                    System.out.println("high, but very close ");
                    }
                    else if(((double)(guessedNumber-ranNum)/interval)*100 <=30)
                    {
                        System.out.println("high");
                    }
                    else if(((double)(guessedNumber-ranNum)/interval)*100 >30)
                    {
                    System.out.println("too high");

                    }
                }

                System.out.print("try again: ");
                guessedNumber= myNum.nextInt();
                attempts++;
            
            }
            if (guessedNumber==ranNum)
            {
                System.out.println("Congrats, you got it with "+ attempts +" attempts");
            }
            else
            {
                 System.out.println("You lost. the number was " + ranNum);

            }
            System.out.print("want to play again? 1 for yes 0 for no ");
            System.out.println();
            int play= myNum.nextInt();
            while(play!=0&&play!=1)
                {
                    System.out.println("please enter either 0 or 1 only");
                    play= myNum.nextInt();
                }
            if (play == 1) 
            {
                playAgain=true;   
            }
            else
            {
                 playAgain=false;
                 System.out.println("bye!");
            }
           
        
        }
        myNum.close();
    }

}