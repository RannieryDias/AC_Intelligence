package model.negocio.beans.controlador;

import java.util.List;

import model.negocio.beans.Cliente;
import model.negocio.beans.Servico;
import model.negocio.exceptions.CPFIException;
import model.negocio.exceptions.IDIException;
import model.negocio.exceptions.ONExistenteException;



public interface IFachada {

	//CLIENTE
	void cadastrarCliente(Cliente cliente) throws ONExistenteException;
	
	void removerCliente(String cpf) throws CPFIException;
	
	void atualizarCliente(Cliente novo, String cpf) throws ONExistenteException, CPFIException;
	
	Cliente buscarCliente(String cpf) throws CPFIException;
	
	List<Cliente> listarCliente();
	
	
	//SERVICO
	void cadastrarServico(Servico servico) throws ONExistenteException;
	
	void removerServico(String id) throws IDIException;
	
	void atualizarServico(Servico novo, String id) throws ONExistenteException, IDIException;
	
	Servico buscarServico(String id) throws IDIException;
	
	List<Servico> listarServico();
}
