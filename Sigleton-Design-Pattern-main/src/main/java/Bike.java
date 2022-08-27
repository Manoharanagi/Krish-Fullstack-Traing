public class Bike {
    public static void main(String[] args) {
        Vechicals.Vechical_name="Baja rs 200";
        Vechicals.Vechical_Colore="Black";
        //String data=Vechicals.getData();
       // System.out.println(data);

        Vechicals v= Vechicals.GetInstance();
        Vechicals v2= Vechicals.GetInstance();
       //String baja= v.getData();

       String n=v.getdata();
       // System.out.hhhh(baja);
        System.out.println(n);
    }
}
