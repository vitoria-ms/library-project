package biblioteca.java.demo.model;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "EMPRESTIMOS")

public class Emprestimo {
  
    private String dataEmprestimo;
    private String dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "usuario_nome")
    private Usuario usuario;
    @Column (nullable = true, unique = false, length = 60 )
    private Livro livro;
    @Column(nullable = true, unique= false, length = 60)
    private double multa;
    
    //Getters e Setters
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }


    //buscando livro para emprestar
    public Livro buscarLivro(String titulo) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
            return livro;
        }
        System.out.println("Livro não encontrado no empréstimo.");
        return null;
    }
    //renovando o emprestimo do livro
    public void renovarEmprestimo(String novaDataDevolucao) {
        this.dataDevolucao = novaDataDevolucao;
        System.out.println("Data de devolução renovada para: " + novaDataDevolucao);
    }
}