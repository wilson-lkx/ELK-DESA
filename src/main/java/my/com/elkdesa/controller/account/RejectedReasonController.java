package my.com.elkdesa.controller.account;

import my.com.elkdesa.model.ElkdesaRejectedReason;
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
    public List<ElkdesaRejectedReason> getRejectedReasons() {
        return accountService.findElkdesaRejectedReasonList();
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createRejectedReason(@RequestBody ElkdesaRejectedReason elkdesaRejectedReason){
        accountService.saveElkdesaRejectedReason(elkdesaRejectedReason);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaRejectedReason getRejectedReasonById(@PathVariable(value ="id") Integer id){
        return accountService.findElkdesaRejectedReason(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateRejectedReason(@PathVariable(value ="id")Integer id,
                                      @RequestBody ElkdesaRejectedReason newElkdesaRejectedReason){
        ElkdesaRejectedReason elkdesaRejectedReason = accountService.findElkdesaRejectedReason(id);
        elkdesaRejectedReason.setRejectedReason((newElkdesaRejectedReason.getRejectedReason()));
        accountService.updateElkdesaRejectedReason(elkdesaRejectedReason);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteRejectedReason(@PathVariable(value="id") Integer id){ accountService.deleteElkdesaRejectedReason(id);}

}

