public class Qualification {
    private Education education;
    private Level level;
    private  int IQEXAM_MARKS;
    private int working_Exapriece;

    public Qualification(Education education, Level level, int IQEXAM_MARKS, int working_Exapriece) {
        this.education = education;
        this.level = level;
        this.IQEXAM_MARKS = IQEXAM_MARKS;
        this.working_Exapriece = working_Exapriece;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getIQEXAM_MARKS() {
        return IQEXAM_MARKS;
    }

    public void setIQEXAM_MARKS(int IQEXAM_MARKS) {
        this.IQEXAM_MARKS = IQEXAM_MARKS;
    }

    public int getWorking_Exapriece() {
        return working_Exapriece;
    }

    public void setWorking_Exapriece(int working_Exapriece) {
        this.working_Exapriece = working_Exapriece;
    }
}
