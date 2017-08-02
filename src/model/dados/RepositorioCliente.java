package model.dados;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.negocio.beans.Cliente;
import model.negocio.exceptions.CPFIException;
import model.negocio.exceptions.ONExistenteException;

public class RepositorioCliente implements IRepositorioCliente{


private static RepositorioCliente repositorioCliente;
private  ArrayList<Cliente> clientes;
ConexaoBD conex = new ConexaoBD();
    private Cliente cliente;
   
    

	
//CONSTRUTOR	
	public RepositorioCliente(){
            clientes = new ArrayList<>();
            
        }
        
//Singleton
        public static RepositorioCliente getInstancia(){
            if(repositorioCliente == null){
                repositorioCliente = getInstancia();
            }
            return repositorioCliente;
    
            }

//M�TODO INSERIR


@Override
	public void cadastrar(Cliente cliente){
       
            clientes.add(cliente);
            salvar(cliente);
        }
//M�TODO REMOVER


@Override
	public void remover(String cpf) throws CPFIException{
                
		boolean r = false;
                for(int i=0; i<clientes.size(); i++){
                   if(clientes.get(i).getCpf().equals(cpf)){
                       clientes.remove(i);
                       r = true;
                       break;
                   }
                }if(r){
               salvar(cliente);
                }else
                    throw new CPFIException(cpf);
            }

//M�TODO BUSCAR	

   

@Override
	public Cliente buscar(String cpf) throws CPFIException{
            Cliente r = null;
            for(Cliente c : clientes){
                if(c.getCpf().equals(cpf)){
                    r = c;
                    break;
                }
            }if(r != null){       
             return r;
            }else
                throw new CPFIException(cpf);
	}
	
//M�TODO ATUALIZAR

@Override
	public void atualizar(Cliente cliente, String cpf) throws ONExistenteException, CPFIException{

        remover(cpf);
        cadastrar(cliente);
	}

//M�TODO LISTAR
@Override
        public ArrayList<Cliente> listar(){
            return clientes;
        }
       
        public void salvar(Cliente cliente){
        
        conex.conexao();  //CONECTA O BANCO
        try {            
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes(nome,cpf,endereco,telefone,email) values(?,?,?,?,?)");
            pst.setString(1, cliente.getNome());            
            pst.setString(2, cliente.getCpf());
            pst.setString(3, cliente.getEndereco());
            pst.setString(4, cliente.getTelefone());
            pst.setString(5, cliente.getEmail());
            pst.execute();
            JOptionPane.showMessageDialog(null,"CADASTRADO COM SUCESSO !!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO AO CADASTRAR !!!" + ex.getMessage());
        }
        
        conex.desconectar();  //DESCONECTA O BANCO
    }
    
        public Cliente buscar(Cliente cliente) {
        conex.conexao();
        conex.executaSql("select *from clientes where cpf like '%" + cliente.getPesquisa() + "%'");
        try{
            conex.rs.first();
            cliente.setCodigo(conex.rs.getInt("cod_cliente"));
            cliente.setNome(conex.rs.getString("nome"));
            cliente.setCpf(conex.rs.getString("cpf"));
            cliente.setEndereco(conex.rs.getString("endereco"));
            cliente.setTelefone(conex.rs.getString("telefone"));
            cliente.setEmail(conex.rs.getString("email"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"CPF INVÁLIDO !!!\n||   Tente Outro   ||");
        }    
        conex.desconectar();
        return cliente;
    }
    
    //MÉTODO ATUALIZAR
    public void editar(Cliente cliente){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set nome=?, endereco=?, telefone=?, email=? where cpf=?");
            
            
            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEndereco());
            pst.setString(3, cliente.getTelefone());
            pst.setString(4, cliente.getEmail());
            pst.setString(5, cliente.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null,"DADOS ALTERADO COM SUCESSO !!!" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO ALTERAR !!!\n" + ex.getMessage());
        }
        conex.desconectar();
        
    }


    public void excluir(Cliente cliente){
         conex.conexao();
         try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes where cpf=?");
            pst.setString(1, cliente.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null,"EXCLUIDO COM SUCESSO !!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR !!!" + ex.getMessage());
        }
            
        conex.desconectar();
    }
    
       public Cliente validacion(Cliente cliente) {
        conex.conexao();
        conex.executaSql("select *from clientes where cpf like '%" + cliente.getPesquisa() + "%'");
        try{
            conex.rs.first();          
            cliente.setCpf(conex.rs.getString("cpf"));            
        }catch(SQLException ex){
         
        }    
        conex.desconectar();
        return cliente;
    }
   
     
}
