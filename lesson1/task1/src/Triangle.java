public class Triangle {

    // Declare Instance variables for the three sides of the triangle
    private double smallSide; // "a" = smallSide in some comments
    private double mediumSide; // "b" = mediumSide in some comments
    private double largestSide; // "c" = largestSide in some comments

    // Constructor to set the three sides of the triangle to the default values
    public Triangle() {
        // default values if only .Triangle() is ran and not .Triangle(a,b,c)
        smallSide = 3;
        mediumSide = 4;
        largestSide = 5;
    }

    /* constructor to set the three sides of the triangle to any double value and sort small medium and large to the
    correct variable */
    public Triangle(double a, double b, double c) {

        // if c is bigger than a and also bigger than b set c to largestSide
        if (c > a && c > b) {
            largestSide = c;

            // if a is less then b set a to smallest and b to medium
            if (a < b) {
                smallSide = a;
                mediumSide = b;
            }
            // if a is not less then b set smallest to b and medium to a
            else {
                smallSide = b;
                mediumSide = a;
            }
        }

        // if a is bigger than c and also bigger than b set a to largestSide
        if (a > c && a > b) {
            largestSide = a;

            // if c is less then b set c to smallest and b to medium
            if (c < b) {
                smallSide = c;
                mediumSide = b;
            }
            // if c is not less then b set smallest to b and medium to c
            else {
                smallSide = b;
                mediumSide = c;
            }
        }

        // if b is bigger than a and also bigger than c set b to largestSide
        if (b > a && b > c) {
            largestSide = b;

            // if a is less then c set a to smallest and b to medium
            if (a < c) {
                smallSide = a;
                mediumSide = c;
            }
            // if a is not less then c set smallest to c and medium to a
            else {
                smallSide = c;
                mediumSide = a;
            }
        }
    }

    // smallSide accessor
    public double getSmall() {
        return smallSide;
    }

    // smallSide mutator
    public void setSmall(double smallSide) {
        this.smallSide = smallSide;
    }

    // mediumSide accessor
    public double getMedium() {
        return mediumSide;
    }

    // mediumSide mutator
    public void setMedium(double mediumSide) {
        this.mediumSide = mediumSide;
    }

    // largestSide accessor
    public double getLarge() {
        return largestSide;
    }

    // largestSide mutator
    public void setLarge(double largestSide) {
        this.largestSide = largestSide;
    }

    // returns boolean state of a + b > c
    public boolean isTriangle() {
        return smallSide + mediumSide > largestSide;
    }
    // return boolean of smallSide^2 + mediumSide^2 = largestSide^2 and in the tolerance of 0.1
    public boolean isRightTriangle() {
        double tolerance = 0.1; // amount of decimals places that will be tolerated
        boolean equal; // create boolean for equal equation
        // ((a^2 + b^2) - c^2) <= 0.1 as a boolean value
        equal = (((Math.pow(smallSide, 2)) + (Math.pow(mediumSide, 2))) - Math.pow(largestSide, 2)) <= tolerance;
        return equal; // return boolean of equal equation
    }

    // creates a variable that will be used as a placeholder for the .perimeter() and .area() method
    private double p;

    // method to return the perimeter of the triangle and stores it in variable p
    public double perimeter() {
        // p = perimeter of triangle (a + b + c)
        p = smallSide + mediumSide + largestSide;
        return p; // return double value of perimeter
    }

    // returns the area of the triangle using the Heron's formula:
    public double area() {

        // run the perimeter function to get the value of p as perimeter
        perimeter();

        // make p = half of p
        p = p / 2;

        // make p = to the Heron's formula with the values from the triangle
        p = Math.sqrt(p * (p - smallSide) * (p - mediumSide) * (p - largestSide));

        return p;
    }

    // returns and prints the values of the sides of the triangle
    public void displayTriangle() {
        /* Output:
            Smallest Side: (smallSide)
            Medium Side: (mediumSide)
            Largest Side: (largestSide)
         */
        System.out.println(("Smallest Side: " + smallSide + "\nMedium Side: " + mediumSide + "\nLargest Side: " + largestSide));
        return;
    }

}