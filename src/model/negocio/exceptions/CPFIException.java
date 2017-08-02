/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.negocio.exceptions;

/**
 *
 * @author Kira
 */
public class CPFIException extends Exception{
    public CPFIException(String cpf){
        super("CPF Inválido" + cpf);
    }
    
}
