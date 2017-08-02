package model.negocio.beans.controlador;

import java.util.List;
import model.dados.RepositorioServico;
//teste

import model.negocio.beans.Servico;
import model.negocio.exceptions.IDIException;
import model.negocio.exceptions.ONExistenteException;

public class ControlServico{

    private final RepositorioServico repositorioServico;
    
    
    public ControlServico(){
        repositorioServico = RepositorioServico.getInstancia();
    }
	
	public void cadastrarServico(Servico servico){
            repositorioServico.cadastrar(servico);
	}
	
	public void removerServico(String id) throws IDIException{
            repositorioServico.remover(id);
	}
	
	public void atualizarServico(Servico novo, String id) throws IDIException, ONExistenteException{
            repositorioServico.atualizar(novo, id);
	}
	
	public Servico buscarServico(String id) throws IDIException{
		return repositorioServico.buscar(id);
	}
	
	List<Servico> listarServico(){
		return repositorioServico.listar();
	}
}

