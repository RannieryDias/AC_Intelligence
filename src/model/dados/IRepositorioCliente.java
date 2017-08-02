package model.dados;

import java.util.ArrayList;

import model.negocio.beans.Cliente;
import model.negocio.exceptions.CPFIException;
import model.negocio.exceptions.ONExistenteException;

public interface IRepositorioCliente {

	    public void cadastrar(Cliente cliente) throws ONExistenteException;
		
	    public void atualizar(Cliente nome, String cpf) throws ONExistenteException, CPFIException;
		
	    public void remover(String cpf) throws CPFIException;

	    public Cliente buscar(String cpf) throws CPFIException;
	    
	    public ArrayList<Cliente> listar();
}
