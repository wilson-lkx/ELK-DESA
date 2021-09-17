package my.com.elkdesa.controller;

import my.com.elkdesa.model.ElkdesaCompany;
import my.com.elkdesa.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/administrator")
public class AdministratorController extends AbstractController {

    @Autowired
    AdministratorService administratorService;

    @RequestMapping("/company/view")
    public String getCompanyView(Model model){
        return "administrator/company";
    }

    @GetMapping("/company")
    @ResponseBody
    public String getCompany(Model model){
        List<ElkdesaCompany> elkdesaCompanyList = administratorService.findElkdesaCompanyList();
        return gson.toJson(elkdesaCompanyList);
    }

    @PostMapping("/company")
    @ResponseBody
    public String createCompany(Model model){
        return null;
    }

    @PutMapping("/company")
    @ResponseBody
    public String updateCompany(Model model){
        return null;
    }

    @DeleteMapping("/company")
    @ResponseBody
    public String deleteCompany(Model model){
        return null;
    }
}
