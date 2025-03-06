package primeira_api.api_aluno;

// esse cara vai administrar as rotas da nossa api

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //aqui vc está dizendo oficalmente para o java que essa classe vai ser o seu controlador de rotas
@RequestMapping("aluno") //aqui vc está definindo qual vai ser a rota raiz para acessa seu controlador
public class AlunoControlador {

    AlunoService alunoService;

    public AlunoControlador(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public void cadastrar(@RequestBody Aluno aluno){
        alunoService.cadastrar(aluno); //aqui ele vai solicitar o acesso ao service e o service solicita para o repositorio
    }

    @GetMapping
    public List<Aluno> buscaTudo(){
       return alunoService.buscarTodosAlunos();
    }

    @GetMapping("{id}")
    public Aluno buscarPorId(@PathVariable int id){
        return alunoService.buscaAlunoID(id);
    }

}
