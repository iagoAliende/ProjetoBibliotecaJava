package biblioteca;

import java.time.LocalDate;

public class ControleEmprestimo {


    public String registraEmprestimo(Usuario usuario, Livro livro) {
        if (!livro.isDisponivel()) {
            return "O livro '" + livro.getTitulo() + "' já está emprestado.";
        }

        livro.setDisponivel(false);
        LocalDate dataEmprestimo = LocalDate.now();


        return "Empréstimo registrado para: " + usuario.getNome() + "\n" +
                "Livro: " + livro.getTitulo() + "\n" +
                "Data do Empréstimo: " + dataEmprestimo;
    }


    public String registraDevolucao(Usuario usuario, Livro livro) {
        if (livro.isDisponivel()) {
            return "O livro '" + livro.getTitulo() + "' já foi devolvido.";
        }

        livro.setDisponivel(true);
        LocalDate dataDevolucao = LocalDate.now();


        return "Devolução registrada para: " + usuario.getNome() + "\n" +
                "Livro: " + livro.getTitulo() + "\n" +
                "Data da Devolução: " + dataDevolucao;
    }
}
