package dev.raf.controllers;

import dev.raf.dao.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    private QueryHandler handler;

    @RequestMapping("/")
    public String getCollectionList(HttpServletRequest request, Model model){

        String searchParameter = request.getParameter("sortBy");

        if (searchParameter == null) {
            model.addAttribute("fossils", handler.getAllEntries());
        }else {
            model.addAttribute("fossils", handler.getAllEntriesSortedBy(searchParameter));
        }

        return "collection";
    }

    @RequestMapping("/add")
    public String addToCollection(){
System.out.println("jest");
        return "add";
    }


}
