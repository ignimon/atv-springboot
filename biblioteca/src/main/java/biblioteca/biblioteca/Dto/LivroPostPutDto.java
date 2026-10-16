package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import biblioteca.biblioteca.Model.Autor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank(message = "Nome do livro não pode ser vazio")
    private String tituloLivro;

    @JsonProperty("id_autor")
    @NotNull
    private Long id_autor;
    
    @JsonProperty("anoLivro")
    @NotBlank(message = "ano do livro não pode ser vazia")
    private String anoLivro;
    
    @JsonProperty("ediçãoLivro")
    @NotBlank(message = "edição do livro não pode ser vazia")
    private String ediçãoLivro;
}