package my.com.elkdesa.controller.administrator;

import my.com.elkdesa.controller.AbstractController;
import my.com.elkdesa.model.ElkdesaUserRole;
import my.com.elkdesa.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/administrator/user_roles")
public class UserRoleController extends AbstractController {

    @Autowired
    AdministratorService administratorService;

    @RequestMapping("/list")
    public String getUserRoleList(Model model) { return "administrator/user_role"; }

    @GetMapping
    @ResponseBody
    public List<ElkdesaUserRole> getUserRoles() { return administratorService.findElkdesaUserRoleList(); }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createUserRole(@RequestBody ElkdesaUserRole elkdesaUserRole){
        administratorService.saveElkdesaUserRole(elkdesaUserRole);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaUserRole getUserRoleById(@PathVariable(value="id")Integer id){
        return administratorService.findElkdesaUserRole(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value =HttpStatus.OK)
    public void updateUserRole(@PathVariable(value="id")Integer id,
                           @RequestBody ElkdesaUserRole newElkdesaUserRole){

        ElkdesaUserRole elkdesaUserRole = administratorService.findElkdesaUserRole(id);
        elkdesaUserRole.setUserRole(newElkdesaUserRole.getUserRole());
        administratorService.updateElkdesaUserRole(elkdesaUserRole);
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value =HttpStatus.OK)
    public void deleteUserRole(@PathVariable(value ="id")Integer id) {administratorService.deleteElkdesaUserRole(id);}
}
