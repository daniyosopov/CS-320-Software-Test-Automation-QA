/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week3.Contact;

class ContactTest {
	
	  protected String contactID, firstName, lastName, phone,
      	address;
	  protected String too_Long_contactID, too_Long_firstName, too_Long_lastName,
      	too_Long_phone, too_Short_phone, too_Long_address;
	  
	  @BeforeEach
	  void setUp() {
		  contactID = "7D1A8NI";
		  firstName = "Dani";
		  lastName = "Yosopov";
		  phone = "2103333089";
		  address = "102-50 62nd rd, New York City";
		  
		  too_Long_contactID = "718DE78A227Q";
		  too_Long_firstName = "Christopher";
		  too_Long_lastName = "Jacobs Yosopov";
		  too_Long_phone = "210220769984";
		  too_Short_phone = "9295333";
		  too_Long_address = "1904 Willow Creek Dr, Austin TX 78741";
	  }

	@Test
	void testContact() {
	    Contact contact = new Contact(contactID,firstName,lastName,phone,address);
	    assertNotNull(contact.getcontactID());
	    assertNotNull(contact.getfirstName());
	    assertNotNull(contact.getlastName());
	    assertNotNull(contact.getphone());
	    assertNotNull(contact.getaddress());
	}
	
	  @Test
	  void testEquals() {
	    Contact contact = new Contact(contactID,firstName,lastName,phone,address);
	    assertEquals(contactID, contact.getcontactID());
	    assertEquals(firstName, contact.getfirstName());
	    assertEquals(lastName, contact.getlastName());
	    assertEquals(phone, contact.getphone());
	    assertEquals(address, contact.getaddress());
	  }
	 
	@Test
	void testAllNullErrors() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(null,null,null,null,null));
	}
	
	@Test
	void testNullError_contactID() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(null,firstName,lastName,phone,address));
	}
	
	@Test
	void testNullError_firstName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,null,lastName,phone,address));
	}
	
	@Test
	void testNullError_lastName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,firstName,null,phone,address));
	}
	
	@Test
	void testNullError_phone() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,firstName,lastName,null,address));
	}
	
	@Test
	void testNullError_address() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,firstName,lastName,phone,null));
	}
	
	@Test
	void testAllTooLong() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(too_Long_contactID,too_Long_firstName,too_Long_lastName,too_Long_phone,too_Long_address));
	}
	
	@Test
	void testTooLong_contactID() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(too_Long_contactID,firstName,lastName,phone,address));
	}
	
	@Test
	void testTooLong_firstName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,too_Long_firstName,lastName,phone,address));
	}
	
	@Test
	void testTooLong_lastName() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,firstName,too_Long_lastName,phone,address));
	}
	
	@Test
	void testTooLong_phone() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,firstName,lastName,too_Long_phone,address));
	}
	
	void testTooShort_phone() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,firstName,lastName,too_Short_phone,address));
	}
	
	@Test
	void testTooLong_address() {
		assertThrows(IllegalArgumentException.class, () -> new Contact(contactID,firstName,lastName,phone,too_Long_address));
	}
		
}