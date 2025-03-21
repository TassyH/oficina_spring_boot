package primeira_api.api_aluno;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //aqui vc está dizendo que é uma classe service, ou seja, vai ser a classe onde
         // vc vai preparar a logica para mandar para o AlunoRepositorio
        // é o nosso Cérebro, onde você coloca as regras e operações que precisam ser feitas com os dadosx
        // ex: validar dados, fazer cálculos, validar regras especificas, etc, etc
        // o @Service usa o @Repository para acessar o banco de dados e executar os comandos/metodos
public class AlunoService {

    private AlunoRepositorio alunoRepositorio;

    private AlunoService (AlunoRepositorio repositorio){
        this.alunoRepositorio = repositorio;
    }

    public void cadastrar(Aluno aluno){
        alunoRepositorio.save(aluno);//aqui ele vai salvar esse aluno no banco de dados

    }
    public List<Aluno> buscarTodosAlunos(){
        return alunoRepositorio.findAll();
    }

}
