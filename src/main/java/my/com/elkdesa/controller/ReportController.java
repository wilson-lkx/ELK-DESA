package my.com.elkdesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/report")
public class ReportController {

    @RequestMapping("/account")
    public String getAccountReport() {
        return "report/account";
    }
}
