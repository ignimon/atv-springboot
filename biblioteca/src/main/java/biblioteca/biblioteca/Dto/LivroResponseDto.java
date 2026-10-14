package biblioteca.biblioteca.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroResponseDto {
    @JsonProperty("isbn")
    private Long isbn;

    @JsonProperty("tituloLivro")
    private String tituloLivro;

    @JsonProperty("anoLivro")
    private String anoLivro;
    
    @JsonProperty("ediçãoLivro")
    private String ediçãoLivro;

    @JsonProperty("id_autor")
    private String id_autor;
}