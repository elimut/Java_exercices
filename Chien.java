public class Chien {

     public  Chien(String name, int age, boolean vaccin, String action) {
        this.Name = name;
        this.Age = age;
        this.Vaccin = vaccin;  
        this.Action = action;     
    }

    private String Name;
    private int Age;
    private boolean Vaccin;
    private String Action = "woof-woof";

   public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public boolean getVaccin(){
        return Vaccin;
    }
      public String getAction() {
        return Action;
    }
    public void setAge(int age) {
        this.Age = age;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setVaccin(boolean Vaccin) {
        this.Vaccin = Vaccin;
    }
}
