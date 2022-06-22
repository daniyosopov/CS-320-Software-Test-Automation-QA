/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package week3;

import java.util.Date;

public class Appointment {
	private String appointmentID;
	private Date appoipntmentDate;
	private String appointmentDescription;
	  
	public Appointment(String appointmentID, Date appoipntmentDate, String appointmentDescription) {
		Date date =new Date();
		
		if(appointmentID == null || appointmentID.length() > 10) {
			throw new IllegalArgumentException("Invalid appointment ID");
		}
		else
			this.appointmentID = appointmentID;
		if(appoipntmentDate == null || (appoipntmentDate.before(date)) == true) {
			throw new IllegalArgumentException("Invalid appointment Date");
		}
		else
			this.appoipntmentDate = appoipntmentDate;
		if(appointmentDescription == null || appointmentDescription.length() > 50) {
			throw new IllegalArgumentException("Invalid appointment Description");
		}
		else
			this.appointmentDescription = appointmentDescription;
	}
	
	public String getappointmentID() {
		return appointmentID;
	}
	 public Date getappoipntmentDate() { 
		 return appoipntmentDate; 
		 }
	 
	public String getappointmentDescription() {
		return appointmentDescription;
	}

	public void setappointmentID(String appointmentID) {
		this.appointmentID = appointmentID;
	}
	public void setappoipntmentDate(Date appoipntmentDate) {
		this.appoipntmentDate = appoipntmentDate;
	} 
	public void setappointmentDescription(String appointmentDescription) {
		this.appointmentDescription = appointmentDescription;
	}

}
