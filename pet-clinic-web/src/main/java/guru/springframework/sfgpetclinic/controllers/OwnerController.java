package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dz on 15/03/21.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

//    @RequestMapping({"/owners","/owners/index", "/owners/index.html"})
@RequestMapping({"","/","/index", "/index.html"})
public String listOwners(){
        return "owners/index";
    }
}
