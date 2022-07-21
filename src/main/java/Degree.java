public class Degree extends Handler{
    @Override
    public String appliyCoures(Qualification qualification) {
        if(qualification.getEducation().equals(Education.HND)){
            if(qualification.getLevel().equals(Level.Compliet) && qualification.getIQEXAM_MARKS() >=70 &&  qualification.getWorking_Exapriece() >1 ){
                return "You can sellect for Computer Degree programm";
            }else{
                return "Soory you NOT Select for Degree program schollership coures  Try Next time " ;
            }
        }else{
            return handler.appliyCoures(qualification);
        }


    }
}
