package biblioteca.biblioteca.Service;

import biblioteca.biblioteca.Dto.AutorResponseDto;
import biblioteca.biblioteca.Dto.LivroPostPutDto;
import biblioteca.biblioteca.Dto.LivroResponseDto;
import biblioteca.biblioteca.Model.Autor;
import biblioteca.biblioteca.Model.Livro;
import biblioteca.biblioteca.Repository.AutorRepository;
import biblioteca.biblioteca.Repository.LivroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class LivroCrudPadraoService implements LivroCrudService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    LivroRepository livroRepository;

    @Override
    public LivroResponseDto criarLivro(LivroPostPutDto livroPostPutDto) {
      Livro livro = modelMapper.map(livroPostPutDto, Livro.class);
      return modelMapper.map(livroRepository.save(livro), LivroResponseDto.class);
    }

    @Override
    public LivroResponseDto atualizarLivro(LivroPostPutDto livroPostPutDto, Long id) {
        Livro livro = obterLivroExistente(id);
        modelMapper.map(livroPostPutDto, livro);
        return modelMapper.map(livroRepository.save(livro), LivroResponseDto.class);
    }

    @Override
    public LivroResponseDto buscarLivro(LivroPostPutDto livroPostPutDto, Long id) {
        return modelMapper.map(obterLivroExistente(id), LivroResponseDto.class);
    }

    @Override
    public void removerLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro obterLivroExistente(Long id){
        return livroRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado."));
    }

}