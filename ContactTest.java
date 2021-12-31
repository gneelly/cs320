package cs320mod5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    
    public ContactTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    //test get functions
    @Test
    public void testGetContactID() {
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        String expResult = "12345678";
        String result = instance.getContactID();
        assertEquals(result,expResult);
        
    }

    @Test
    public void testGetFirstName() {
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        String expResult = "John";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetLastName() {
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        String expResult = "Doe";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetAddress() {
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        String expResult = "123 North Drive";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetNumber() {
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        String expResult = "5555555555";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        
    }
    
    //test Setters
    
    @Test
    public void testSetContactID() {
        String contact = "12345699";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        instance.setContactID(contact);
        assertEquals(contact,instance.getContactID());
        
    }

    @Test
    public void testSetFirstName() {
        String firstName = "Jane";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        instance.setFirstName(firstName);
        assertEquals(firstName,instance.getFirstName());
        
    }

    @Test
    public void testSetLastName() {
        String lastName = "Baner";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        instance.setLastName(lastName);
        assertEquals(lastName,instance.getLastName());
        
    }
  
    @Test
    public void testSetNumber() {
        String Number = "1234237789";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        instance.setPhoneNumber(Number);
        assertEquals(Number,instance.getPhoneNumber());
        
    }
    
    @Test
    public void testSetAddress() {
        String Address = "123 N Ave";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        instance.setAddress(Address);
        assertEquals(Address,instance.getAddress());
        
    }

    @Test
    public void testValidateContactID() {
        String contactID = "";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        boolean expResult = false;
        boolean result = instance.validateContactID(contactID);
        assertEquals(expResult, result);
        
    }
  
    @Test
    public void testValidatefirstName() {
        String firstName = "";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        boolean expResult = false;
        boolean result = instance.validatefirstName(firstName);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testValidatelastName() {
        String lastName = "";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        boolean expResult = false;
        boolean result = instance.validatelastName(lastName);
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testValidateNumber() {
    	Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
    	String number = "12345678";
    	assertEquals(true,instance.validateNumber(number));
    }

    
    @Test
    public void testValidateAddress() {
        String Address = "";
        Contact instance = new Contact("12345678", "John", "Doe", "5555555555", "123 North Drive");
        boolean result = instance.validateAddress(Address);
        assertEquals(false, result);
        
    }
    
}
