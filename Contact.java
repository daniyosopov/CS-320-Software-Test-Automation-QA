/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package week3;

public class Contact {
		private String contactID;
		private String firstName;
		private String lastName; 
		private String phone;
		private String address;
		
		public Contact(String contactID, String firstName, String lastName, String phone, String address) {
			if(contactID == null || contactID.length() > 10) {
				throw new IllegalArgumentException("Invalid contact ID");
			}
			else
				this.contactID = contactID;
			
			if(firstName == null || firstName.length() > 10) {
				throw new IllegalArgumentException("Invalid First Name");
			}
			else
				this.firstName = firstName;
			
			if(lastName == null || lastName.length() > 10) {
				throw new IllegalArgumentException("Invalid Last Name");
			}
			else
				this.lastName = lastName;
			
			if( phone == null || phone.length() != 10) {
				throw new IllegalArgumentException("Invalid Phone");
			}
			else
				this.phone = phone;
			
			if(address == null || address.length() > 30) {
				throw new IllegalArgumentException("Invalid Address");	
			}
			else
				this.address = address;
		}
		
		public String getcontactID() {
			return contactID;
		}
		public String getfirstName() {
			return firstName;
		} 
		public String getlastName() {
			return lastName;
		}
		public String getphone() {
			return phone;
		}
		public String getaddress() {
			return address;
		}
		
		public void setcontactID(String contactID) {
			this.contactID = contactID;
		}
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		} 
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}
		public void setphone(String phone) {
			this.phone = phone;
		}
		public void setaddress(String address) {
			this.address = address;
		}
}
