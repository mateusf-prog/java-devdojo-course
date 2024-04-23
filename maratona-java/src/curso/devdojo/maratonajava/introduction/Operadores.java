package curso.devdojo.maratonajava.introduction;

public class Operadores {
    public static void main(String[] args) {

        // operadores aritimeticos (+ - / *)
        int n1 = 10;
        int n2 = 20;
        int res = n1 * (n2+n2);

        System.out.println(n1 + n2);
        System.out.println(res);

        // operador resto %
        int resto =  20 % 3;
        System.out.println(resto);

        // operadores logicos < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);

        // operadores logicos && -- || -- !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; // false

        System.out.println(isDentroDaLeiMaiorQueTrinta);

    }
}
