package fr.uvsq.tod.springtodo;

import static org.junit.Assert.*;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.PathVariable;

public class TacheControllerTest {

@Autowired
private MockMvc mvc;

@Test
public void test1() {
List<Tache>t= new ArrayList <Tache>();
assertTrue(t.isEmpty());
}


@Test
public void test2() {
List<Tache>taches= new ArrayList <Tache>();
Tache t=new Tache(1,"dormir");
taches.add(t);
assertFalse(taches.isEmpty());
}
=======
import org.junit.Test;

public class TacheControllerTest {

	@Test
	public void test1() {
		Tache t= Tache(1,"");
		TacheController t1 = null;
		t1.ajouter("",null);
AssertEquals(t1,t);
	}
>>>>>>> remotes/origin/HAJARE-qestion5-2

}
