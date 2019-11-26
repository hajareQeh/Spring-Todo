

package fr.uvsq.tod.springtodo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * class Tache.
 *add tasks
 *contains :
 *id =type big integer
 *contents=type string
 */

@Entity
public class Tache {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String contents;
    
/**
 * 1er constructeur vide .*/
public Tache() {}
    
/**
* 2eme constructeur.*/
    
    public Tache(long id, String contents) {
        this.id = id;
        this.contents = contents;
    }
  
/**
 * les setteurs et getteurs à fin de pourvoir. 
 * acceder aux valeurs 
 * et de pouvoir les modifier*/
   
    public long getId() {
       return id;
    }
    
public void setId(long id) {
    this.id=id;
    }
    
public String getContents() {
    return contents;
    }
    
public void setContents(String contents) {
    this.contents=contents;
    }
/**
 * fonction d'affichage utile ulterierement.
 * */

@Override
public String toString() {
   return String.format("tache[id=%d,contents=%s'%s']",id,contents);
}

}
