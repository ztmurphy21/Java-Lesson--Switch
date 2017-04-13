
package swtichexample;

import java.util.Scanner; 

public class SwtichExample {

    public static void main(String[] args) {
    // scanner object
    Scanner keyboard = new Scanner(System.in);
    
    //output for instructions
    System.out.println("Enter 1, 2, 3, or 4: ");
    //declaration and input
    int num = keyboard.nextInt();
    
    switch(num){
        case 1:
            System.out.println("You entered one. ");
            break;
        case 2:
            System.out.println("You entered two. ");
            break;
        case 3: 
            System.out.println("You entered three.");
            break;
        case 4: 
            System.out.println("You entered four. ");
            break;
        default:
            System.out.println("That is not 1, 2, 3, or 4! Please try again!");
    }
    
    }
    
}
