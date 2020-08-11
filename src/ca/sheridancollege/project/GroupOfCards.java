/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards extends Card {

    private int size;//the size of the grouping

    public GroupOfCards() {
        this.size = size + 1;
    }

   
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public String getRandomSuit() {
        String[] cards = {"Hearts", "Clubs", "Spades", "Diamonds"};
        int ran = (int) (Math.random() * 4);
        String suit = cards[ran];
        return suit;
    }


    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return null;
        
    }


}
