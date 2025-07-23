package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "cliente") // indica para o JPA que esta classe é uma entidade

public class Cliente {

    @Id //-- indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //--indica que este valor é automatizado

    private int id;
    private String nome;
    private String dataNascimento;
    private String genero;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String doencaCronica;
    private String usoMedimento;
    private String alergia;
    private String cirurgia;
    private String condicaoDermatologica;

    public Cliente() {
    }

    public Cliente(int id, String nome, String dataNascimento, String genero, String cpf, String endereco, String telefone, String email, String doencaCronica, String usoMedimento, String alergia, String cirurgia, String condicaoDermatologica) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.doencaCronica = doencaCronica;
        this.usoMedimento = usoMedimento;
        this.alergia = alergia;
        this.cirurgia = cirurgia;
        this.condicaoDermatologica = condicaoDermatologica;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoencaCronica() {
        return doencaCronica;
    }

    public void setDoencaCronica(String doencaCronica) {
        this.doencaCronica = doencaCronica;
    }

    public String getUsoMedimento() {
        return usoMedimento;
    }

    public void setUsoMedimento(String usoMedimento) {
        this.usoMedimento = usoMedimento;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(String cirurgia) {
        this.cirurgia = cirurgia;
    }

    public String getCondicaoDermatologica() {
        return condicaoDermatologica;
    }

    public void setCondicaoDermatologica(String condicaoDermatologica) {
        this.condicaoDermatologica = condicaoDermatologica;
    }

}
