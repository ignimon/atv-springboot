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
    @JsonProperty("id")
    private Long id;

    @Column(name = "ds_tituloLivro", nullable = false)
    @JsonProperty("tituloLivro")
    private String tituloLivro;

    @Column(name = "ds_autorLivro", nullable = false)
    @JsonProperty("autorLivro")
    @ManyToOne
    @JoinColumn()
    private String autorLivro;

    @Column(name = "ds_anoLivro", nullable = false)
    @JsonProperty("anoLivro")
    private String anoLivro;

    @Column(name = "ds_ediçãoLivro", nullable = false)
    @JsonProperty("ediçãoLivro")
    private String ediçãoLivro;

}



// livro (isbn titulo autor ano edicao) ->
//criacao exclusao atualizacao busca
//busca isbn titulo
//autor removido, CASCADE