public class Methods {

    public void printKIP() {

        System.out.println("Knowledge is power");

        System.out.println(System.lineSeparator());

        System.out.println("Knowledge");
        System.out.println("is");
        System.out.println("power");

        System.out.println(System.lineSeparator());

        System.out.println("|==================|");
        System.out.println("|Knowledge is power|");
        System.out.println("|==================|");

    }

    public void doubleOp(double d1, double d2) {

        System.out.println("Sum : " + (d1 + d2));
        System.out.println("Difference : " + (d1 - d2));
        System.out.println("Product : " + (d1 * d2));

    }

    public void dFormula(double x, double y, double x1, double y1) {

        System.out.println("Distance : " + (Math.sqrt(Math.pow((x - x1), 2) + Math.pow((y - y1), 2))));

    }

    public void isLeap(int year) {

        if (year > 1582) {

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {

                        System.out.println("It is a Leap Year");

                    } else {

                        System.out.println("It is not a Leap Year");

                    }

                } else {

                    System.out.println("It is a Leap Year");

                }

            } else {

                System.out.println("It is a Leap Year");

            }
        }

    }

    public void countPunc(String test) {

        int place1 = 0;

        int place = 0;

        int pCount = 0;

        int sCount = 0;

        while (test.indexOf(".", place) != -1
                || test.indexOf("?", place) != -1
                || test.indexOf("!", place) != -1
                || test.indexOf(",", place) != -1
                || test.indexOf("\"", place) != -1
                || test.indexOf("'", place) != -1) {

            pCount++;
            place++;

        }

        while (test.indexOf(" ", place1) != -1) {

            sCount++;
            place1++;

        }

        System.out.println("Spaces : " +  sCount + " Punctuation marks : " + pCount);

    }





}
