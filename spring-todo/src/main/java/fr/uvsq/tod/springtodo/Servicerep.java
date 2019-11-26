package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 * @author manale
 *
 */
@Service
public class Servicerep{
	
	@Autowired
	private TacheRepository tr;
	
	public void addTache(Tache tache){
	tr.save(tache);
		}
	public ArrayList<Tache>getValues() {
		ArrayList<Tache> taches =new ArrayList();
	tr.findAll().forEach(taches::add);
	return taches;
	}  
	
	}





