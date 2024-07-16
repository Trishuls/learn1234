package _2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PricePairing {
    public static void main(String[] args) {
        List<Integer> price = Arrays.asList(80,25,20,55,10,60,10);
        price=price.stream().sorted(Comparator.naturalOrder()).toList();
        int amount = 100;
        for (int i=0;i<price.size();i++) {
            for (int j=i+1;j<price.size();j++) {
                if (j<=amount&&(price.get(i)+ price.get(j))<=amount) {
                    System.out.println("("+price.get(i)+price.get(j)+")");
                }
            }
        }

    }
}
