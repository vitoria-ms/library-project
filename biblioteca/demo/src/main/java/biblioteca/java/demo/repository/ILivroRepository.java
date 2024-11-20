package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.java.demo.repository.IBibliotecaRepository;


public interface ILivroRepository extends JpaRepository<Livro, Long>{

}