import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
// import java.util.*;


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
    //     Chat felix = new Chat("Felix", 33, true);
    //     Chat david = new Chat("David", 10, false);

    //     cri(felix);
    //     cri(david);
    // }
    
    // public static void cri(Chat chat){
//        System.out.println(
//         "Le chat " + chat.getName() + " agé de " + chat.getAge() + "ans " + ((chat.getVaccin()) ?  " et il est vacciné" : " et il n'est pas vacciné"));
//         chat.demanderMiaulement();
    // }

/*
 * Exercice 5:
 * Utilisez un HashSet pour stocker une liste de noms d'étudiants. Demandez à l'utilisateur
d'entrer les noms jusqu'à ce qu'il entre "q" pour quitter. Ensuite, affichez tous les noms
d'étudiants enregistrés dans l'ensemble. Assurez-vous de gérer les doublons et
d'afficher les noms dans l'ordre d'ajout
 */
        // Set<String> listeEtudiant = new HashSet<>();
        /*Déclaration hashSet => En Java, les interfaces Map et Set font partie du framework de collections et offrent des 
        *fonctionnalités puissantes pour stocker, manipuler et organiser des données. Ces interfaces sont implémentées par différentes classes, telles que HashMap, HashSet,
        *TreeMap et TreeSet, qui fournissent des structures de données spécifiques pour
        *répondre à des besoins particuliers.
        *L'interface Set représente une collection d'éléments uniques, sans doublons.
        *Chaque élément dans un Set est unique et ne peut être présent qu'une seule fois.
        */
    //     System.out.println("Veuillez saisir un premier nom,sinon saisissez q pour quitter");
    //     Scanner list = new Scanner(System.in);
    //     String nom1 = list.nextLine();
    //     while (!nom1.equalsIgnoreCase("q")){
    //             listeEtudiant.add(nom1);
    //             System.out.println("Veuillez saisir un nom");
    //             nom1 = list.nextLine();
    //     }    
    //    for(String element : listeEtudiant){
    //         System.out.println(element);
    //    }
    // }
    // La méthode equalsIgnoreCase() est utilisée pour comparer une chaîne spécifiée à une autre chaîne, en ignorant les considérations de casse. Deux chaînes sont considérées comme égales sans tenir compte de la casse si elles ont la même longueur et que les caractères correspondants dans les deux chaînes sont égaux sans tenir compte de la casse.

/*
 * Exercice 6:
Créez une méthode qui prend en entrée un tableau d'entiers et renvoie la somme de
tous les éléments du tableau
 */
//     int[] tableau = {1, 2, 3, 4, 5};
//     sommeTableau(tableau);
   
//     }
//     public static void sommeTableau(int[] tableauTest){
//         int somme = 0;
//         for (int i = 0; i < tableauTest.length; i++){
//             somme += tableauTest[i];
//         }
//          System.out.println("La somme des éléments du tableau est : " + somme);
//     }
// 
/*
 *Exercice 7:
Créez une méthode  qui prend  en entrée une ArrayList de chaînes  de caractères et 
renvoie la chaîne  la plus longue  de la liste.
*/
    // ArrayList<String> liste = new ArrayList<>();
    // liste.add("anne");
    // liste.add("so");
    // liste.add("moi");
    
    // System.out.println(chaineLongue(liste));

    // }
    // public static String chaineLongue(ArrayList<String> array){
    //     String longSt = "";
    //     for (String item : array){
    //         if(item.length() > longSt.length()){
    //             longSt = item;
    //         }
    //     }
    //     return longSt;
    // }
/*
 * Exercice 8:
Créez une méthode  qui prend  en entrée une LinkedList  d'objets  et renvoie la taille  de la 
liste.
 */
    // List<Object> list = new LinkedList<>();
    // list.add("anneso");
    // list.add("anne");
    // list.add("so");
    // System.out.println(tailleLinkedList(list));

    // }
    // public static int tailleLinkedList(List<Objects> list){
    //     return list.size();
    // }

/*
 * Exercice 9:
Créez une méthode  qui prend  en entrée un tableau  d'entiers  et un entier  cible.  La 
méthode  doit  renvoyer true si l'entier  cible  est présent  dans  le tableau,  sinon  elle  doit 
renvoyer false.
 */
    //     int [] tableauEssai = {0, 1, 3};
    //     int cible = 2;
    //     System.out.println(compareValeurTableau(tableauEssai, cible));
    // }
    // public static boolean compareValeurTableau(int[] tableauTest2, int number){
    //     for(int element : tableauTest2){
    //         if (element == number){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

