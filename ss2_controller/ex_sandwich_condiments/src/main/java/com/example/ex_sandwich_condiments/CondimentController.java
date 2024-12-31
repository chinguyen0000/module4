package com.example.ex_sandwich_condiments;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentController {
    @GetMapping(value="/")
    public String index() {
        return "index";
    }
    @RequestMapping(value="/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        if (condiment == null || condiment.length == 0) {
            model.addAttribute("condiment", "None");
        } else {
            model.addAttribute("condiment", condiment);
        }
        return "index";
    }
}
