package dev.raf.controllers;
import dev.raf.dao.IDbFacade;
import dev.raf.dao.IQueryHandler;
import dev.raf.dao.dto.FossilDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    private IQueryHandler handler;
    private IDbFacade facede;

    @Autowired
    public MainController (IQueryHandler handler,IDbFacade facede){
        this.handler = handler;
        this.facede = facede;
    }

    @RequestMapping("/")
    public String getCollectionList(HttpServletRequest request, Model model){

        String searchParameter = request.getParameter("sortBy");
        if (searchParameter == null) {
            model.addAttribute("fossilsList", handler.getAllEntries());
        }else {
            model.addAttribute("fossilsList", handler.getAllEntriesSortedBy(searchParameter));
        }
        return "collection";
    }

    @RequestMapping("/add")
    public String addToCollection(Model model){
        model.addAttribute("saveFossil", new FossilDto());
        return "add";
    }

    @RequestMapping("/update")
    public String InitializeUpdate(HttpServletRequest request ,Model model){
        String idInString = request.getParameter("id");
        int id = Integer.parseInt(idInString);
        model.addAttribute("fossil",handler.getElementById(id));
        return "update";
    }

    @RequestMapping("/remove")
    public String removeFromCollection(HttpServletRequest request ,Model model){
        String idInString = request.getParameter("id");
        int id = Integer.parseInt(idInString);
        facede.delete(id);
        model.addAttribute("message","deleted");
        return "succes";
    }

    @RequestMapping("/editForm")
    public String editForm(HttpServletRequest request, Model model){
        String idInString = request.getParameter("id");
        int id = Integer.parseInt(idInString);
        model.addAttribute("editFossil",handler.getElementById(id));
        return "editForm";
    }

    @RequestMapping("/edit")
    public String editFosil(@ModelAttribute ("editFossil") FossilDto save,Model model){
        facede.update(save);
        model.addAttribute("message","edited");
        return "succes";
    }

    @RequestMapping("/succes")
    public String saveSucced(@ModelAttribute ("saveFossil") FossilDto save,Model model){
        facede.save(save);
        model.addAttribute("message","saved");
        return "succes";
    }

}
