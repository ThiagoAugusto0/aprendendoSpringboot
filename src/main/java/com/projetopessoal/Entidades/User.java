package com.projetopessoal.Entidades;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private String email;
    private String senha;
    private String phone;

    public User(){

    }
    public User(long id, String name, String email, String senha, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getPhone() {
        return phone;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
