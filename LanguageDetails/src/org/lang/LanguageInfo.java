package org.lang;
public class LanguageInfo {
 public void tamilLanguage() {
	 System.out.println("Tamil");
}
 public void englishLanguage() {
	 System.out.println("English");
}
 public void hindiLanguage() {
	 System.out.println("hindi");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Languages");
		LanguageInfo Lang =new LanguageInfo();
		Lang.hindiLanguage();
		Lang.tamilLanguage();
		Lang.englishLanguage();
	}
}
