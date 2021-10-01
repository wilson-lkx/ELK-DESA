package my.com.elkdesa.controller.account;

import my.com.elkdesa.model.ElkdesaJournalDocumentType;
import my.com.elkdesa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/account/support_documents")
public class SupportDocumentController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/list")
    public String getSupportDocumentList(Model model) {
        return "account/support_document";
    }

    @GetMapping
    @ResponseBody
    public List<ElkdesaJournalDocumentType> getSupportDocuments(
            @RequestParam(value = "journalType", required = false) Integer journalType
    ) {
        List<ElkdesaJournalDocumentType> elkdesaJournalDocumentTypeList;
        if (journalType != null) {
            elkdesaJournalDocumentTypeList = accountService.findElkdesaJournalDocumentTypeByJournalType(journalType);
        } else {
            elkdesaJournalDocumentTypeList = accountService.findElkdesaJournalDocumentTypeList();
        }
        return elkdesaJournalDocumentTypeList;
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createSupportDocument(@RequestBody ElkdesaJournalDocumentType elkdesaJournalDocumentType){
        accountService.saveElkdesaJournalDocumentType(elkdesaJournalDocumentType);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaJournalDocumentType getSupportDocumentById(@PathVariable(value ="id") Integer id){
        return accountService.findElkdesaJournalDocumentType(id);
    }
    
    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateSupportDocument(@PathVariable(value ="id")Integer id,
                                  @RequestBody ElkdesaJournalDocumentType newElkdesaJournalDocumentType){
        ElkdesaJournalDocumentType elkdesaJournalDocumentType = accountService.findElkdesaJournalDocumentType(id);
        elkdesaJournalDocumentType.setDocumentType((newElkdesaJournalDocumentType.getDocumentType()));
        accountService.updateElkdesaJournalDocumentType(elkdesaJournalDocumentType);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteSupportDocument(@PathVariable(value="id") Integer id){ accountService.deleteElkdesaJournalDocumentType(id);}
    
}
