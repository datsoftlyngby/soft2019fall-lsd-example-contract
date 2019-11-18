/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.example.contract;

import dk.cphbusiness.example.contract.dto.PersonSummary;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author AKA
 */
public class PersonManagerTest {
  
  public PersonManagerTest() {
  }
  
  @Test 
  public void testNumberOfPeople() {
    Collection<PersonSummary> people = Holder.manager.list();
    assertEquals(people.size(), 3);
            
    }
  
}
