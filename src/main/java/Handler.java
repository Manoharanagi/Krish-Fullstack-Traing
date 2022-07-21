public  abstract class Handler {

   protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract String appliyCoures(Qualification qualification);
}
