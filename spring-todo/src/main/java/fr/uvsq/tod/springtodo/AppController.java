package fr.uvsq.tod.springtodo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**les requetes HTTP sont gérées par un controller*/
@Controller
public class AppController {
//..........


/**localhost:8080/tache?id=.. show the tache that has the id writed  there */
    @RequestMapping("/tache")
    public Tache getYourtache(@RequestParam(value="id", required=false, defaultValue="1") long id, Model memo) {
        memo.addAttribute("id",get(id));
        return "tache";
    }


}
