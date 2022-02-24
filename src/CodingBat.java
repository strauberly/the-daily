public class CodingBat {

    // warmup 1
//    8pm - 9pm
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else
            return a + b;
    }

    public static int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else
            return 21 - n;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public static boolean nearHundred(int n) {
        return Math.abs(100 - n) < 11 || Math.abs(200 - n) < 11;
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else
            return a < 0 && b > 0 || a > 0 && b < 0;
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        } else
            return "not " + str;
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }

    public static String frontBack(String str) {
        if (str.length() > 1) {
            String mid = str.substring(1, str.length() - 1);
            return str.charAt(str.length() - 1) + mid + str.charAt(0);
        } else
            return str;
    }

    public static String front3(String str) {
        if (str.length() > 3) {
            String front = str.substring(0, 3);
            return front + front + front;
        } else
            return str + str + str;
    }

    public static String backAround(String str) {
        char back = str.charAt(str.length() - 1);
        return back + str + back;
    }

    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public static String front22(String str) {
        if (str.length() > 2) {
            String front22 = str.substring(0, 2);
            return front22 + str + front22;
        } else
            return str + str + str;
    }

    public static boolean startHi(String str) {
        return str.length() >= 2 && str.substring(0, 2).equals("hi");
    }

    public static boolean icyHot (int temp1, int temp2){
        return temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100;
    }

    public static boolean in1020(int a, int b){
        return ((a >= 10 && a <= 20) || (b <= 20 && b >=10));
    }

    public static boolean hasTeen(int a, int b, int c){
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }
}
