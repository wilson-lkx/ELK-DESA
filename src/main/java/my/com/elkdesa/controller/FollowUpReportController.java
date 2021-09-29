package my.com.elkdesa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/report")
public class FollowUpReportController {

    @RequestMapping("/follow_up_report")
    public String getAuditTrialReport() {
        return "report/follow_up_report";
    }
}
