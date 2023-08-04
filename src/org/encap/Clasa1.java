package org.encap;

public class Clasa1 {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.equals("ajith")) {
			this.name="10000";
			
		} else if (name.equals("vijay")) {
			this.name="20000";
			
		}else {
			this.name="incorrect name";
		} 

		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id==1000) {
			this.id=1;
		} else if (id ==2000) {
			this.id=2;
		}else{
			this.id=0;

		}
	}
	
	
	
	

}
