/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Model.*;

/**
 *
 * @author mzeferino
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
 
    //TODO: Tester giveCard
    
    
    
    /**
     * Test of giveCard method, of class Deck.
     */
    @Test
    public void testGiveCard() {
        System.out.println("giveCard");
       Deck deck = new Deck(0,0);
       Card card = new Card (COLOR.SPADE, 7);
       deck.giveCard( card , deck);
        assertEquals(deck.getCards().getLast(), card);
  
        fail("Erreur giveCard DeckModel : la carte donnée n'est pas la même que celle passée en paramètre ");
    }

//set changed
//notify observers


    /**
     * Test of add method, of class Deck.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Card card = new Card(COLOR.SPADE, 2);
        Card cardexp = new Card(COLOR.SPADE, 2);
        Deck instance = new Deck (0,0);
        instance.add(card);
        assertEquals (instance.getCards().getLast(), cardexp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
