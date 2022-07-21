public class scholarship {
    public static void main(String[] args) {
        Diploma diploma= new Diploma();
        HND hnd= new HND();
        Degree degree= new Degree();

        diploma.setHandler(hnd);
        hnd.setHandler(degree);

        Qualification qualification= new Qualification(Education.Adavnce_Level,Level.Compliet,76,2);
        System.out.printf(diploma.appliyCoures(qualification));

        System.out.println("\n");

        Qualification qualification1= new Qualification(Education.HND,Level.Compliet,76,2);
        System.out.printf(diploma.appliyCoures(qualification1));
        System.out.println("\n");

        Qualification qualification2= new Qualification(Education.Oridenary_Level,Level.Compliet,76,0);
        System.out.printf(diploma.appliyCoures(qualification2));
    }
}
