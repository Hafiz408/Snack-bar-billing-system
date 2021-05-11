package com.example.SnackBar.SnackController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SnackController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() 
           {
       return "index";
    }
}