Daily practice in programming and git.

Will try to find a way to notate in an organized manner as it will essentially be a running string of programming solutions that may not make sense when viewed all together.

Please feel free
to utilize and let me know where you find room for improvements so that I can continue to learn and improve. Cheers!

---

-23 Feb 2022-

Work completed on resume. Also began work on creating APIs with Express.js.
Completed lessons on CSS float layouts.


---

-20 Feb 2022-

Today was time spent studying css box models, dimensions, and centering elements and
asynchronous javascript.

As well, the following is a one-hour speed run of warmup-1 on code-bat.
https://codingbat.com/java/Warmup-1. Will give the remaining problems a go next time.


---
20:00 - 21:00


The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
    
    public static boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
    }
---


We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

         return aSmile && bSmile || !aSmile && !bSmile;
    }
---


Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

    public static int sumDouble(int a, int b) {
    if (a == b) {
    return (a + b) * 2;
    } else  
    return a + b;
    }
---

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

    public int diff21(int n) {
    if (n>21){
    return (n-21) * 2;
    }else
    return 21-n;    
    }

---




We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.


parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

    public static boolean parrotTrouble(boolean talking, int hour) {
    return talking && (hour < 7 || hour > 20);
    }
---


Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true

    public static boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
    }
---


Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true

    public static boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
    }
---


Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false


    public static boolean nearHundred(int n) {
        return Math.abs(100 - n) < 11 || Math.abs(200 - n) < 11;
    }

---



Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true


    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else
            return a < 0 && b > 0 || a > 0 && b < 0;
    }

---


Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

    public static String notString(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
    } else
    return "not " + str;
    }
---




Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

    public static String frontBack(String str) {
    if (str.length() > 1){
    String mid = str.substring(1, str.length()-1);
    return str.charAt(str.length()-1) + mid + str.charAt(0);
    }else
    return str;
    }

---


Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"

    public static String front3(String str) {
        if (str.length() > 3) {
            String front = str.substring(0, 3);
            return front + front + front;
        } else
            return str + str + str;
    }

---

Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"

    public static String backAround(String str) {
        char back = str.charAt(str.length() - 1);
        return back + str + back;
    }
---


Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false

    public static boolean or35(int n) {
    return n % 3 == 0 || n % 5 == 0;
    }
---


Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"

    public static String front22(String str) {
        if (str.length() > 2) {
            String front22 = str.substring(0, 2);
            return front22 + str + front22;
        } else
            return str + str + str;
    }
---


Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

    public static boolean startHi(String str) {
        return str.length() >= 2 && str.substring(0, 2).equals("hi");
    }
---



Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false

    public static boolean icyHot (int temp1, int temp2){
    return temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100;
}
---


Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

    public static boolean in1020(int a, int b){
        return ((a >= 10 && a <= 20) || (b <= 20 && b >=10));
    }
---
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true

    public static boolean hasTeen(int a, int b, int c){
        return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
    }

### Completed 19 challenges out of 31 in 1 hour. Personal best 20 out of 31 in one hour.

---
-19 Feb 2022-

Created a method for accepting a binary string and converting it to decimal for ease of reading for the following challenge.
In class DailyCode called binConv().
### Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:

Testing: [0, 0, 0, 1] ==> 1
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 0, 1] ==> 5
Testing: [1, 0, 0, 1] ==> 9
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 1, 0] ==> 6
Testing: [1, 1, 1, 1] ==> 15
Testing: [1, 0, 1, 1] ==> 11
However, the arrays can have varying lengths, not just limited to 4.

    public static void binConv(List<Integer> binary) {
        int power;
        int value;
        int position;
        int i;
        int amount = 0;

        for (i = 0; i < binary.size(); i++) {
            position = i;
            value = binary.get(i);
            power = binary.size() - i - 1;
            System.out.println("position " + position);
            System.out.println("value " + value);
            System.out.println("power " + power + "\n");
            if (value == 1)
                amount += value * Math.pow(2, power);
            System.out.println("amount" + amount);
        }
    }

---
