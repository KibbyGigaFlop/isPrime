/**
Timothy Bain
11/9/18
COSC 220

The Purpose of this program is to accept
any number that the user inputs and determines whether
or not that number is prime.

*/
import javax.swing.JOptionPane;//imports JOption Pane
public class isPrime {//class header

   public static void main(String[] args){//main method
   
   //declarations for user input and calculations
   String userEntry;
   int x = 0;
   int z;
   int answer;
   boolean validation = true;
   
   while (validation){
   try {
   
   userEntry = JOptionPane.showInputDialog(null, "Enter a number.");//accepts user input
   x = Integer.parseInt(userEntry);//parses the integer
   
   validation = false;
   
   }catch (Exception e){
   
   System.out.println("Invalid input.");
   
            }
         
         }
         
     answer = isPrime(x);
     
      if(answer != 0){//displays message if the flag is false
   
      JOptionPane.showMessageDialog(null, x + " is a prime number.");//display for prime number
   
      }
      
      if (answer == 0){///displays message if the flag is true
   
      JOptionPane.showMessageDialog(null, x + " is not a prime number.");//display for non-primes
         
      }
     
     }
         
   public static int isPrime(int userInput){
   
   int y = 2;
   int z = 0;
   boolean loop = true;
   
   while(loop){
   
         while (userInput > y){//while loop header
   
         z = userInput % y;//calculates the modulus of two numbers
   
         if(z == 0){
      
            loop = false;
            
            return z;
            
         }
         
      y++;//increments the y variable by 1
      loop = false;

         }
      
      }
      
      return z;
      
   }

}

/**

*/