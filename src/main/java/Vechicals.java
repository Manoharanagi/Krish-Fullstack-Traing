import java.util.ArrayList;
import java.util.List;

public class Vechicals {

    
    private Vechicals(){

    }
    public static Vechicals obj;

    public static Vechicals GetInstance(){
        if(obj == null){
            obj = new Vechicals();
        }
        return obj;
    }

    public static String Vechical_name;
    public static String Vechical_Colore;

 public String getdata(){
     return "Vecical name"+Vechical_name +"Vechical Color"+Vechical_Colore;
 }

}
