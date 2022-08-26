import java.util.HashMap;
import java.util.Map;

public class Registery {
    private Map<Color_type, Mobile> mobile= new HashMap<>();

    public Registery() {
        this.loading();
    }
    public Mobile getMobileColor(Color_type type) {
        Mobile mbile=null;
        try {
            mbile = (Mobile) mobile.get(type).clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  mbile;

    }
    private  void loading(){
        IPhone ipone= new IPhone();
        ipone.setName("Ipone 7");

        ipone.setCamaera(2);
        ipone.setStorage("clode");
        ipone.setRam("8GB");

        Samsung samsung= new Samsung();
        samsung.setName("Samsung J+");
        //samsung.setColor("White");
        samsung.setRam("4GB");
        samsung.setCamaera(1);

        mobile.put(Color_type.Black,ipone);


    }
}
