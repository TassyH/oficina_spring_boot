package primeira_api.api_aluno;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //aqui vc está dizendo que é uma classe service, ou seja, vai ser a classe onde vc vai
public class AlunoService {

    private AlunoRepositorio alunoRepositorio;

    private AlunoService (AlunoRepositorio repositorio){
        this.alunoRepositorio = repositorio;
    }

    public void cadastrar(Aluno aluno){
        alunoRepositorio.save(aluno); //aqui ele vai salvar esse aluno no banco de dados
    }

    public Aluno buscaAlunoID(int id){
        return alunoRepositorio.findById(id).orElse(null);
    }

    public List<Aluno> buscarTodosAlunos(){
        return alunoRepositorio.findAll();
    }

}
