package Template.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Advisor {

    @ExceptionHandler
    public String handle(Exception ex, Model model, HttpServletRequest req){
        model.addAttribute("ex", ex);
        //OPTIONEL > recup de la requete pour revenir en arrière grâce à "referer"
        model.addAttribute("previous", req.getHeader("referer"));
        //renvoi à la vue dans "ressources/template/"
        return"errors/error";
    }
}
