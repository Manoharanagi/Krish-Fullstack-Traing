public class IPhone extends  Mobile {
    private String storage;

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "storage='" + storage + '\'' +

        "Ram='" + getRam() + '\'' +
                "Name='" + getName() + '\'' +
                "Camera='" + getCamaera() + '\'' +
                '}';
    }
}
