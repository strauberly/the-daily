import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedTransferQueue;

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


   public  static int areaOrPerimeter (int l, int w){
//      l==w? do this or do this
//       return l == w ? l * w : (l + w) * 2;

        if (l == w){
            return l*w;
        }else
            return (l+w)*2;
   }

   public static double sum(double [] numbers) {
        return Arrays.stream(numbers).sum();
   }
}
