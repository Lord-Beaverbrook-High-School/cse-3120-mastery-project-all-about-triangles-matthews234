public class TriangleRunner{

    public static void main(String args[]) {
    Triangle tri = new Triangle();
        // Expected: set tri to the default values of  a = 3.0, b = 4.0 and c = 5.0

    Triangle tri2 = new Triangle(27, 12, 13.5);
        // Expected: set tri2 to the double values a = 12.0, b = 13.5 and c = 27.0

    Triangle tri3 = new Triangle(9, 7.5, 3.1);
        // Expected: set tri3 to the double values a = 3.1, b = 7.5 and c = 9

    Triangle tri4 = new Triangle(8.54, 3, 8);
        // Expected: set tri4 to the double values a = 3, b = 8 and c = 8.54

    Triangle tri5 = new Triangle(4, 7.25, 4);
        // Expected: set tri5 to the values a = 4.0 b = 4.0 and c = 7.25

    tri.displayTriangle();
    /*  Expected:
            Smallest Side = 3.0
            Medium Side = 4.0
            Largest Side = 5.0
        Actual:
            Smallest Side: 3.0
            Medium Side: 4.0
            Largest Side: 5.0   */

    System.out.println(tri.isTriangle());
    /*  Expected:
            true
        Actual:
            true    */

    tri2.displayTriangle();
    /*  Expected:
            Smallest Side = 12.0
            Medium Side = 13.5
            Largest Side = 27.0
        Actual:
            Smallest Side: 12.0
            Medium Side: 13.5
            Largest Side: 27.0   */

    System.out.println(tri2.isTriangle());
    /* Expected:
            false
       Actual:
            false */

    tri2.setLarge(2 + tri2.getMedium());
    /* Expected:
            set the value of largestSide to 14.0
       Actual:
            largestSide = 14.0  */


    System.out.println(tri2.isTriangle());
    /*  Expected:
            true
        Actual:
            true */

    System.out.println("Tri #3 Perimeter: " + tri3.perimeter());
    /* Expected:
            Tri #3 Perimeter: 19.6
       Actual:
            Tri #3 Perimeter: 19.6
     */

    System.out.println("Tri #3 Area: " + tri3.area());
    /* Expected:
            Tri #3 Area: 10.991560398778699
       Actual:
            Tri #3 Area: 10.991560398778699
     */

    System.out.println(tri4.isRightTriangle());
     /* Expected:
            true
       Actual:
            true
     */

    }
}


























