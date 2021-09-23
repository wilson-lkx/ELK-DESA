package my.com.elkdesa.controller.account;

import my.com.elkdesa.model.ElkdesaAccountRejectedReason;
import my.com.elkdesa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/account/rejected_reasons")
public class RejectedReasonController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/list")
    public String getRejectedReasonList(Model model) {
        return "account/rejected_reason";
    }

    @GetMapping
    @ResponseBody
    public List<ElkdesaAccountRejectedReason> getRejectedReasons() {
        return accountService.findElkdesaAccountRejectedReasonList();
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createRejectedReason(@RequestBody ElkdesaAccountRejectedReason elkdesaAccountRejectedReason){
        accountService.saveElkdesaAccountRejectedReason(elkdesaAccountRejectedReason);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaAccountRejectedReason getRejectedReasonById(@PathVariable(value ="id") Integer id){
        return accountService.findElkdesaAccountRejectedReason(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateRejectedReason(@PathVariable(value ="id")Integer id,
                                      @RequestBody ElkdesaAccountRejectedReason newElkdesaAccountRejectedReason){
        ElkdesaAccountRejectedReason elkdesaAccountRejectedReason = accountService.findElkdesaAccountRejectedReason(id);
        elkdesaAccountRejectedReason.setRejectedReason((newElkdesaAccountRejectedReason.getRejectedReason()));
        accountService.updateElkdesaAccountRejectedReason(elkdesaAccountRejectedReason);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteRejectedReason(@PathVariable(value="id") Integer id){ accountService.deleteElkdesaAccountRejectedReason(id);}

}

