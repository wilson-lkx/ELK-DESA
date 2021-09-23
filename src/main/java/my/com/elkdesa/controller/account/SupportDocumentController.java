package my.com.elkdesa.controller.account;

import my.com.elkdesa.model.ElkdesaAccountSupportDocument;
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
    public List<ElkdesaAccountSupportDocument> getSupportDocuments() {
        return accountService.findElkdesaAccountSupportDocumentList();
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createSupportDocument(@RequestBody ElkdesaAccountSupportDocument elkdesaAccountSupportDocument){
        accountService.saveElkdesaAccountSupportDocument(elkdesaAccountSupportDocument);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaAccountSupportDocument getSupportDocumentById(@PathVariable(value ="id") Integer id){
        return accountService.findElkdesaAccountSupportDocument(id);
    }
    
    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateSupportDocument(@PathVariable(value ="id")Integer id,
                                  @RequestBody ElkdesaAccountSupportDocument newElkdesaAccountSupportDocument){
        ElkdesaAccountSupportDocument elkdesaAccountSupportDocument = accountService.findElkdesaAccountSupportDocument(id);
        elkdesaAccountSupportDocument.setDocumentType((newElkdesaAccountSupportDocument.getDocumentType()));
        accountService.updateElkdesaAccountSupportDocument(elkdesaAccountSupportDocument);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteSupportDocument(@PathVariable(value="id") Integer id){ accountService.deleteElkdesaAccountSupportDocument(id);}
    
}
