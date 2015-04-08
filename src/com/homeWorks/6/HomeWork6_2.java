/**
 * Created by n1kropol on 08.04.2015.
 */
public class HomeWork6_2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        String s = "Hello";
        String m = multiply(s, 5);
        System.out.println(m);
        // HelloHelloHelloHelloHello
        System.out.println(multiply(s, b));
        // HelloHelloHello
        System.out.println(multiplyNewLine("NewLine", a));
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        System.out.println(multiplyNewLine("Hey, this one on new line", 3));
        // Hey, this one on new line
        // Hey, this one on new line
        // Hey, this one on new line
        doubleAndPrint("TwoTimes");
        // TwoTimesTwoTimes
        doubleAndPrint("StillTwoTimes");
        // StillTwoTimesStillTwoTimes
        System.out.println(multiply(3, "switch"));
        // switchswitchswitch
        System.out.println(multiply(1, "switchAgain"));
        // switchAgain
/////////////////////////////// task 2 ////////////////////////////////////
        if (func1(5).equals("150")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Expected 150, Actual: " + func1(5));
            System.out.println("Please fix the functions.");
        }

        if (func1(0).equals("0")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Expected 0, Actual: " + func1(0));
            System.out.println("Please fix the functions.");
        }

        if (func1(100).equals("41000")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Expected 41000, Actual: " + func1(100));
            System.out.println("Please fix the functions.");
        }
      /////////////////// end task 2////////////////////
    }
     //////////////////// task 2 methods ///////////////
    public static String func3(int u, int p) {
        return "" + (u * (p - 1));
    }

    public static String func1(int y) {
        return func2(y * 2);
    }

    public static String func2(int n) {
        return func3(n, n+6);
    }

/////////////////////// end task 2 methods ///////////////

    public static String multiply(String str, int num) {
        String temp = "";
        for (int i = 0; i < num; i++) {
            temp += str;
        }

        return temp;
    }

    public static String multiply(int num, String str) {
        String temp = "";
        for (int i = 0; i < num; i++) {
            temp += str;
        }
        return temp;
    }
    public static String multiplyNewLine(String str, int num) {
        String temp = "";
        for (int i = 0; i < num; i++) {
            if (i == num-1)
                temp +=str;
            else
                temp +=str+"\n";
        }
        return temp;
    }
    public static void doubleAndPrint(String str) {
        System.out.println(str+str);
    }

}
