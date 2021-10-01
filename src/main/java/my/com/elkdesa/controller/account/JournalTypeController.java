package my.com.elkdesa.controller.account;

import my.com.elkdesa.model.ElkdesaJournalType;
import my.com.elkdesa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<ElkdesaJournalType> getJournalTypes() {
        return accountService.findElkdesaJournalTypeList();
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createJournalType(@RequestBody ElkdesaJournalType elkdesaJournalType){
        accountService.saveElkdesaJournalType(elkdesaJournalType);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaJournalType getJournalTypeById(@PathVariable(value ="id") Integer id){
        return accountService.findElkdesaJournalType(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateJournalType(@PathVariable(value ="id")Integer id,
                                  @RequestBody ElkdesaJournalType newElkdesaJournalType){
        ElkdesaJournalType elkdesaJournalType = accountService.findElkdesaJournalType(id);
        elkdesaJournalType.setJournalType((newElkdesaJournalType.getJournalType()));
        accountService.updateElkdesaJournalType(elkdesaJournalType);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteJournalType(@PathVariable(value="id") Integer id){ accountService.deleteElkdesaJournalType(id);}
}
