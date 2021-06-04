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
           
        System.out.print("Enter card value: ");
        int val = game.nextInt();
        System.out.print("Enter suit: ");
        String suit = game.next();
        Card key = new Card();
        key.setValue(val);
        key.setSuit(suit);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }


