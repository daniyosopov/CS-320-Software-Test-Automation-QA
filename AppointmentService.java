/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Date;

public class AppointmentService {
	private String uniqueAppointmentID;
	private List<Appointment> AppointmentList = new ArrayList<>();
	
	public String Generator_uniqueID() {
		return uniqueAppointmentID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10)); 
	}
	
	public void NewAppointment(String uniqueAppointmentID, Date appointmentDate, String appointmentDescription) {
		Appointment appointment = new Appointment(uniqueAppointmentID, appointmentDate, appointmentDescription);
		AppointmentList.add(appointment);
	}

	public List<Appointment> getAppointmentList() { 
		return AppointmentList; 
	}
	
	public Appointment Search_appointment(String uniqueAppointmentID) throws Exception {
		int i = 0;
	    while (i < AppointmentList.size()) {
	      if (uniqueAppointmentID.equals(AppointmentList.get(i).getappointmentID())) {
			return AppointmentList.get(i);
	      }
	      i++;
	    }
	    throw new Exception("this contact ID does not exist!");
	}
	
	public void delete_appointment(String uniqueAppointmentID) throws Exception {
		AppointmentList.remove(Search_appointment(uniqueAppointmentID));
	}
}
