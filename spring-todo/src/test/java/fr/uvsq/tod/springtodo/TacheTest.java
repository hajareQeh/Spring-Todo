package fr.uvsq.tod.springtodo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TacheTest {
@Test 
public void testCreation(){ 
Tache t1= new Tache(1,"marcher"); 
  assertEquals(t1.getId(),1); 
  assertEquals(t1.getContents(),"marcher");    
}

@Test 
public void test2(){ 

  Tache t2 = new Tache(0,"");
  assertTrue(t2==null);
}

@Test
public void test3() {
    Tache t3=new Tache(5,"ouvrir");
    assertNotEquals(t3.getId(),1); 
    assertNotEquals(t3.getContents(),"marcher");
}

}
