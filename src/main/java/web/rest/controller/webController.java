package web.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class webController {

    @GetMapping("message")
    public String home(Model model) {

        model.addAttribute("title");
        return "index.html";
    }


}
