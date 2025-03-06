package api_aluno_v1.api_aluno_v1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // estamos dizendo ao spring que esta classe é um controlador de rotas
@RequestMapping("/aluno") // aqui estamos definindo a nossa rota base da chamada da api
public class AlunoControlador {
    private List<Aluno> alunos = new ArrayList<>(); // vamos usar uma lista para guardar os alunos

    // POST é o comando especial para adicionar um aluno na nossa api
    @PostMapping
    public void adicionarAluno(@RequestBody Aluno aluno) {
        alunos.add(aluno); // aqui estamos adicionando o aluno na lista que criamos acima
    }

    // GET é o nosso comando especial para listar todos os alunos da nossa lista
    @GetMapping
    public List<Aluno> listarAlunos() {
        return alunos; // retorna a lista de alunos
    }
}

