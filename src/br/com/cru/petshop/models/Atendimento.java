package br.com.cru.petshop.models;

import br.com.cru.petshop.annotations.Required;
import br.com.cru.petshop.models.enums.LocalizaoEnum;
import java.util.Date;

public class Atendimento {
    
    private int id;
    @Required
    private Date dataEntrega;
    private Date dataPrevisao;
    @Required
    private LocalizaoEnum localizao;
    @Required
    private String idade;
    @Required
    private boolean retorno;
    private boolean ambulancia;
    private String obs;
    @Required
    private Cliente cliente;
    @Required
    private Animal animal;
    @Required
    private Usuario usuario;
    @Required
    private Situacao situacao;

    public Atendimento() {
    }

    public Atendimento(int id, Date dataEntrega, Date dataPrevisao, LocalizaoEnum localizao, String idade, boolean retorno, boolean ambulancia, String obs, Cliente cliente, Animal animal, Usuario usuario, Situacao situacao) {
        this.id = id;
        this.dataEntrega = dataEntrega;
        this.dataPrevisao = dataPrevisao;
        this.localizao = localizao;
        this.idade = idade;
        this.retorno = retorno;
        this.ambulancia = ambulancia;
        this.obs = obs;
        this.cliente = cliente;
        this.animal = animal;
        this.usuario = usuario;
        this.situacao = situacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(Date dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public LocalizaoEnum getLocalizao() {
        return localizao;
    }

    public void setLocalizao(LocalizaoEnum localizao) {
        this.localizao = localizao;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public boolean isRetorno() {
        return retorno;
    }

    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }

    public boolean isAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(boolean ambulancia) {
        this.ambulancia = ambulancia;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    
    
}
