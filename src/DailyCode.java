import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DailyCode {

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


    public static int areaOrPerimeter(int l, int w) {
//      l==w? do this or do this
//       return l == w ? l * w : (l + w) * 2;

        if (l == w) {
            return l * w;
        } else
            return (l + w) * 2;
    }

    public static double sum(double[] numbers) {
//        return Arrays.stream(numbers).sum();
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
//        double j = 0;
//        if (numbers.length < 1) {
//            return 0.0;
//        } else
//            for (double number:numbers) {
//                j+=number;
//            }
//        return j;
//    }
    }

    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }

    public static boolean isLockNessMonster(String s) {
        return s.contains("tree fiddy") || s.contains("3.50");
    }

    //return a new array mapped
    public static int[] digitize(long n) {
        return new StringBuilder().append(n).reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static int rentalCarCost(int d) {
        if (d >= 3) return d >= 7 ? (d * 40) - 50 : (d * 40) - 20;
        else return d * 40;
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        return Math.abs(firstCuboid[0] * firstCuboid[1] * firstCuboid[2] - secondCuboid[0] * secondCuboid[1] * secondCuboid[2]);
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);

//        return str.length() >= ending.length() ?
//                str.substring(str.length()-ending.length()).equals(ending) : false;
        //        if(str.length() >= ending.length()){
//            return str.substring(str.length() - ending.length(), str.length()).equals(ending);
//        }else
//            return false;
//    }
//       return strOne.substring(strOne.length() - strTwo.length(), strOne.length()).equals(strTwo);
//        if (strOne.length() >= strTwo.length()) {
//            while (strOne.substring(strOne.length() - strTwo.length(), strOne.length()).equals(strTwo)) {
//                return true;
//            }else
//            return false;
}

}