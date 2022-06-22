/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	  private String uniqueID;
	  private List<Contact> contactList = new ArrayList<>();

	  public String Generator_uniqueID() {
		    return uniqueID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10)); 
	  }
	  
	  public void Newcontact(String uniqueID, String firstName, String lastName, String phone, String address) {
		  Contact contact = new Contact(uniqueID, firstName, lastName, phone, address);
		  contactList.add(contact);
	  }
	  
	  public List<Contact> getContactList() { 
		  return contactList; 
	  }

	  public Contact Search_contact(String uniqueID) throws Exception {
	    int i = 0;
	    while (i < contactList.size()) {
	      if (uniqueID.equals(contactList.get(i).getcontactID())) {
	        return contactList.get(i);
	      }
	      i++;
	    }
	    throw new Exception("this contact ID does not exist!");
	  }
	  
	  public void delete_contact(String uniqueID) throws Exception {
		  contactList.remove(Search_contact(uniqueID));
	  }
	  
	  public void updatefirstName(String uniqueID, String firstName) throws Exception {
		  Search_contact(uniqueID).setfirstName(firstName);
	  }

	  public void updatelastName(String uniqueID, String lastName) throws Exception {
		  Search_contact(uniqueID).setlastName(lastName);
	  }

	  public void updatephone(String uniqueID, String phone) throws Exception {
		  Search_contact(uniqueID).setphone(phone);
	  }

	  public void updateaddress(String uniqueID, String address) throws Exception {
		  Search_contact(uniqueID).setaddress(address);
	  }

}
	  
	  

	 