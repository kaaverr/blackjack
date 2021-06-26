package redmonku.edu.blackjack.controller.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import redmonku.edu.blackjack.model.Card;
import redmonku.edu.blackjack.service.CardService;

@Controller
@RequestMapping("/ui/card")
public class CardUiController {

    @Autowired
    CardService service;

    @RequestMapping("/first")
    public  String getFirstCard(Model model){
        Card firstcard = service.getFirstCard();
        model.addAttribute("firstcard" , firstcard);
        return "gametable";
    }

    @RequestMapping("/empty")
    public  String getEmptyCard(Model model){
        Card firstcard = service.emptyCard();
        model.addAttribute("firstcard" , firstcard);
        return "gametable";
    }

    @RequestMapping("/next")
    public  String getNextCard(Model model){
        Card firstcard = service.getNextCard();
        model.addAttribute("firstcard" , firstcard);
        return "gametable";
    }
}
