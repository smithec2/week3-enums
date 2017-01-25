package edu.ldsbc.types;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by XPS on 1/21/2017.
 */
public class PersonTest {
    @Test
    public void toStringTest() throws Exception {

        Person person = new Person("Craig", 29, Gender.MALE, MaritalStatus.MARRIED);
        assertEquals("Person{name='Craig', age=29, gender=MALE, maritalStatus=MARRIED}", person.toString());

        person = new Person();
        person.setName("Chan");
        person.setAge(28);
        person.setGender(Gender.MALE);
        person.setMaritalStatus(MaritalStatus.SINGE);
        assertEquals("Person{name='Chan', age=28, gender=MALE, maritalStatus=SINGE}", person.toString());


    }

}