package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
    
    @Test
    public void canSetAPersonNameWithSetter(){
    	Person person = new Person();
    	person.setName("Larry");
    	assertEquals("Larry", person.getName());
    }
}
