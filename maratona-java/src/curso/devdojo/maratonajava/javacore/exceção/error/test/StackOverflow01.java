package curso.devdojo.maratonajava.javacore.exceção.error.test;

public class StackOverflow01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
