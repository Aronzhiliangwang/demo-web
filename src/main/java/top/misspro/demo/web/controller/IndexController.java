package top.misspro.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.misspro.demo.dao.entity.User;
import top.misspro.demo.service.UserService;


/**
 * @author Evan
 */

@Controller
@RequestMapping("/")
public class IndexController {

    private UserService userService;

    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/user/{id}")
    @ResponseBody
    public User user(@PathVariable("id") int userId) {
        return userService.getUser(userId);
    }
}
