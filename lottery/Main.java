package lottery;

import java.util.*;

public class Main {

    private static boolean[] lottery;
    private static boolean[] array;

    public static void main(String[] args) {

        getUserNumbers();

        getRandomNumbers();

        getTotalMatchedNumbers();

}


    public static void getRandomNumbers(){

            int[] lottery = new int[6];
            int lotteryNumbers;
        
            for (int i = 0; i < 6; i++) {
                lotteryNumbers = (int) (Math.random() * 50);
                for (int x = 0; x < i; x++) {
                    if (lottery[x] == lotteryNumbers)
                    {
                        lotteryNumbers = (int) (Math.random() * 50);
                        x = -1;
                    }
        
                }
                lottery[i] = lotteryNumbers;
            }
            
            System.out.println("The winning numbers are: ");
            for (int i = 0; i < lottery.length; i++)
                System.out.print(lottery[i] + " ");
        
        }
    

    public static void getUserNumbers(){
        Scanner scanner = new Scanner(System.in);
         
            int[] array = new int[10];  
    
        System.out.println("Enter your numbers: "); 
    
        for(int i=0; i < 6; i++){  
      
            array[i]=scanner.nextInt();  
    
        }  

        System.out.println("You have entered: ");  

        for (int i=0; i < 6; i++){  
            System.out.print(array[i]);  
            System.out.print(" ");
            System.out.println(" ");
           
        }  
    }

    public static void getTotalMatchedNumbers(){

        int matched = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0;j < 6; j++){
                if(lottery[i] == array[j]){
                        matched = matched + 1;
                }
            }
            if (matched != 6){
                System.out.println(matched + " out of the 6 numbers you chose are winning numbers, better luck next time!");
            }
            else{
                System.out.println("You got picked all the winning numbers! You win!");
            }
        }

    }
}