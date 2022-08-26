public class Main {
    public static void main(String[] args) {
        Registery registery= new Registery();
       IPhone iphone= (IPhone) registery.getMobileColor(Color_type.Black);
        System.out.println(iphone);

        IPhone iphone2= (IPhone) registery.getMobileColor(Color_type.GOLD);



    }
}
