package br.com.fiap.checkpoint1.dto;

import br.com.fiap.checkpoint1.model.Pacientes;

public class PacienteResponse {
    private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;

    //metodo para auxiliar no envio de informações paro a web
    public PacienteResponse toDto(Pacientes pacientes){
        this.setId(pacientes.getId());
        this.setNome(pacientes.getNome());
        this.setEndereco(pacientes.getEndereco());
        this.setBairro(pacientes.getBairro());
        this.setEmail(pacientes.getEmail());
        this.setTelefone_completo(pacientes.getTelefone_completo());
        return this;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone_completo() {
        return telefone_completo;
    }

    public void setTelefone_completo(String telefone_completo) {
        this.telefone_completo = telefone_completo;
    }
}
