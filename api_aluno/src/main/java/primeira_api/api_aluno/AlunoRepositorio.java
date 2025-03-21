package primeira_api.api_aluno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //aqui vc está falando oficialmente que essa classe é um repositorio
public interface AlunoRepositorio extends JpaRepository<Aluno, Integer> {

    //com essa classe, essa anotação @Repository e esse extends, nós vamos estar habilitados para chamar os métodos para o
    // CRUD no banco de dados
    // ao criar um objeto do tipo dessa classe, com ele vc vai fazer tudo o que precisa no banco
}
