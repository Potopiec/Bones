package dev.raf.controllers;

import dev.raf.dao.DbFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private DbFacade facade;

    @RequestMapping("/")
    public String getCollectionList(Model model){

        model.addAttribute("fossils",facade.getData());


        return "/Collection";
    }


}
