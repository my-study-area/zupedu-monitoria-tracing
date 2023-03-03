package br.com.zup.edu.personmanager.model;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public ResponseEntity<?> inserir(@Valid @RequestBody PessoaRequest request){

        var novaPessoa = request.toModel();

        if(pessoaRepository.findByCpf(novaPessoa.getCpf()).isPresent()){
            logger.warn("Já existe uma pessoa cadastrada com cpf {}", novaPessoa.getCpf());
            return ResponseEntity.badRequest().body("Já existe uma pessoa cadastrada com esse cpf");
        }else{
            pessoaRepository.save(novaPessoa);
            logger.info("Nova pessoa cadastrada com sucesso!");
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(PessoaResponse.from(novaPessoa));
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){

        var pessoa = pessoaRepository.findById(id)
            .orElseThrow( PessoaInexistenteException::new);

        pessoaRepository.delete(pessoa);
        logger.info("Pessoa com id {} excluída com sucesso!", id);
    }
}
