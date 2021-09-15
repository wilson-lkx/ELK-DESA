package my.com.elkdesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @RequestMapping("/journal_type")
    public String getJournalType(Model model) {
        return "account/journal_type";
    }
}
