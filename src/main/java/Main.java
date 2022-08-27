import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
         Pizza.Builder builder=  new Pizza.Builder("Small");
         
         ArrayList<String>iteam= new ArrayList();
         iteam.add("Extra chees ");
         iteam.add("tomato");

         Pizza pizza=builder.chees(true).painapple(true).pepperoni(true).Extratoping(iteam).build();
        System.out.println( pizza);

    }
}
