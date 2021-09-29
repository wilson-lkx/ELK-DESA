package my.com.elkdesa.controller.administrator;


import my.com.elkdesa.controller.AbstractController;
import my.com.elkdesa.model.ElkdesaUser;
import my.com.elkdesa.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/administrator/users")
public class UserController extends AbstractController {

    @Autowired
    AdministratorService administratorService;

    @RequestMapping("/list")
    public String getUserList(Model model) { return "administrator/user"; }

    @GetMapping
    @ResponseBody
    public List<ElkdesaUser> getUsers() { return administratorService.findElkdesaUserList(); }

    @PostMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void createUser(@RequestBody ElkdesaUser elkdesaUser){
        administratorService.saveElkdesaUser(elkdesaUser);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ElkdesaUser getUserById(@PathVariable(value="id")Integer id){
        return administratorService.findElkdesaUser(id);
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value =HttpStatus.OK)
    public void updateUser(@PathVariable(value="id")Integer id,
                           @RequestBody ElkdesaUser newElkdesaUser){

        ElkdesaUser elkdesaUser = administratorService.findElkdesaUser(id);
        elkdesaUser.setUserName(newElkdesaUser.getUserName());
        administratorService.updateElkdesaUser(elkdesaUser);
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus(value =HttpStatus.OK)
    public void deleteUser(@PathVariable(value ="id")Integer id) {administratorService.deleteElkdesaUser(id);}
}
