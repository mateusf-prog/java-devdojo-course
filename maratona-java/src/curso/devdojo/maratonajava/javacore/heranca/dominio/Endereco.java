package curso.devdojo.maratonajava.javacore.heranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public void imprime() {
        System.out.println(this.rua);
        System.out.println(this.cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
