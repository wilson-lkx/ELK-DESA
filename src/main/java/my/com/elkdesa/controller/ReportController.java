package my.com.elkdesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/report")
public class ReportController {

    @RequestMapping("/journal_entry")
    public String getJournalEntryReport() {
        return "report/journal_entry";
    }


    @RequestMapping("/audit_trail")
    public String getAuditTrailReport(){ return "report/audit_trail";}

    @RequestMapping("/follow_up")
    public String getFollowUpReport(){ return "report/follow_up";}
}

