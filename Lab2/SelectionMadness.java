public class SelectionMadness {
    // no instance variables //
    
    public SelectionMadness() { }

    /* Returns 1 of 5 randomly generated fortunes as a string;
        you should write your own 5 fortunes! (see output for examples)
    */
    public String fortune() {
        /* implement this method */
        int rand = (int) (Math.random() * 5);

        if (rand == 0) {
            return "you will become very rich";
        } else if (rand == 1) {
            return "you will become a scientist";
        } else if (rand == 2) {
            return "you will win the lottery";
        } else if (rand == 3) {
            return "you will graduate top of your class";
        } else {
            return "your ap exam score will be a 5";
        }
    }

    /* Returns the largest of three provided integers: num1, num2, or num3
    */
    public int largest(int num1, int num2, int num3) {
        /* implement this method */
        int highest;
        highest = num1;
        if (num2 > num1) {
            highest = num2;
        }
        if (num3 > num1) {
            highest = num3;
        }
        return highest;
    }

    /* Returns true if the three provided lengths create a right triangle, in
    other words, a2 + b2 = c2, where c is the longest side; returns false
    Otherwise (hint: use the largest() method that you wrote).
    Note the "largest" side could be any of the 3 numbers, i.e. your method
    should work if side1 = 3, side2 = 4, and side3 = 5 and also if
    side1 = 5, side2 = 4, and side3 = 3
    */
    public boolean rightTriangle(int side1, int side2, int side3) {
        /* implement this method */
        int dside1 = (int) Math.pow(((double) side1), 2);
        int dside2 = (int) Math.pow(((double) side2), 2);
        int dside3 = (int) Math.pow(((double) side3), 2);
        return (dside1 + dside2 == dside3 || dside2 + dside3 == dside1 || dside1 + dside3 == dside2);
    }
}
