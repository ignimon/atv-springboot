package biblioteca.biblioteca.Service;

import biblioteca.biblioteca.Dto.LivroPostPutDto;
import biblioteca.biblioteca.Dto.LivroResponseDto;


public interface LivroCrudService {

    LivroResponseDto criarLivro(LivroPostPutDto livroPostPutDto);

    LivroResponseDto atualizarLivro(LivroPostPutDto livroPostPutDto, Long id);

    LivroResponseDto buscarLivro(Long id);

    void removerLivro(Long id);

}