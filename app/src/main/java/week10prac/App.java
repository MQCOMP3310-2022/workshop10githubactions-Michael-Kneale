/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package week10prac;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public boolean isValidGregorianDate(int day, int month, int year) {
        //note, will only allow years starting from year 1 onward. (no BC years in this example)
        
        //find different false conditions
        // otherwise, if none found, then return true.

        //check for negative values
        if(day <=0 || month <=0 || year <=0){
            return false;
        }

        if(day >= 32 || month >= 13){
            return false;
        }

        //add your own checks here
        if(day == 31 && month == 4) {
            return false;
        }

        if(day == 31 && month == 6) {
            return false;
        }

        if(day == 31 && month == 9) {
            return false;
        }

        if(day == 31 && month == 11) {
            return false;
        }

        if(day != 28 && day != 29 && month == 2) {
            return false;
        }

        if(day == 29 && month == 2 && year % 4 == 0) {
            return false;
        }

        if(day >= 3 || day <= 13 && month == 9 && year == 1752) {
            return false;
        }
        //Some thoughts: 
        //  what about days of the month?
        //  what about leap years?
        //  there are also some other weird events in the Gregoryan calendar


        return true;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
