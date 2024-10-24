public class NumberStuff {


    public NumberStuff() { }
 
 
    public String positiveZeroOrNegative(int num) {
        if (num > 0) {
            return num + " is a positive number";
        } else if (num == 0) {
            return num + " isn't positive or negative";
        } else if (num < 0) {
            return num + " is a negative number";
        } else {
            return "";
        }
    }
 }
 