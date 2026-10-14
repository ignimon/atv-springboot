package biblioteca.biblioteca.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@Table(name = "tb_livro")
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("isbn")
    private Long isbn;

    @Column(name = "ds_tituloLivro", nullable = false)
    @JsonProperty("tituloLivro")
    private String tituloLivro;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private String id_autor;

    @Column(name = "ds_anoLivro", nullable = false)
    @JsonProperty("anoLivro")
    private String anoLivro;

    @Column(name = "ds_ediçãoLivro", nullable = false)
    @JsonProperty("ediçãoLivro")
    private String ediçãoLivro;

}

//criacao exclusao atualizacao busca
//busca isbn titulo
//autor removido, CASCADE