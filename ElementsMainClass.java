package Selenium_Assignment;

public class ElementsMainClass extends ButtonSubClass {

	public static void main(String[] args) {
		
		ElementsMainClass emc = new ElementsMainClass();
		emc.click();
		emc.setText("Sruthi");
		emc.submit();
		TextFieldSubClass tfc = new TextFieldSubClass();
		tfc.click();tfc.setText("Anil");
		CheckBoxButtonSubClass cbc = new CheckBoxButtonSubClass();
		cbc.click();
		cbc.clickCheckBoxButton();
		cbc.setText("Mahanya");
		cbc.submit();
		RadioButtonSubClass rbc = new RadioButtonSubClass();
		rbc.click();
		rbc.selectRadioButton();
		rbc.setText("abc");
		rbc.submit();

	}

}
