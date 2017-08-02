package model.dados;

import model.negocio.beans.Servico;
import model.negocio.exceptions.IDIException;
import model.negocio.exceptions.ONExistenteException;

public interface IRepositorioServico {

    
    void cadastrar(Servico servico) throws ONExistenteException;

    void atualizar(Servico servico, String id) throws ONExistenteException, IDIException;

    void remover(String id) throws IDIException;

    Servico buscar(String id) throws IDIException;

}
