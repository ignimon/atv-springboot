package biblioteca.biblioteca.Service;

import biblioteca.biblioteca.Dto.LivroPostPutDto;
import biblioteca.biblioteca.Dto.LivroResponseDto;
import biblioteca.biblioteca.Model.Livro;
import biblioteca.biblioteca.Repository.AutorRepository;
import biblioteca.biblioteca.Repository.LivroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LivroCrudPadraoService implements LivroCrudService {

    private final Repository.LivroRepository livroRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    AutorRepository autorRepository;

    LivroCrudPadraoService(Repository.LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public LivroResponseDto criarLivro(LivroPostPutDto livroPostPutDto) {
      Livro livro = modelMapper.map(livroPostPutDto, Livro.class);
      return modelMapper.map(livroRepository.save(livro), LivroResponseDto.class);
    }

    @Override
    public LivroResponseDto atualizarLivro(LivroPostPutDto livroPostPutDto) {
        Livro 
    }

    @Override
    public LivroResponseDto buscarLivro(LivroPostPutDto livroPostPutDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarLivro'");
    }

    @Override
    public void removerLivro(Long isbn) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerLivro'");
    }


}