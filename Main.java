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

/*
 * Exercice 2:
 * Écrivez un programme Java qui demande à l'utilisateur d'entrer deux valeurs entières :
une valeur de début et une valeur de fin. Ensuite, le programme vérifie si la valeur de
début est inférieure à la valeur de fin. Si c'est le cas, le programme affiche tous les
nombres pairs compris entre la valeur de début et la valeur de fin. Sinon, le programme
affiche un message d'erreur indiquant que la valeur de début doit être plus petite que la
valeur de fin.
Voici les étapes pour résoudre cet exercice :
1. Demandez à l'utilisateur d'entrer la valeur de début et stockez-la dans une
variable entière nommée "debut".
2. Demandez à l'utilisateur d'entrer la valeur de fin et stockez-la dans une variable
entière nommée "fin".
3. Utilisez une structure de contrôle if pour vérifier si la valeur de début est
inférieure à la valeur de fin.
4. Si la condition est vérifiée, utilisez une boucle while pour itérer de la valeur de
début à la valeur de fin.
5. À chaque itération, vérifiez si le nombre est pair en utilisant l'opérateur modulo
(%) pour vérifier si le reste de la division par 2 est égal à 0.
6. Si le nombre est pair, affichez sa valeur sur la console à l'aide de
"System.out.println()".
 */
        // Scanner in = new Scanner(System.in);
        // System.out.println("Veuillez saisir un premier nombre");
        // int debut = in.nextInt();
        // System.out.println("Veuillez saisir un second nombre");
        // int fin = in.nextInt();
        // if (debut < fin){
        //     while (debut < fin){
        //         debut ++;
        //         if (debut % 2 == 0){
        //             System.out.println(debut);
        //         }
        //     }
        // }
        // else{
        //     System.out.println("Veuillez resaisir");
        // }
        // in.close();
        // voir comment ci-dessous
        /*
         * public class Main {
            public static void main(String[] args) {
                Scanner saisieUser = new Scanner(System.in);
                while (true) {
                        try {
                        System.out.println("Entrez un premier chiffre :");
                        int debut = saisieUser.nextInt();
                        System.out.println("Entrez un second chiffre :");
                        int fin = saisieUser.nextInt();
                        if (debut < fin) {
                            while (debut < fin) {
                                debut++;
                                if (debut % 2 == 0) {
                                    System.out.println(debut);
                                }
                            }
                            break;  // Sortir de la boucle si tout s'est déroulé correctement
                        } else {
                            System.out.println("Le premier chiffre doit être inférieur au second chiffre. Veuillez recommencer.");
                        }
                    } catch (Exception e) {
                        System.out.println("Erreur de saisie. Veuillez recommencer.");
                        saisieUser.nextLine(); // Vider la ligne erronée de l'entrée utilisateur
                    }
                }
                saisieUser.close();
            }
        }
*/

/*
 * Exercice 3:
 *Créez deux classes, "Chien" et "Chat", avec les attributs suivants :
●nom (String)
●age (int)
●vacciné (boolean)
Assurez-vous de fournir des constructeurs, des getters et des setters appropriés
pour chaque attribut.
Dans la classe "App", créez deux instances de la classe "Chat" avec des
caractéristiques différentes. L'une des instances doit être vaccinée (vacciné =
true) et l'autre ne doit pas l'être (vacciné = false).
Utilisez une condition ternaire pour afficher les informations appropriées pour
chaque instance de chat. Si un chat est vacciné, affichez la phrase : "Bonjour, je
m'appelle [nom du chat], j'ai [âge du chat] ans et je suis vacciné." Sinon, affichez
la phrase : "Bonjour, je m'appelle [nom du chat], j'ai [âge du chat] ans et je ne suis
pas vacciné."

Exercice 4 :
1. Ajoutez un nouvel attribut "action" de type String à la classe "Chien" et à la classe
"Chat".
2. Pour la classe "Chien", définissez la valeur de l'attribut "action" comme
"woof-woof".
3. Pour la classe "Chat", définissez la valeur de l'attribut "action" comme
"miaw-miaw".
4. Dans la classe "Chat", ajoutez une méthode appelée "demanderMiaulement" qui
demande à l'utilisateur s'il souhaite entendre le chat miauler.
●Utilisez la classe "Scanner" pour lire l'entrée de l'utilisateur.
●Si l'utilisateur entre "y" (oui), affichez "miaw-miaw" sur la console.
Sinon, si l'utilisateur entre "n" (non) affichez "OK, peut-être une prochaine
fois !".
●Dans tous les autres cas, affichez “Je n’ai pas compris votre réponse” et
reposez la question à l’utilisateur.
5. Dans la méthode "main" de la classe "App", créez une instance de la classe "Chat"
et appelez la méthode "demanderMiaulement" sur cette instance
 */
        Chat felix = new Chat("Felix", 33, true);
        Chat david = new Chat("David", 10, false);

        cri(felix);
        cri(david);
    }
    
    public static void cri(Chat chat){
           System.out.println(
            "Le chat " + chat.getName() + " agé de " + chat.getAge() + "ans " + ((chat.getVaccin()) ?  " et il est vacciné" : " et il n'est pas vacciné"));
            chat.demanderMiaulement();
        }
}
