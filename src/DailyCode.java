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
        return Integer.parseInt(String.valueOf(num).chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
        }

        public static boolean isLockNessMonster(String s){
        return s.contains("tree fiddy") || s.contains("3.50");
        }

        //return a new array mapped
        public static int[] digitize(long n){
        return new StringBuilder().append(n).reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
        }

        public static int rentalCarCost(int d) {
            if (d >= 3) return d >= 7 ? (d * 40) - 50 : (d * 40) - 20;
            else return d * 40;
        }
    }