package redmonku.edu.blackjack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Card {

    private Suit suit;
    private Denomination denomination;
    private int value;
    private String image;

    public Card(Suit suit, Denomination denomination, int value, String image) {
        this.suit = suit;
        this.denomination = denomination;
        this.value = value;
        this.image = image;
    }

    public Suit getSuit() {
        return suit;
    }

    public Denomination getDenomination() {
        return denomination;
    }

    public int getValue() {
        return value;
    }

    public String getImage() {
        return image;
    }
}
