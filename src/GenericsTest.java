import java.util.ArrayList;
import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {
        Object o = new Object();
        ArrayList lstNames = new ArrayList();
        lstNames.add("Harry");
        lstNames.add("Frank");
        lstNames.add(o);

        String sName1 = (String)lstNames.get(0);
        //String sName3 = (String)lstNames.get(2);

        // *** Using Generics ***
        ArrayList<String> lstGNames = new ArrayList<>();
        lstGNames.add("Harry");
        lstGNames.add("Sally");
        String sName = lstGNames.get(0);

        // *** Using our custom Generic class to store stocks ***
        Pair<String, Double> oStock1 = new Pair<>("msft", 35.68);
        Pair<String, Double> oStock2 = new Pair<>("aapl", 28.91);
        System.out.println("Stock 1 info: " + oStock1.getFirst() + " -- " +
                oStock1.getSecond());

        ArrayList<Pair<String, Double>> lstStocks = new ArrayList<>();

        lstStocks.add(oStock1);
        lstStocks.add(oStock2);

        // Loop through and process all stock pair objects in an arrayList.
        for(int x = 0; x < lstStocks.size(); x++){
            Pair<String, Double> oStock = lstStocks.get(x);
            System.out.println("Stock info: " + oStock.getFirst() + " -- " + oStock.getSecond());
        }



    }
}
