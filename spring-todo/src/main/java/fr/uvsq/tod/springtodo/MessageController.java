package fr.uvsq.tod.springtodo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**class MessageController.
 * return a message
 * */
@RestController
public class MessageController {
@RequestMapping("/")

public String index() {
return "Hello world !";
}

}
