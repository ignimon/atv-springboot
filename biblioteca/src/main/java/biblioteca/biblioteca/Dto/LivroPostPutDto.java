package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroPostPutDto {
    @JsonProperty("tituloLivro")
    @NotBlank(message = "Nome do autor não pode ser vazio")
    private String nomeLivro;

    @JsonProperty("nomeAutor")
    @NotBlank(message = "Nome do autor não pode ser vazia")
    private String nomeAutor;
    
    @JsonProperty("anoLivro")
    @NotBlank(message = "ano do livro não pode ser vazia")
    private String anoLivro;
    
    @JsonProperty("ediçãoLivro")
    @NotBlank(message = "edição do livro não pode ser vazia")
    private String ediçãoLivro;
}