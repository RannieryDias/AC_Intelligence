package model.negocio.beans;

public class Servico {
	
	private String solicitador; 
        private String nome;
        private String endereco; 
        private String telefone; 
        private String valor;
        private String data;
        private String horario; 
        private String id;
        private String pesquisa;
        private int cod_servico;
        private int setCod_servico;
        
	

public Servico(String nome, String endereco, String telefone, String data, String valor, String horario,int cod_servico){
	
	this.setNome(nome);
	this.setEndereco(endereco);
	this.setData(data);
	this.setTelefone(telefone);
	this.setValor(valor);
	this.setHorario(horario);
        this.setCod_servico(cod_servico);
}

    public Servico() {
       
    }


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public String getValor() {
	return valor;
}

public void setValor(String valor) {
	this.valor = valor;
}

public String getHorario() {
	return horario;
}

public void setHorario(String horario) {
	this.horario = horario;
}

    /**
     * @return the solicitador
     */
    public String getSolicitador() {
        return solicitador;
    }

    /**
     * @param solicitador the solicitador to set
     */
    public void setSolicitador(String solicitador) {
        this.solicitador = solicitador;
    }

    /**
     * @return the cod_servico
     */
    public int getCod_servico() {
        return cod_servico;
    }

    /**
     * @param cod_servico the cod_servico to set
     */
    public void setCod_servico(int cod_servico) {
        this.setCod_servico = cod_servico;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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

    /**
     * @param cod_servico the cod_servico to set
     */
}

