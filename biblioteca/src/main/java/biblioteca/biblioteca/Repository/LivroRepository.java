package biblioteca.biblioteca.Repository;

import biblioteca.biblioteca.Model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Autor, Long> {
}