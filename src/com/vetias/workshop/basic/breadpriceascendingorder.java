package vetias.workshop.basic;

public class breadpriceascendingorder {
    import java.util.Arrays;

public class BreadPriceAscending {

    public static void main(String[] args) {
        int[] breadPrices = {85, 90, 95, 100, 105};
        Arrays.sort(breadPrices);
        System.out.println("Bread prices in ascending order:");
        for (int price : breadPrices) {
            System.out.println(price);
        }
    }
}
    
}
