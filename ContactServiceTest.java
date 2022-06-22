/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week3.ContactService;

class ContactServiceTest {
	
	  protected String uniqueID, firstName, lastName, phone,
    	address, uniqueID2, firstName2, lastName2, phone2,
    	address2;
	  protected String update_firstName, update_lastName,
	  update_phone, update_address;
	  
	  @BeforeEach
	  void setUp() {
		  uniqueID = "7D1A8NI";
		  firstName = "Dani";
		  lastName = "Yosopov";
		  phone = "2103333089";
		  address = "102-50 62nd rd, New York City";
		  
		  uniqueID2 = "ABCDEF";
		  firstName2 = "Emunah";
		  lastName2 = "Jacobs";
		  phone2 = "2102207671";
		  address2 = "1904 Willow Creek Austin TX";
		  
		  
		  update_firstName = "Christopher";
		  update_lastName = "Jacobs Yosopov";
		  update_phone = "210220769984";
		  update_address = "1904 Willow Creek Dr, Austin TX 78741";
	  }
	  
	@Test
	void test_add_New_contact() {
		ContactService service = new ContactService();
		service.Newcontact(uniqueID, firstName, lastName, phone, address);
		 assertNotNull(service);
		 assertEquals(uniqueID, service.getContactList().get(0).getcontactID());
		 assertEquals(firstName, service.getContactList().get(0).getfirstName());
		 assertEquals(lastName, service.getContactList().get(0).getlastName());
		 assertEquals(phone, service.getContactList().get(0).getphone());
		 assertEquals(address, service.getContactList().get(0).getaddress());
		 service.Newcontact(uniqueID2, firstName2, lastName2, phone2, address2);

		 
	}
	
	@Test
	void test_add_Second_contact() {
		ContactService service = new ContactService();
		service.Newcontact(uniqueID, firstName, lastName, phone, address);
	
		 assertEquals(uniqueID, service.getContactList().get(0).getcontactID());
		 assertEquals(firstName, service.getContactList().get(0).getfirstName());
		 assertEquals(lastName, service.getContactList().get(0).getlastName());
		 assertEquals(phone, service.getContactList().get(0).getphone());
		 assertEquals(address, service.getContactList().get(0).getaddress());
		 
		 service.Newcontact(uniqueID2, firstName2, lastName2, phone2, address2);
		 assertEquals(uniqueID2, service.getContactList().get(1).getcontactID());
		 assertEquals(firstName2, service.getContactList().get(1).getfirstName());
		 assertEquals(lastName2, service.getContactList().get(1).getlastName());
		 assertEquals(phone2, service.getContactList().get(1).getphone());
		 assertEquals(address2, service.getContactList().get(1).getaddress());
		 
		 assertNotNull(service);
		 
	}

	@Test
	void test_delete_contact() throws Exception {
		ContactService service = new ContactService();
		service.Newcontact(uniqueID, firstName, lastName, phone, address);
		service.delete_contact(uniqueID);
		assertThrows(Exception.class, () -> service.Search_contact(uniqueID));
		 
	}
	
	@Test
	void test_update_firstName() throws Exception {
	   ContactService service = new ContactService();
	   service.Newcontact(uniqueID, firstName, lastName, phone, address);
	   service.updatefirstName(uniqueID,update_firstName);
	   assertEquals(update_firstName, service.getContactList().get(0).getfirstName());
	}
	 
	@Test
	void test_update_lastName() throws Exception {
	   ContactService service = new ContactService();
	   service.Newcontact(uniqueID, firstName, lastName, phone, address);
	   service.updatelastName(uniqueID,update_lastName);
	   assertEquals(update_lastName, service.getContactList().get(0).getlastName());
	}
	 
	@Test
	void test_update_phone() throws Exception {
	   ContactService service = new ContactService();
	   service.Newcontact(uniqueID, firstName, lastName, phone, address);
	   service.updatephone(uniqueID,update_phone);
	   assertEquals(update_phone, service.getContactList().get(0).getphone());
	}
	 
	@Test
	void test_update_address() throws Exception {
	   ContactService service = new ContactService();
	   service.Newcontact(uniqueID, firstName, lastName, phone, address);
	   service.updateaddress(uniqueID,update_address);
	   assertEquals(update_address, service.getContactList().get(0).getaddress());
	}
}
