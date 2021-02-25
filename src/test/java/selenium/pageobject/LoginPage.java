package selenium.pageobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LoginPage {
	
public void testMethod() {
	
	List<String> al=new ArrayList<String>();
	al.add("Test1");
	al.add("add2");
	al.add("teset3");
	
	HashMap<String, List> hm=new HashMap<String,List>();
	hm.put("one1", al);
	System.out.println("list"+hm.get("one1"));
	
}
public static void main(String[] args) {
	LoginPage obj= new LoginPage();
	obj.testMethod();
}
}
