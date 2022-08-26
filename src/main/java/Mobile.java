public abstract class Mobile implements  Cloneable {
    private String name;

    private String Ram;

    private int camaera;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }


    public int getCamaera() {
        return camaera;
    }

    public void setCamaera(int camaera) {
        this.camaera = camaera;
    }
    protected Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }
}
