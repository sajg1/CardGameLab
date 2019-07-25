import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> shuffledcards;

    public Deck() {
        this.cards = new ArrayList<Card>();

    }

    public int cardCount() {
       return this.cards.size();
    }

    public void buildAndShuffle() {
        int i = 0;
        for(SuitType suit : SuitType.values()) {
           for(RankType rank : RankType.values()) {
               cards.add(new Card(suit,rank));
               i++;
           }
        }
        Collections.shuffle(cards);


    }




}
