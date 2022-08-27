public class main {
    public static void main(String[] args) {
        PackageFactory packageFactory= new PackageFactory();
       Mobile_Package pacakge =packageFactory.getpackage(49);
       pacakge.Data_package();

        Mobile_Package pacakge2 =packageFactory.getpackage(514);
        pacakge2.Data_package();

        Mobile_Package pacakge3 =packageFactory.getpackage(98);
        pacakge3.Data_package();

    }
}
