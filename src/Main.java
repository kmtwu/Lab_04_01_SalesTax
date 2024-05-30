//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        double initialTotal = 10;
        double taxAmount;
        double afterTaxTotal;
        taxAmount = initialTotal * 0.05;
        afterTaxTotal = initialTotal * 1.05;
        System.out.println("Your initial price is " + initialTotal + ".");
        System.out.println("Your total is " + afterTaxTotal + " with a tax of " + taxAmount + ".");
    }
}