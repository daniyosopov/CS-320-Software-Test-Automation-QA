/*
 * Dani Yosopov
 * CS320 Albanie Bolton
 * 06/10/2022
 */
package week3;

public class Task {
	private String taskID;
	private String name;
	private String description;
	
	public Task(String taskID, String name, String description) {
		if(taskID == null || taskID.length() > 10) {
			throw new IllegalArgumentException("Invalid task ID");
		}
		else
			this.taskID = taskID;
		
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}
		else
			this.name = name;
		
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		else
			this.description = description;
	}
	
	public String gettaskID() {
		return taskID;
	}
	public String getname() {
		return name;
	} 
	public String getdescription() {
		return description;
	}

	
	public void settaskID(String taskID) {
		this.taskID = taskID;
	}
	public void setname(String name) {
		this.name = name;
	} 
	public void setdescription(String description) {
		this.description = description;
	}
}

