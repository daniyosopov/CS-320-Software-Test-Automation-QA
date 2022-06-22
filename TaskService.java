/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {
	private String uniqueTaskID;
	private List<Task> TaskList = new ArrayList<>();

	public String Generator_uniqueID() {
		return uniqueTaskID = UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10)); 
	}
	
	public void NewTask(String uniqueTaskID, String name, String description) {
		Task task = new Task(uniqueTaskID, name, description);
		TaskList.add(task);
	}
		  
	public List<Task> getTaskList() { 
		return TaskList; 
	}

	public Task Search_task(String uniqueTaskID) throws Exception {
		int i = 0;
	    while (i < TaskList.size()) {
	      if (uniqueTaskID.equals(TaskList.get(i).gettaskID())) {
			return TaskList.get(i);
	      }
	      i++;
	    }
	    throw new Exception("this contact ID does not exist!");
	}
	  
	public void delete_task(String uniqueTaskID) throws Exception {
		TaskList.remove(Search_task(uniqueTaskID));
	}
	  
	public void updatename(String uniqueTaskID, String name) throws Exception {
		Search_task(uniqueTaskID).setname(name);
	}

	public void updatedescription(String uniqueTaskID, String description) throws Exception {
		Search_task(uniqueTaskID).setdescription(description);
	}

}
