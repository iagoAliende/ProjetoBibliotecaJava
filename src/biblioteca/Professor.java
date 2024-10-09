package biblioteca;

public class Professor extends Usuario {
    private String departamento;
    private String titulacao;


    public Professor(int idUsuario, String nome, String email, String departamento, String titulacao) {
        super(idUsuario, nome, email); // Chama o construtor da classe Usuario
        this.departamento = departamento;
        this.titulacao = titulacao;
    }


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
