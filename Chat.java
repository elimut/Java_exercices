import java.util.Scanner;

public class Chat {

    public  Chat(String name, int age, boolean vaccin) {
        this.Name = name;
        this.Age = age;
        this.Vaccin = vaccin; 
        this.Action = "miaou-miaou";      
    }

    private String Name;
    private int Age;
    private boolean Vaccin;
    private String Action;

    public void demanderMiaulement(){
        System.out.println("Veuillez saisir y pour faire miauler le chat sinon n");
        Scanner saisieUser = new Scanner(System.in);
        String i = saisieUser.nextLine();
       if (i.equals("y")) {
            System.out.println(Action);
       }
       else if (i.equals("n")) {
            System.out.println("ok");
       }
       else{
            System.out.println("Réessayer");
            demanderMiaulement();
       }
    }
    
    public String getName() {
        return Name;
    }
 
    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }
 
    public void setAge(int age) {
        this.Age = age;
    }

    public boolean getVaccin() {
        return Vaccin;
    }

    public void setVaccin(boolean vaccin) {
        this.Vaccin = vaccin;
    }

    public String getAction() {
        return Action;
    }
}