public class PackageFactory {

    public Mobile_Package getpackage(int reloadtype){
        if(reloadtype == 0){
            return null;
        }
        if(reloadtype== 49){
            return new night_time();

        } else if(reloadtype== 514){
            return new Workandlearn();

        } else if(reloadtype== 98){
            return new Funblaster();
        }

        return null;
    }
}
