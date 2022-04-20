package br.com.senai.model;

public class Contato {
    private String nome;
    private Telefone[] telefones;
    private Endereco endereco;

    public Contato(String nome, Telefone[] telefones, Endereco endereco) {
        super();
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void mostrarTelefone() {
        for (int i = 0; i < telefones.length; i++) {
            if (telefones[i] == null) {
                telefones[i] = telefones;
                return;

            }
        }
    }



}