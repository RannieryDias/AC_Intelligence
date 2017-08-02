package model.negocio.beans.controlador;

import java.util.List;
import model.dados.RepositorioCliente;
import model.negocio.beans.Cliente;
import model.negocio.exceptions.CPFIException;
import model.negocio.exceptions.ONExistenteException;

public class ControlCliente {

   private final RepositorioCliente repositorioCliente;
    
	
	public ControlCliente(){
		repositorioCliente = RepositorioCliente.getInstancia();
                
            
	}
	
	public void cadastrarCliente(Cliente cliente) throws CPFIException{
            
                repositorioCliente.cadastrar(cliente);
            
	}
	
	public void removerCliente(String cpf) throws CPFIException{
		repositorioCliente.remover(cpf);
	}
	
	public void atualizarCliente(Cliente novo, String cpf) throws ONExistenteException, CPFIException{
		repositorioCliente.atualizar(novo, cpf);
	}
	
	public Cliente buscarCliente(String cpf) throws CPFIException{
            return repositorioCliente.buscar(cpf);
            
		
	}
	
	List<Cliente> listarCliente(){
		return repositorioCliente.listar();
	}

    }
          
