

package fr.uvsq.tod.springtodo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class TacheController {

   
/**declaration d'une liste qui va contenir l'ensemble des taches que je vais créer.*/



/**
 * * utilisation de template. */
private static final String template = "Tache, %s!";

/**
 * declaration d'un counter.
 * qui va incrementer automatiquement l'identifiant de chaque tache crée*/

private final AtomicLong counter = new AtomicLong();


/**getTaches() function returns many of taches.
 * dans le navigateur des qu'on met localhost:8080/taches
 * on va avoir toute la liste des taches créés qui s'affiche
 * */

/**
 *sinom c'est possible d'ajouter directement une tache à partir du navigateur. 
 *en mettant juste le nom de la tache 
 *aussi on peut avoir une tache par defaut qui s'affiche  si on passe rien en parametres*/


@Autowired
service ls;

@RequestMapping(value="/taches",
method = RequestMethod.GET,
produces = MediaType.APPLICATION_JSON_VALUE
)
@ResponseBody
public ArrayList <Tache> getTaches() {
return ls.getValues();
}

/**tester quelques exemples
 * */
/*public CommandLineRunner demo(){
	return (args)-> {


Tache t=new Tache(1,"ouvrir navigateur");
ls.addTache(t);
Tache t2=new Tache(2,"chercher information");
ls.addTache(t2);
   };
   }*/

/**
 * fonction qui retourne la tache selon l'id si elle existe.
 *  */


/**FUNCTION POST  */



//.....
	@Autowired
	Servicerep s;
	private final AtomicLong counter=new AtomicLong();

	@RequestMapping(values="/newTache",method = RequestMethod.POST)
    public String ajouter(String memo
            RedirectAttributes redirectAttributes
    ) {
         Tache nouveau=new Tache(counter.incrementAndGet(),memo);
			s.addTache(nouveau);
        redirectAttributes.addFlashAttribute("alertSuccess", "Tache created");
        return "newTache";
    }

}




