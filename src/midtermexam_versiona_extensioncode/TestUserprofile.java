/*
 * To change this license header, choose License Headers in Project Properties.
 * Midterm
 * Date: March 8, 2023
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
       //Initiazlie Scanner
       Scanner input = new Scanner(System.in);
       
     
       UserProfile newProfile = new UserProfile();
       //Card userGuess = new Card(Card.Color.values()[valueGuess],Card.Rank.values()[suitGuess])
       
     
       
        System.out.println("Enter your name");
        String name = input.nextLine();
        
        System.out.println("Enter your favorite genre");
        String genre = input.nextLine();
        
        System.out.println("User profile created");
    }
}
