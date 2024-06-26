package br.com.brunosan.barriga.domain;

import br.com.brunosan.barriga.domain.exceptions.ValidationException;

public class Usuario {
    private Long id;
    private String nome;
    private String email;
    private String senha;
    
    public Usuario() {
    }
    
    public Usuario(Long id, String nome, String email, String senha) {
        if (nome == null) throw new ValidationException("Nome é obrigatório");
        if (email == null) throw new ValidationException("Email é obrigatório");
        if (senha == null) throw new ValidationException("Senha é obrigatória");
        
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }
}
