package curso.devdojo.maratonajava.javacore.enumeracao.dominio;

/**
 * Enum TipoCliente com construtor e variáveis internas.
 * Este enum define números e nomes personalizados para cada tipo de cliente.
 */
public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int valor;
    private final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
