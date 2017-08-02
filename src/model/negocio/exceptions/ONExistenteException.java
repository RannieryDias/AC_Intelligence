/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.negocio.exceptions;

import model.negocio.beans.Servico;

/**
 *
 * @author Kira
 */
public class ONExistenteException extends Exception{
    
    public ONExistenteException(String cpf){
        super("Cliente Inexistente" + cpf);
    }
    
    public ONExistenteException(Servico id){
        super("ID Inválido" + id);
    }
}
