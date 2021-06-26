package redmonku.edu.blackjack.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redmonku.edu.blackjack.model.Card;
import redmonku.edu.blackjack.service.CardService;

@RestController
@RequestMapping("/api/card")
public class CardRestController {

    @Autowired
    CardService service;

    @RequestMapping("/first")
    public Card getFirst(){
        return service.getFirstCard();
    }
}
