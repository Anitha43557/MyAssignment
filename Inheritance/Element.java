package week3.day2.Inheritance;

public class Element extends Button {
    public static void main(String[] args) {
        //webelement
        Webelement.ee = new Webelement();
        ee.click();
        ee.settext();
        //Button
        Button.bt = new Button();
        bt.click();
        bt.submit();
        //Textfield
        Textfield.tf = new Textfield();
       tf.getText();
       // CheckBoxButton
        Checkboxbutton cb = new Checkboxbutton();
        cb.click();
        cb.clickCheckButton();
// RadioButton
        Radiobutton rb = new Radiobutton();
        rb.click();
        rb.selectRadioButton();
    }

}
