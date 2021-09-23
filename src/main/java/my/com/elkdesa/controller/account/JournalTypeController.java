package my.com.elkdesa.controller.account;

import my.com.elkdesa.dao.ElkdesaAccountJournalTypeDao;
import my.com.elkdesa.model.ElkdesaAccountJournalType;
import my.com.elkdesa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Mapping = Request Url
 * Example : RequestMapping (default : GET), but the method can be defined
 * Example : GetMapping (GET)
 */

@Controller
@RequestMapping("/account/journal_types")
public class JournalTypeController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/list")
    public String getJournalTypeList(Model model) {
        return "account/journal_type";
    }

    @GetMapping
    @ResponseBody
    public List<ElkdesaAccountJournalType> getJournalTypes() {
        return accountService.findElkdesaAccountJournalList();
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createJournalType(@RequestBody ElkdesaAccountJournalType elkdesaAccountJournalType){
        accountService.saveElkdesaAccountJournalType(elkdesaAccountJournalType);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaAccountJournalType getJournalTypeById(@PathVariable(value ="id") Integer id){
        return accountService.findElkdesaAccountJournalType(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateJournalType(@PathVariable(value ="id")Integer id,
                                  @RequestBody ElkdesaAccountJournalType newElkdesaJournalType){
        ElkdesaAccountJournalType elkdesaAccountJournalType = accountService.findElkdesaAccountJournalType(id);
        elkdesaAccountJournalType.setJournalType((newElkdesaJournalType.getJournalType()));
        accountService.updateElkdesaAccountJournalType(elkdesaAccountJournalType);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteJournalType(@PathVariable(value="id") Integer id){ accountService.deleteElkdesaAccountJournalType(id);}
}
