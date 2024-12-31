package com.example.ex_calculator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
    @PostMapping(value = "/calculate")
    public String calculate(@RequestParam("calculate") String calculate, @RequestParam("num1") double num1, @RequestParam("num2") double num2, Model model) {
        double result = 0;
        if (calculate.equals("+")) {
            result = num1 + num2;
        } else if (calculate.equals("-")) {
            result = num1 - num2;
        } else if (calculate.equals("*")) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }
        model.addAttribute("result",result);
        return "index";
    }
}
