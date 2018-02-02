package com.besttone.controller;

        import com.besttone.entity.User;
        import com.besttone.repository.UserRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping("/page")
    public String home(){

        return "home";
    }
}
