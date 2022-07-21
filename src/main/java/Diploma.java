public class Diploma extends Handler {

    @Override
    public String appliyCoures(Qualification qualification) {
        if(qualification.getEducation().equals(Education.Oridenary_Level)){
            if(qualification.getLevel().equals(Level.Compliet) && qualification.getIQEXAM_MARKS() >=50){
                return "You can sellect forDiploma Coures";
            }else{
               return "Soory you not seleted  schollership Try Next time" ;
            }
        }else{
            return handler.appliyCoures(qualification);
        }

    }
}
