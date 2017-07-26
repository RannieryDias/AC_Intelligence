package model.dados;


import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.dados.IRepositorioServico;
import model.negocio.beans.Servico;
import model.negocio.exceptions.IDIException;
import model.negocio.exceptions.ONExistenteException;

public class RepositorioServico implements IRepositorioServico{
    
	//ATRIBUTOS
                private static RepositorioServico repositorioServico;
	        ConexaoBD conex = new ConexaoBD();
	        private ArrayList<Servico> servicos;
                private Servico servico;
	        
		
	//CONSTRUTOR
		public RepositorioServico(){
			servicos = new ArrayList<>();
		}
	        
	//SINGLETON
	        public static RepositorioServico getInstancia(){
	            if(repositorioServico == null){
	               repositorioServico = getInstancia();
                    }
	            return repositorioServico;            
                    
	        }

	//M�TODOS CADASTRAR
                @Override
		public void cadastrar (Servico servico){
		   servicos.add(servico);
                   salvar(servico);
		}

	//M�TODOS BUSCAR
                @Override
		public Servico buscar(String id) throws IDIException{
	            Servico s = null;
	            for(Servico c : servicos){
	                if(c.getId().equals(id)){
	                    s = c;
	                    break;
	                }
	            }if(s != null){
                         return s;
                    }else
                        throw new IDIException(id);	       	                
                    }
      
		
	//M�TODO REMOVER
                @Override
		public void remover(String id) throws IDIException{
		    boolean r = false;
	            for(int i=0; i<servicos.size(); i++){
	                if(servicos.get(i).getId().equals(id)){
	                    servicos.remove(i);
	                    r = true;
	                    break;
	                }
	            }if(r){
                    salvar(servico);
                    }else
                        throw new IDIException(id);
	  
		}

	//M�TODO ATUALIZAR
                @Override
		public void atualizar(Servico servico, String id) throws ONExistenteException, IDIException{
			remover(id);
			cadastrar(servico);
		}
         public void salvar(Servico servico){
        
        conex.conexao();  //CONECTA O BANCO
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into servicos(id,nome,solicitador,endereco,telefone,valor,data,horario) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, servico.getId());
            pst.setString(2, servico.getNome());
            pst.setString(3, servico.getSolicitador());
            pst.setString(4, servico.getEndereco());
            pst.setString(5, servico.getTelefone());
            pst.setString(6, servico.getValor());
            pst.setString(7, servico.getData());
            pst.setString(8, servico.getHorario());
            pst.execute();
            JOptionPane.showMessageDialog(null,"CADASTRADO COM SUCESSO !!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO AO CADASTRAR !!!" + ex.getMessage());
        }
        
        conex.desconectar();  //DESCONECTA O BANCO
    }
        
        public void editar(Servico servico){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update servicos set nome=?, solicitador=?, endereco=?, telefone=?, valor=?, data=?, horario=? where id=?");
                        
            pst.setString(1, servico.getNome());
            pst.setString(2, servico.getSolicitador());
            pst.setString(3, servico.getEndereco());
            pst.setString(4, servico.getTelefone());
            pst.setString(5, servico.getValor());
            pst.setString(6, servico.getData());
            pst.setString(7, servico.getHorario());
            pst.setString(8, servico.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"DADOS ALTERADO COM SUCESSO !!!" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO AO ALTERAR !!!\n" + ex.getMessage());
        }
        conex.desconectar();
        
    }
        
    public Servico buscar(Servico servico) {
        conex.conexao();
        conex.executaSql("select *from servicos where id like '%" + servico.getPesquisa() + "%'");
        try{
            conex.rs.first();
            servico.setCod_servico(conex.rs.getInt("cod_servico"));
            servico.setId(conex.rs.getString("id"));
            servico.setNome(conex.rs.getString("nome"));
            servico.setSolicitador(conex.rs.getString("solicitador"));
            servico.setEndereco(conex.rs.getString("endereco"));
            servico.setTelefone(conex.rs.getString("telefone"));
            servico.setValor(conex.rs.getString("valor"));
            servico.setData(conex.rs.getString("data"));
            servico.setHorario(conex.rs.getString("horario"));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ID INVÁLIDO !!!");
        }    
        conex.desconectar();
        return servico;
    }
		
	//LISTAR
		public ArrayList<Servico> listar(){
			return servicos;
		}
               
    
   public void excluir(Servico servico){
         conex.conexao();
         try {
            PreparedStatement pst = conex.con.prepareStatement("delete from servicos where id=?");
            pst.setString(1, servico.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null,"EXCLUIDO COM SUCESSO !!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERRO AO EXCLUIR !!!" + ex.getMessage());
        }
            
        conex.desconectar();
   }
   
   public Servico validar(Servico servico) {
        conex.conexao();
        conex.executaSql("select *from servicos where id like '%" + servico.getPesquisa() + "%'");
        try{
            conex.rs.first();          
            servico.setId(conex.rs.getString("id"));            
        }catch(SQLException ex){
         
        }    
        conex.desconectar();
        return servico;
    }

}
