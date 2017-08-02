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
public class IDIException extends Exception {
    public IDIException(String id){
        super("ID" + id + "fora do padrão");
    }
}
