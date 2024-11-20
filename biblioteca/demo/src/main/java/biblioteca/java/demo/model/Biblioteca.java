package biblioteca.java.demo.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;



/*
 A ser feito:
-mapeamento das tabelas com o entity V
-definir tamanho do campos e se são obrigatórios V 
-relacionar

*/

@Entity
@Table(name = "BIBLIOTECA")

   public class Biblioteca extends AbstractEntity<Long>{
    @Id

    @Column(nullable = false, unique = true, length = 60)


       private List<Livro> listaLivros = new ArrayList<>();
       private List<Usuario> listaUsuarios = new ArrayList<>();
       private List<Emprestimo> listaEmprestimos = new ArrayList<>();
       

       //Getters e Setters
    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    //Método de registro de livro feito pelo funcionário
    public void registrarLivro(Livro livro) {
        if (!listaLivros.contains(livro)) {
            listaLivros.add(livro);
            System.out.println("Livro registrado com sucesso.");
        } else {
            System.out.println("O livro já está registrado no sistema.");
        }
    }
    //Método remoção do exemplar
    public void removerLivro(Livro livro) {
        if (listaLivros.remove(livro)) {
            System.out.println("Livro removido com sucesso do sistema.");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
    //Método de busca exemplar
    public Livro buscarLivro(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }
    //Método de buscar usuário
    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado.");
        return null;
    }
}