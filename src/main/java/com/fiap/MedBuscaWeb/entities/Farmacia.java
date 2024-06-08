package com.fiap.MedBuscaWeb.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Farmacia implements Serializable {
    private int id;
    private String nome;
    private String endereco;
    private String descricao;

    public Farmacia(){

    }

    public Farmacia(int id, String nome, String endereco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmacia farmacia = (Farmacia) o;
        return Objects.equals(id, farmacia.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
