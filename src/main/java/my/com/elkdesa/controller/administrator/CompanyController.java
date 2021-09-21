package my.com.elkdesa.controller.administrator;

import my.com.elkdesa.controller.AbstractController;
import my.com.elkdesa.model.ElkdesaCompany;
import my.com.elkdesa.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/administrator/companies")
public class CompanyController extends AbstractController {

    @Autowired
    AdministratorService administratorService;

    @RequestMapping("/list")
    public String getCompanyList(Model model) {
        return "administrator/company";
    }

    @GetMapping
    @ResponseBody
    public List<ElkdesaCompany> getCompanies() {
        return administratorService.findElkdesaCompanyList();
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createCompany(@RequestBody ElkdesaCompany elkdesaCompany) {
        administratorService.saveElkdesaCompany(elkdesaCompany);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaCompany getCompanyById(@PathVariable(value = "id") Integer id) {
        return administratorService.findElkdesaCompany(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateCompany(@PathVariable(value = "id") Integer id,
                              @RequestBody ElkdesaCompany newElkdesaCompany) {

        ElkdesaCompany elkdesaCompany = administratorService.findElkdesaCompany(id);
        elkdesaCompany.setCompanyName(newElkdesaCompany.getCompanyName());
        administratorService.updateElkdesaCompany(elkdesaCompany);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteCompany(@PathVariable(value = "id") Integer id) {
        administratorService.deleteElkdesaCompany(id);
    }
}
