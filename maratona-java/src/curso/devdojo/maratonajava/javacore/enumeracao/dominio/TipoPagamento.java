package curso.devdojo.maratonajava.javacore.enumeracao.dominio;

/**
 * Neste enum, tem um método abstrato para calcular o desconto de acordo com o tipo do enum(CREDITO, DEBITO).
 * Por ser um método abstrato, os valores do enum(CREDITO, DEBITO) tem que sobrescrevê-los e implementar sua lógica de acordo.
 */
public enum TipoPagamento {

    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}
