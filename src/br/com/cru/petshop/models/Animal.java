package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;
import br.com.cru.petshop.models.enums.SexoAnimal;
import java.util.Date;

public class Animal {
    
    private int id;
    private String cor;
    @Required
    private String raca;
    private String apelido;
    private Date nascimento;
    @Required
    private SexoAnimal sexo;
    private String porte;
    private String obs;
    @Required
    private Cliente cliente;
    @Required
    private Especie especie;

    public Animal(int id, String cor, String raca, String apelido, Date nascimento, SexoAnimal sexo, String porte, String obs, Cliente cliente, Especie especie) {
        this.id = id;
        this.cor = cor;
        this.raca = raca;
        this.apelido = apelido;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.porte = porte;
        this.obs = obs;
        this.cliente = cliente;
        this.especie = especie;
    }

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
