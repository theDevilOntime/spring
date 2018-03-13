package spitter.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
  @RequestMapping(value = "/", method=GET)
  public String home() {
    String message = "Hello world from Spring MVC";
    //return new ModelAndView("home", "message", message);
    return "home";
  }
}
