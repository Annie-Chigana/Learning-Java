//Filename SalaryDialog.Java
//Written by Annie
//Written on 18/06/2025
package salarydialog;

import javax.swing.JOptionPane;

public class SalaryDialog {

    public static void main(String[] args) {
        
        String wageString, dependentsString;
        double weeklyPay;
        int dependents;
        final double HOURS_IN_WEEK = 37.5;
        
        int selection;
        boolean isYes;
        
        wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
        dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
        dependents = Integer.parseInt(dependentsString);
        
        
        selection = JOptionPane.showConfirmDialog(null, "Confirm that you work 37.5 hours in a week");
        
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, isYes + "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
    }
    
}
