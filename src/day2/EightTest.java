package day2;

public class EightTest {
public static boolean hasEight(int number) {
	boolean result= false;
	//convert a int number to String
	String numberStr = String.valueOf(number);
	//Duyet qua tung ki tu trong String
	for (int i = 0; i < numberStr.length(); i++) {
		//so sanh tung ki tu trong String, neu chua ki tu 8 thi gan result = true va thoat khoi vong lap
		if(numberStr.charAt(i)=='8') {
			result = true;
			return result;
		}
	}
	
	return result; 
}
}
