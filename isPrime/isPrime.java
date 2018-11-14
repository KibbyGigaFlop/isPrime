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
   int y = 2;
   int z;
   boolean flag = false;//flag to determine primes and non-primes
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
      
      while (x > y){//while loop header
   
         z = x % y;//calculates the modulus of two numbers
   
         if(z == 0){
      
         flag = true;//sets flag to true if z is = to 0, ends loop
      
         }
         
      y++;//increments the y variable by 1
      
      }
 
      if(!flag){//displays message if the flag is false
   
      JOptionPane.showMessageDialog(null, x + " is a prime number.");//display for prime number
   
      }else{///displays message if the flag is true
   
      JOptionPane.showMessageDialog(null, x + " is not a prime number.");//display for non-primes
   
      }
   
   }

}