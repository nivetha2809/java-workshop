package vetias.workshop.basic;

public class breadpricedecendingorder {
    import java.util.Arrays;
import java.util.Collections;

public class BreadPriceDescending {

    public static void main(String[] args) {
        Integer[] breadPrices = {85, 90, 95, 100, 105};
        Arrays.sort(breadPrices, Collections.reverseOrder());
        System.out.println("Bread prices in descending order:");
        for (int price : breadPrices) {
            System.out.println(price);
        }
    }
}
    
}
