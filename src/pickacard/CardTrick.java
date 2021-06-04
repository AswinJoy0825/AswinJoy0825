package pickacard;
import java.util.Scanner;
import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Aswin Joy
 * @date 31-05-2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Scanner game = new Scanner(System.in);
            Random cards = new Random();
           
            System.out.println("The cards in the magic hand are: ");
            

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(cards.nextInt(13) + 1);
            c.setSuit(Card.SUITS[cards.nextInt(4)]); 
            magicHand[i] = c;
            System.out.println(c);
            
        }
          System.out.println(magicHand[1].getSuit());
        System.out.print("Enter card value: ");
        int val = game.nextInt();
        System.out.print("Enter suit: ");
        String suit = game.next();
        
        
    
     int found = 1;

        System.out.println("Searching for: " + val + " of " + suit );
        for (int i = 0; i < magicHand.length; i++) {
        if(magicHand[i].getValue()==val && magicHand[i].getSuit().equalsIgnoreCase(suit)){
                found = 1;
                break;
        }
        else 
            found = -1;
        }
        
        if(found==-1){
            System.out.print("Better Luck next time \n");
        }
        else{
             System.out.print("You win \n");
        }
     }
        

   
          
}




