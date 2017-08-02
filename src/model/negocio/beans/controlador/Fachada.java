package model.negocio.beans.controlador;

import java.util.List;

import model.negocio.beans.Cliente;
import model.negocio.beans.Servico;
import model.negocio.exceptions.*;

public class Fachada implements IFachada{
	
	private ControlCliente cadCliente;
	private ControlServico cadServico;
	public static Fachada singleton;
        

	
	public Fachada(){
		cadCliente = new ControlCliente();
		cadServico = new ControlServico();
	}
	
	public static Fachada getSingleton(){
		
		if(singleton == null){
			singleton = new Fachada();
		}
		return singleton;
	}
	
    
  //  @Override
	public void cadastrarCliente(Cliente cliente) throws ONExistenteException, CPFIException{
		cadCliente.cadastrarCliente(cliente);
	}
	
    
	public void removerCliente(String cpf) throws CPFIException{
		cadCliente.removerCliente(cpf);
	}
	
	public void atualizarCliente(Cliente novo, String cpf) throws ONExistenteException, CPFIException{
		cadCliente.atualizarCliente(novo, cpf);
	}
	
	public Cliente buscarCliente(String cpf) throws CPFIException{
		return cadCliente.buscarCliente(cpf);
	}
	
	public List<Cliente> listarCliente(){
		return cadCliente.listarCliente();
	}
	
	public void cadastrarServico(Servico servico) throws ONExistenteException{
		cadServico.cadastrarServico(servico);
		
	}
	
	public void removerServico(String id) throws IDIException{
		cadServico.removerServico(id);
	}
	
	public void atualizarServico(Servico novo, String id) throws ONExistenteException, IDIException{
		cadServico.atualizarServico(novo, id);
	}
	
	public Servico buscarServico(String id) throws IDIException{
		return cadServico.buscarServico(id);
	}
	
	public List<Servico> listarServico(){
		return cadServico.listarServico();
	}





}
