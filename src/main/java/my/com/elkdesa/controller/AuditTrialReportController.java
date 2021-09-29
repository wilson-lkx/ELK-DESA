package my.com.elkdesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/report")
public class AuditTrialReportController {

    @RequestMapping("/audit_trial_report")
    public String getAuditTrialReport() {
        return "report/audit_trial_report";
    }
}

