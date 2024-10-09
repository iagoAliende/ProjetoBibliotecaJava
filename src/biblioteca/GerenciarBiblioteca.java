package biblioteca;

public class GerenciarBiblioteca {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(1, "Maria Silva", "maria@email.com", "20201020", "Ciência da Computação");
        Professor professor = new Professor(2, "Dr. João Oliveira", "joao@email.com", "Computação", "Doutor");
        Funcionario funcionario = new Funcionario(3, "Carlos Souza", "carlos@email.com", "Bibliotecário", "Biblioteca Central");


        Livro livro1 = new Livro(100, "Java para Iniciantes", "José da Silva", true);
        Livro livro2 = new Livro(101, "Estruturas de Dados", "Ana Pereira", true);


        ControleEmprestimo controle = new ControleEmprestimo();


        System.out.println("\n" + controle.registraEmprestimo(aluno, livro1)); // Caso maria

        System.out.println("\n------------------------------------------------------------------");
        System.out.println(controle.registraEmprestimo(professor, livro2)); //caso joão

        System.out.println("\n------------------------------------------------------------------");
        System.out.println(controle.registraEmprestimo(funcionario, livro1)); // Esse  livro já foi emprestado

        System.out.println("\n------------------------------------------------------------------");
        System.out.println(controle.registraDevolucao(aluno, livro1)); //devolução maria

        System.out.println("\n------------------------------------------------------------------");
        System.out.println(controle.registraDevolucao(professor, livro2)); // devolução dr joao
    }
}
