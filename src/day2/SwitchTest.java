package day2;

import java.util.Scanner;

import org.openqa.selenium.By;

public class SwitchTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao n: ");
//		int n = sc.nextByte();
//		SwitchTest.dayOfWeek(n);
		
		SwitchTest.getLocator("id","userName");
		
	}
	public static void dayOfWeek(int n) {
		switch (n) {
		case 2:
			System.out.println("Thu Hai ");
			break;
		case 3:
			System.out.println("Thu Ba ");
			break;
		case 4:
			System.out.println("Thu Tu");
			break;
		case 5:
			System.out.println("Thu Nam");
			break;
		case 6:
			System.out.println("Thu Sau");
			break;
		case 7:
			System.out.println("Thu Bay");
			break;
		case 8:
			System.out.println("Chu nhat");
			break;
		default:
			System.out.println("Nhap lai n ");
		}
	}
	
	public static By getLocator(String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case "id": {
			result= By.id(locatorValue);
					break;
		}
		case "name":{
			result= By.name(locatorValue);
					break;
		}
		case "linkText": {
			result= By.linkText(locatorValue);
					break;
		}
		case "cssSelector": {
			result= By.cssSelector(locatorValue);
					break;
		}
		case "partialLinkText": {
			result= By.partialLinkText(locatorValue);
					break;
		}
		case "tagName": {
			result= By.tagName(locatorValue);
					break;
		}
		case "xpath": {
			result= By.xpath(locatorValue);
					break;
		}
		default:
			System.out.println("Locator is invalid");
		}
		return result;
	}
}
