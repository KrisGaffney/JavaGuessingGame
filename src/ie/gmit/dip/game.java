package ie.gmit.dip;

import java.util.*;

public class game {
    public static void main(String[] args) {
        
        // Game Welcome message
        System.out.println("################################################");
        System.out.println("##         Welcome to our Java Game           ##");
        System.out.println("##  Please guess a number between 0 and 100   ##");
        System.out.println("################################################");
        
        int NumberOfGuesses = 12, GuessNumber = 0, Guess;
        int max = 100, min = 0;
        boolean NotGuessed;
        
        while(GuessNumber < NumberOfGuesses && NotGuessed){
            
            Guess = randomNumberInRange(max, min);
            System.out.println("Is this your Number: (Yes/No)" + Guess);
            
            Scanner scanner = new Scanner(System.in);
            String Answer = scanner.nextLine();
            
            if(Answer.equals ("no")){
                System.out.println("Is your number Higher or Lower:  (higher/lower)");
                String HighLow = scanner.nextLine();
            }
            if(HighLow.equals ("higher")){
                min = guess + 1;
            }
            else if(HighLow.equals("lower")){
            max = Guess -1;    
            }
        }
             else if(Answer.equals("yes")){
                
             System.out.println("################################################");
             System.out.println("##    I have guessed your number correctly    ##");
             System.out.println("##              Please try again              ##");
             System.out.println("################################################");
             NotGuessed = false;
            
        }
    

        GuessNumber++;
        
        if(NotGuessed){
        System.out.println("################################################");
        System.out.println("##      I have not guessed your Number        ##");
        System.out.println("##  Please guess a number between 0 and 100   ##");
        System.out.println("################################################");
    }
    }


        
    
    
    public static int randomNumberInRange(int max, int min){
        int range = (max- min) +1;
        return (int)(Math.random() * range) + min;
    }
}
