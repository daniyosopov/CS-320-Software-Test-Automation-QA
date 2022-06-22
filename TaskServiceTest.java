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
import week3.TaskService;

class TaskServiceTest {
	  protected String taskID, name, description, taskID2, name2, description2;
	  protected String update_taskID, update_name, update_description;
	  

	@BeforeEach 
	  void setUp() {
		  taskID = "7D1A8NI";
		  name = "Dani";
		  description = "good description";
		  
		  taskID2 = "ABCW5";
		  name2 = "Emunah";
		  description2 = "description two";
  
		  update_name = "Jacobs Yosopov";
		  update_description = "new description";
	  }
	  
	@Test
	void test_add_New_Task() {
		TaskService service = new TaskService();
		service.NewTask(taskID, name, description);
		 assertNotNull(service);
		 assertEquals(taskID, service.getTaskList().get(0).gettaskID());
		 assertEquals(name, service.getTaskList().get(0).getname());
		 assertEquals(description, service.getTaskList().get(0).getdescription());
	}
	
	@Test
	void test_add_Second_Task() {
		TaskService service = new TaskService();
		service.NewTask(taskID, name, description);
		 assertEquals(taskID, service.getTaskList().get(0).gettaskID());
		 assertEquals(name, service.getTaskList().get(0).getname());
		 assertEquals(description, service.getTaskList().get(0).getdescription());
		 
		 service.NewTask(taskID2, name2, description2);
		 assertEquals(taskID2, service.getTaskList().get(1).gettaskID());
		 assertEquals(name2, service.getTaskList().get(1).getname());
		 assertEquals(description2, service.getTaskList().get(1).getdescription());
		 assertNotNull(service);
		 
	}
	  
	@Test
	void test_delete_contact() throws Exception {
		TaskService service = new TaskService();
		service.NewTask(taskID, name, description);
		service.delete_task(taskID);
		assertThrows(Exception.class, () -> service.Search_task(taskID));
			 
	}

	@Test
	void test_update_name() throws Exception {
	    TaskService service = new TaskService();
	    service.NewTask(taskID, name, description);
	    service.updatename(taskID,update_name);
	    assertEquals(update_name, service.getTaskList().get(0).getname());
	}
	 
	@Test
	void test_update_description() throws Exception {
		TaskService service = new TaskService();
		service.NewTask(taskID, name, description);
	    service.updatedescription(taskID,update_description);
	    assertEquals(update_description, service.getTaskList().get(0).getdescription());
	}
	 
}
