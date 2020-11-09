import java.util.Random;
import java.util.Scanner;

public class Lab4 {
    public static void main (String[] args){
    //Challenge 1 
    System.out.println("Enter a negative number:");
    Scanner negativeNumber = new Scanner(System.in);
    int negative = negativeNumber.nextInt();
    int positive = Math.abs(negative);
    System.out.println("Enter a number greater than " + positive);
    Scanner range = new Scanner(System.in);
    int upper = range.nextInt();
    double prefinal = Math.random();
    double negativepre = prefinal * negative;
    double positivepre = prefinal * upper;

    System.out.println(negativepre);
    System.out.println(positivepre);
    



    //Challenge 2
    System.out.println("Please enter a name");
    Scanner name = new Scanner(System.in);
    String nameInput = name.nextLine();
    
    System.out.println("Please enter an age");
    Scanner age = new Scanner(System.in);
    String ageInput = name.nextLine();

    System.out.println("Please enter a color");
    Scanner color = new Scanner(System.in);
    String colorInput = name.nextLine();

    System.out.println("Please enter a weapon");
    Scanner weapon = new Scanner(System.in);
    String weaponInput = name.nextLine();
   
    System.out.println("Please enter a height in feet");
    Scanner tall = new Scanner(System.in);
    String tallInput = name.nextLine();

    System.out.println(nameInput + " was a hero. They were " + ageInput + " years old. Suddenly the hero saw a massive goblin who was a " + colorInput + " colored gobline. The goblin was " + tallInput + " feet tall and held a " + weaponInput + " and then the hero killed him. The end.");

    tall.close();
    weapon.close();
    color.close();
    name.close();
    age.close();

    negativeNumber.close();
    range.close();
    } 
}