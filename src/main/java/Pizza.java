import java.util.ArrayList;

public class Pizza {
    private final String Size;
    private final  boolean chees;
   private  final boolean pepperoni;
    private final  boolean painapple;
   private  ArrayList<String> Extratoping = new ArrayList();

   public  Pizza(Builder builder){
       this.Size=builder.Size;
       this.chees=builder.chees;
       this.pepperoni=builder.pepperoni;
       this.painapple=builder.painapple;
       this.Extratoping=builder.Extratoping;
   }

    static class Builder{
        private String Size;
        private boolean chees;
        private boolean pepperoni;
        private boolean painapple;
      private  ArrayList<String> Extratoping = new ArrayList();


      public Pizza build(){
          return  new Pizza(this);
      }
      public Builder(String Size){
          this.Size=Size;

      }

      public Builder  Size(String Size){
          this.Size=Size;
          return  this;
      }

        public Builder  chees(Boolean chees){
            this.chees=chees;
            return  this;
        }

        public Builder  pepperoni(Boolean pepperoni){
            this.pepperoni=pepperoni;
            return  this;
        }
        public Builder painapple(Boolean painapple){
            this.painapple=painapple;
            return  this;
        }

        public  Builder Extratoping(ArrayList<String> Extratoping) {
          this.Extratoping=Extratoping;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Size='" + Size + '\'' +
                ", chees=" + chees +
                ", pepperoni=" + pepperoni +
                ", painapple=" + painapple +
                ", Extratoping=" + Extratoping +
                '}';
    }
}
