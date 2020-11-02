/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cru.petshop.models.enums;

/**
 *
 * @author joses
 */
public enum LocalizaoEnum {
    AREA_DE_TOSA(1),
    AREA_DE_BANHO(2),
    CANIL(3),
    NA_RESPONSABILIDADE_DO_CLIENTE(4),
    SALA_DE_ESPERA(5),
    NO_CONSULTORIO(4);
    
    private final int value;
    
    private LocalizaoEnum(int value){
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public static LocalizaoEnum get(int localizacao) {
        switch(localizacao) {
            case 1:
                return LocalizaoEnum.AREA_DE_TOSA;
            case 2:
                return LocalizaoEnum.AREA_DE_BANHO;
            case 3:
                return LocalizaoEnum.CANIL;
            case 4:
                return LocalizaoEnum.NA_RESPONSABILIDADE_DO_CLIENTE;
            case 5:
                return LocalizaoEnum.SALA_DE_ESPERA;
            case 6:
                return LocalizaoEnum.NO_CONSULTORIO;
            default:
                return LocalizaoEnum.NA_RESPONSABILIDADE_DO_CLIENTE;
        }
    }
    
    public static String get(LocalizaoEnum localizacao) {
        switch(localizacao) {
            case AREA_DE_TOSA:
                return "AREA DE TOSA";
            case AREA_DE_BANHO:
                return "AREA DE BANHO";
            case CANIL:
                return "CANIL";
            case NA_RESPONSABILIDADE_DO_CLIENTE:
                return "NA RESPONSABILIDADE DO CLIENTE";
            case SALA_DE_ESPERA:
                return "SALA DE ESPERA";
            case NO_CONSULTORIO:
                return "NO CONSULTORIO";
            default:
                return "NA RESPONSABILIDADE DO CLIENTE";
        }
    }
    
    public static LocalizaoEnum get(String localizacao) {
        switch(localizacao) {
            case "AREA DE TOSA":
                return LocalizaoEnum.AREA_DE_TOSA;
            case "AREA DE BANHO":
                return LocalizaoEnum.AREA_DE_BANHO;
            case "CANIL":
                return LocalizaoEnum.CANIL;
            case "NA RESPONSABILIDADE DO CLIENTE":
                return LocalizaoEnum.NA_RESPONSABILIDADE_DO_CLIENTE;
            case "SALA DE ESPERA":
                return LocalizaoEnum.SALA_DE_ESPERA;
            case "NO CONSULTORIO":
                return LocalizaoEnum.NO_CONSULTORIO;
            default:
                return LocalizaoEnum.NA_RESPONSABILIDADE_DO_CLIENTE;
        }
    }
}
