package redmonku.edu.blackjack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redmonku.edu.blackjack.data.Deck;
import redmonku.edu.blackjack.model.Card;

import javax.annotation.PostConstruct;
import java.util.Deque;
import java.util.LinkedList;

@Service
public class CardService {

    @Autowired
    Deck deck ;

    Deque deque;
    @PostConstruct
            void init(){
        deque = new LinkedList<>(deck.getDeck());
    }


    Card empty = new Card(null , null ,0 , "/image/back.png");

    public  Card getFirstCard(){

        return deck.getDeck().get(0);
    }

    public Card emptyCard() {
        return empty;
    }

    public Card getNextCard() {
        Card card = (Card) deque.poll();
        if (card == null){
            deque = new LinkedList<>(deck.getDeck());
            card = (Card) deque.poll();
        }
        return card;
    }
}
