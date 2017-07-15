package model.negocio.beans;

public class Cliente {
	
	private String nome, cpf, endereco, email, telefone, pesquisa;
        private int codigo;
        
	
        
        public Cliente(){
            
        }
        
	public Cliente(String nome, String cpf, String endereco, String email, String telefone, int codigo){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setEmail(email);
		this.setTelefone(telefone);
                this.codigo = codigo;
		
	}

   

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean equals(Object obj){
		boolean r =false;
		if(obj != null && obj instanceof Cliente && this.getCpf() != null)
			r = ((Cliente)obj).getCpf().equals(this.getCpf());
		return r;
	
	}	
	public String toString(){
		return super.toString();
		}

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }



}
