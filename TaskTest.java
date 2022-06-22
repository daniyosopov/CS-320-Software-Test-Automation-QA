/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week3.Task;

class TaskTest {
	  protected String taskID, name, description;
	  protected String too_Long_taskID, too_Long_name, too_Long_description;
	  

	@BeforeEach 
	  void setUp() {
		  taskID = "7D1A8NI";
		  name = "Dani";
		  description = "good description";
  
		  too_Long_taskID = "718DE78A227Q";
		  too_Long_name = "Christopher is one long name";
		  too_Long_description = "This will be the longest description ever made by me";
	  }
	  
	 @Test
	 void testTask() {
		 Task task = new Task(taskID, name, description );
		 assertNotNull(task.gettaskID());
		 assertNotNull(task.getname());
		 assertNotNull(task.getdescription());
	 }
	 
	  @Test
	  void testEquals() {
	    Task task = new Task(taskID, name, description);
	    assertEquals(taskID, task.gettaskID());
	    assertEquals(name, task.getname());
	    assertEquals(description, task.getdescription());
	  }
	  
	  @Test
		void testAllNullErrors() {
			assertThrows(IllegalArgumentException.class, () -> new Task(null,null,null));
		}
		
		@Test
		void testNullError_taskID() {
			assertThrows(IllegalArgumentException.class, () -> new Task(null, name, description ));
		}
		
		@Test
		void testNullError_name() {
			assertThrows(IllegalArgumentException.class, () -> new Task(taskID, null, description));
		}
		
		@Test
		void testNullError_description() {
			assertThrows(IllegalArgumentException.class, () -> new Task(taskID, name, null));
		}
		
		@Test
		void testAllTooLong() {
			assertThrows(IllegalArgumentException.class, () -> new Task(too_Long_taskID, too_Long_name, too_Long_description));
		}
		
		@Test
		void testTooLong_taskID() {
			assertThrows(IllegalArgumentException.class, () -> new Task(too_Long_taskID, name, description));
		}
		
		@Test
		void testTooLong_name() {
			assertThrows(IllegalArgumentException.class, () -> new Task(taskID,too_Long_name,description));
		}
		
		@Test
		void testTooLong_description() {
			assertThrows(IllegalArgumentException.class, () -> new Task(taskID,name,too_Long_description));
		}
		
}
