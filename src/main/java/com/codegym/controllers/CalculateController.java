package com.codegym.controllers;

import com.codegym.model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculateController {
    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String index(@RequestParam (name= "firstoperand") String firstOperand,
                        @RequestParam (name = "operator")String operator,
                        @RequestParam (name = "secondoperand") String secondOperand,
                        Model model) {

        float oneNumber;
        float twoNumber;

        try {
            oneNumber = Float.parseFloat(firstOperand);
        }
        catch (NumberFormatException ex) {
            oneNumber = 0;
        }

        try {
            twoNumber = Float.parseFloat(secondOperand);
        }
        catch (NumberFormatException ex) {
            twoNumber = 0;
        }
        Calculator calculator = new Calculator(oneNumber, twoNumber, operator);
        float result = (float) calculator.calculateResult();
        model.addAttribute("operator", operator);
        model.addAttribute("result", result);
        return "index";
    }
}
