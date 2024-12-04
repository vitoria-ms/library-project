package biblioteca.java.demo.repository;

import biblioteca.java.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILivroRepository extends JpaRepository<Livro, Long>{

    public void findBytitulo(String titulo);
}  