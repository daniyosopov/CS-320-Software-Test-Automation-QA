/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week3.AppointmentService;

class AppointmentServiceTest {
	 protected String uniqueAppointmentID, appointmentDescription, uniqueAppointmentID2,appointmentDescription2;
	 protected Date appointmentDate, appointmentDate2;
	 
	 
	 @SuppressWarnings("deprecation")
	 @BeforeEach 
		 void setUp() {
		 uniqueAppointmentID = "7D1A8NI";
			appointmentDate = new Date(2025, Calendar.APRIL, 8);
			appointmentDescription = "good description";
			
			uniqueAppointmentID2 = "ABC4";
			appointmentDate2 = new Date(2025, Calendar.MAY, 10);
			appointmentDescription2 = "description two";
		}
	
	 @Test
		void test_add_New_Appointment() {
		 AppointmentService service = new AppointmentService();
		 service.NewAppointment(uniqueAppointmentID, appointmentDate, appointmentDescription);
		 assertNotNull(service);
		 assertEquals(uniqueAppointmentID, service.getAppointmentList().get(0).getappointmentID());
		 assertEquals(appointmentDate, service.getAppointmentList().get(0).getappoipntmentDate());
		 assertEquals(appointmentDescription, service.getAppointmentList().get(0).getappointmentDescription());
		 
		}
	 
	 @Test
		void test_add_Second_Appointment() {
		 AppointmentService service = new AppointmentService();
		 service.NewAppointment(uniqueAppointmentID, appointmentDate, appointmentDescription);
		 assertEquals(uniqueAppointmentID, service.getAppointmentList().get(0).getappointmentID());
		 assertEquals(appointmentDate, service.getAppointmentList().get(0).getappoipntmentDate());
		 assertEquals(appointmentDescription, service.getAppointmentList().get(0).getappointmentDescription());
		 
		 service.NewAppointment(uniqueAppointmentID2, appointmentDate2, appointmentDescription2);
		 assertEquals(uniqueAppointmentID2, service.getAppointmentList().get(1).getappointmentID());
		 assertEquals(appointmentDate2, service.getAppointmentList().get(1).getappoipntmentDate());
		 assertEquals(appointmentDescription2, service.getAppointmentList().get(1).getappointmentDescription());
		 assertNotNull(service);
		 
		}
		  
		@Test
		void test_delete_Appointment() throws Exception {
			AppointmentService service = new AppointmentService();
			service.NewAppointment(uniqueAppointmentID, appointmentDate, appointmentDescription);
			service.delete_appointment(uniqueAppointmentID);
			assertThrows(Exception.class, () -> service.Search_appointment(uniqueAppointmentID));
				 
		}
}
