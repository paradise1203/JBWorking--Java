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
    private UserInfo userInfo;

    @RequestMapping("/form")
    public String displayForm() {
        return "form";
    }

    @RequestMapping("/table")
    public String showInfo(Model model) {
        model.addAttribute("fName", userInfo.getFirstName());
        model.addAttribute("sName", userInfo.getSecondName());
        model.addAttribute("lName", userInfo.getLastName());
        model.addAttribute("bDate", userInfo.getBirthDate());
        model.addAttribute("sex", userInfo.getSex());
        return "table";
    }

    @RequestMapping(value = "/table", method = RequestMethod.POST)
    public String saveInfo(@RequestParam("fName") String fName, @RequestParam("sName") String sName,
                           @RequestParam("lName") String lName, @RequestParam("bDate") String bDate,
                           @RequestParam("sex") String sex, Model model) {
        userInfo.setFirstName(fName);
        userInfo.setSecondName(sName);
        userInfo.setLastName(lName);
        userInfo.setBirthDate(bDate);
        userInfo.setSex(sex);
        return "redirect:/table";
    }

}
