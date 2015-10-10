package com.aidar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private DAO dao;

    @RequestMapping("/form")
    public String displayForm() {
        return "form";
    }

    @RequestMapping("/table")
    public String showInfo(Model model) {
        model.addAttribute("userInfo", dao.getUserInfo());
        return "table";
    }

    @RequestMapping(value = "/table", method = RequestMethod.POST)
    public String saveInfo(@RequestParam("fName") String fName, @RequestParam("sName") String sName,
                           @RequestParam("lName") String lName, @RequestParam(value = "bDate", required = false) String bDate,
                           @RequestParam(value = "sex", required = false) Integer sex) {
        dao.addUserInfo(fName, sName, lName, bDate, sex);
        return "redirect:/table";
    }

}