/*
 * Exercice 10:
 * Créez une méthode qui prend en entrée une ArrayList d'objets et un objet cible. La
méthode doit renvoyer l'indice de la première occurrence de l'objet cible dans la liste, ou
-1 s'il n'est pas présent.
 */
    // ArrayList<String> liste = new ArrayList<>();
    // liste.add("anne");
    // liste.add("so");
    // liste.add("moi");
    // liste.add("moi");
    // String test = "paul";
    // String test1 = "anne";
    // String test2 = "moi";
    // System.out.println(compareCible(liste, test));
    // System.out.println(compareCible(liste, test1));
    // System.out.println(compareCible(liste, test2));
    // }
    // L' ArrayList est une collection dynamique qui permet de stocker des éléments de manière séquentielle.  

    // public static int compareCible(ArrayList<String> array, String element){
    //     for(int i = 0; i < array.size(); i++){
    //         String item = array.get(i);
    //         // Vous pouvez accéder aux éléments d'un ArrayList en utilisant la méthode “get". Stockage de l'élément de la collection avec l'indice.
    //         if (element.equals(item)){
    //             // En Java, l’opérateur == sert à comparer les références. Il ne faut donc jamais l’utiliser pour comparer des objets. La comparaison d’objets se fait grâce à la méthode equals héritée de la classe Object.
    //             return i;
    //         }
    //     }
    //     return -1;
    // la méthode doit retourner un int.
    // }
    // ou
    // if (list.contains(cible)){
    //     return list.indexOf(cible);
    // }

/*
 * Exercice 11:
Créez une méthode qui prend en entrée un tableau d'entiers trié par ordre croissant et
un entier cible. La méthode doit renvoyer true si l'entier cible est présent dans le tableau
en utilisant une recherche binaire, sinon elle doit renvoyer false.
*/
    //     int[] tableauTest3 = {1, 2, 4, 3};
    //     int cible = 2;
    //     System.out.println(rechercheBinaire(tableauTest3, cible));
    // }
    //     public static boolean rechercheBinaire(int[] array,int cible){
            // Arrays.sort(array);
    //         return Arrays.binarySearch(array, cible) >= 0;
    //     }

/*
 * Exercice 12:
Créez une méthode qui prend en entrée une LinkedList d'entiers et supprime tous les
éléments pairs de la liste
 */
//         List<Integer> listWithoutPair = new LinkedList<Integer>();
//         listWithoutPair.add(1);
//         listWithoutPair.add(2);
//         listWithoutPair.add(3);
//         listWithoutPair.add(4);
//         deletePair(listWithoutPair);
//         System.out.println("liste après suppression" + listWithoutPair);
//     }

//         public static void deletePair(List<Integer> list){
//             Iterator<Integer> it = list.iterator();
//             // Create an iterator to traverse the list
//             while(it.hasNext()){
//             // Iterate through the list garde index supprimé, car penser aux déplacements suite à la suppression du précédent
//                 int i = it.next();
//                 // Get the next element from the iterator
//                 if(i % 2 == 0){
//                     it.remove();
//                 }
//             }
//         }

/*
 * Exercice 13:
Créez une méthode qui prend en entrée un tableau d'entiers et renvoie un nouveau
tableau qui contient uniquement les nombres premiers présents dans le tableau
d'origine.
 */
    int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primeNumbers = getPrimeNumbers(numbers);
        for (int primeNumber : primeNumbers) {
            System.out.print(primeNumber + " ");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int[] getPrimeNumbers(int[] numbers) {
        List<Integer> primeList = new ArrayList<>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primeList.add(number);
            }
        }

        int[] primeNumbers = new int[primeList.size()];
        for (int i = 0; i < primeList.size(); i++) {
            primeNumbers[i] = primeList.get(i);
        }

        return primeNumbers;
    }
    /*
     * La méthode isPrime vérifie si un nombre est premier en effectuant une recherche par division jusqu'à la racine carrée du nombre. La méthode getPrimeNumbers itère sur le tableau d'entiers d'origine et ajoute les nombres premiers trouvés à une liste. Ensuite, elle convertit cette liste en un tableau d'entiers et le renvoie.
    Dans l'exemple ci-dessus, le tableau numbers contient les entiers de 2 à 10. L'appel à getPrimeNumbers(numbers) renvoie un tableau contenant les nombres premiers du tableau d'origine (2, 3, 5 et 7), qui sont ensuite affichés à l'écran.
     */
}
