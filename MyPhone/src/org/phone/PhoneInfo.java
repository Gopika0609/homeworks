package org.phone;
public class PhoneInfo {
	public void phoneName() {
		System.out.println("Phone name");
		
	}
	public void phoneMieiNum() {
		System.out.println("phoneMieiNum");
		
	}
	public void Camera() {
		System.out.println("camera");
		
	}
	public void storage() {
		System.out.println("Storage");
		
	}
	public void osName() {
		System.out.println("osName");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Phone details");
		PhoneInfo Details = new PhoneInfo();
		Details.Camera();
		Details.phoneName();
		Details.phoneMieiNum();
		Details.storage();
		Details.osName();
	}

}
