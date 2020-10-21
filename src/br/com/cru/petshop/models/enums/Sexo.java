package br.com.cru.petshop.models.enums;

public enum Sexo {
    MASCULINO(1),
    FEMININO(2),
    OUTROS(3);
    
    
    private final int value;
    
    private Sexo(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public static Sexo get(int sexo) {
        switch(sexo) {
            case 1:
                return Sexo.MASCULINO;
            case 2:
                return Sexo.FEMININO;
            default:
                return Sexo.OUTROS;
        }
    }
    
    public static String get(Sexo sexo) {
        switch(sexo) {
            case MASCULINO:
                return "MASCULINO";
            case FEMININO:
                return "FEMININO";
            case OUTROS:
                return null;
            default:
                return null;
        }
    }
    
    public static Sexo get(String sexo) {
        if(sexo == null) sexo = "";
        switch(sexo) {
            case "MASCULINO":
                return MASCULINO;
            case "FEMININO":
                return FEMININO;
            default:
                return OUTROS;
        }
    }
}
