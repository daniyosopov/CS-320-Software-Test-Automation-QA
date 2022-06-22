/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;
import week3.Appointment;


class AppointmentTest {
	 protected String appointmentID, appointmentDescription;
	 protected Date appointmentDate;
	 
	 protected String too_Long_appointmentID, too_Long_appointmentDescription;
	 protected Date past_appointmentDate;
	 
		@SuppressWarnings("deprecation")
		@BeforeEach 
		  void setUp() {
	      
			appointmentID = "7D1A8NI";
			appointmentDate = new Date(2025, Calendar.APRIL, 8);
			appointmentDescription = "good description";
			
			past_appointmentDate = new Date(0);
			too_Long_appointmentID = "718DE78A227Q";
			too_Long_appointmentDescription = "This will be the longest description ever made by me";

		}
	 
		
		 @Test
		 void testAppointment() {
			 Appointment appointment = new Appointment(appointmentID,appointmentDate,appointmentDescription);
			 assertNotNull(appointment.getappointmentID());
			 assertNotNull(appointment.getappoipntmentDate());
			 assertNotNull(appointment.getappointmentDescription());
		 }
		 
		  @Test
		  void testEquals() {
			Appointment appointment = new Appointment(appointmentID, appointmentDate, appointmentDescription);
		    assertEquals(appointmentID, appointment.getappointmentID());
		    assertEquals(appointmentDate, appointment.getappoipntmentDate());
		    assertEquals(appointmentDescription, appointment.getappointmentDescription());
		  }
	  
	  @Test
		void testAllNullErrors() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(null,null,null));
		}
		
		@Test
		void testNullError_appointmentID() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(null, appointmentDate, appointmentDescription ));
		}
		
		@Test
		void testNullError_appointmentDate() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(appointmentID, null, appointmentDescription));
		}
		
		@Test
		void testNullError_appointmentDescription() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(appointmentID, appointmentDate, null));
		}
		
		@Test
		void testAlwronginput() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(too_Long_appointmentID, past_appointmentDate, too_Long_appointmentDescription));
		}
		
		@Test
		void testTooLong_appointmentID() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(too_Long_appointmentID, appointmentDate, appointmentDescription));
		}
		
		@Test
		void testPast_appointmentDate() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(appointmentID,past_appointmentDate,appointmentDescription));
		}
		
		@Test
		void testTooLong_appointmentDescription() {
			assertThrows(IllegalArgumentException.class, () -> new Appointment(appointmentID,appointmentDate,too_Long_appointmentDescription));
		}
		

}
