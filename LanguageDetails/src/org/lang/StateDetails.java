package org.lang;
public class StateDetails {
	public void southIndia() {
		System.out.println("South");
	}
	public void northIndia() {
		System.out.println("North");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Details of state");
StateDetails State = new StateDetails();
State.southIndia();
State.northIndia();
	}

}
