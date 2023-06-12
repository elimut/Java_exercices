import java.util.Scanner;

public class Main {
    public static void main(String[] args){
/*
 * Exercice 1:
 * Afficher avec un programme Java tout les chiffres pairs jusqu'à 10 sur la console.
 * Incrémentation 1.
 */        
        // int nombre = 0;

        // while (nombre <= 10){
        //     if (nombre % 2 == 0){
        //         System.out.println(nombre);
        //     }
        // nombre += 1;
        // }

        Scanner in = new Scanner(System.in);
        System.out.println("Veuillez saisir un premier nombre");
        int debut = in.nextInt();
        System.out.println("Veuillez saisir un second nombre");
        int fin = in.nextInt();
        if (debut < fin){
            while (debut < fin){
                debut ++;
                if (debut % 2 == 0){
                    System.out.println(debut);
                }
            }
        }
        else{
            System.out.println("Veuillez resaisir");
        }
        in.close();
    }
}
