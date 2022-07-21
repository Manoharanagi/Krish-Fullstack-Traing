public class HND extends Handler{
    @Override
    public String appliyCoures(Qualification qualification) {
       if(qualification.getEducation().equals(Education.Adavnce_Level)){
           if(qualification.getLevel().equals(Level.Compliet) && qualification.getIQEXAM_MARKS() >=70){
               return "You can sellect for HND Diploma Coures";
           }else{
               return "Soory you NOT Select for HND Level program schollership coures  Try Next time " ;
           }
       }else{
           return handler.appliyCoures(qualification);
       }
    }
}
