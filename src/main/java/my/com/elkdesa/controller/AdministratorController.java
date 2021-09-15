package my.com.elkdesa.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/administrator")

public class AdministratorController {
    @RequestMapping("/company")
    public String getCompanyType(Model model){
        return "administrator/company";
    }
}
