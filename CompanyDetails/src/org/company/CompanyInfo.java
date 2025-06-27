package org.company;
public class CompanyInfo {
	public void companyName(){
		System.out.println("Company Name");
		
	}
	public void companyId(){
		System.out.println("Company id");
		
	}
	public void companyAddress(){
		System.out.println("Company Address");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Company info");
CompanyInfo information = new CompanyInfo ();
information.companyAddress();
information.companyId();
information.companyName();
	}

}
