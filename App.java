public class App {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Liste avant la suppression des éléments pairs : " + numbers);

        removeEvenNumbers(numbers);

        System.out.println("Liste après la suppression des éléments pairs : " + numbers);
    }

    public static void removeEvenNumbers(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--; // Décrémente l'index pour compenser la suppression de l'élément (compensation)
                // 0 1 2 3 4 => 0 1 3 4 => 0 1 2 3 mais le programme ne sait plus où il est, il faut compenser avec i--
            }
        }
    }
}
