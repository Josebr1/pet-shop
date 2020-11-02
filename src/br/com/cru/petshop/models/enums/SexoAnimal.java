package br.com.cru.petshop.models.enums;

public enum SexoAnimal {
    MACHO(1),
    FEMEA(2),
    FEMEA_CASTRADA(3),
    INDEFINIDO(4),
    MACHO_CASTRADO(5);
    
    
    private final int value;
    
    private SexoAnimal(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public static SexoAnimal get(int sexo) {
        switch(sexo) {
            case 1:
                return SexoAnimal.MACHO;
            case 2:
                return SexoAnimal.FEMEA;
            case 3:
                return SexoAnimal.FEMEA_CASTRADA;
            case 4:
                return SexoAnimal.MACHO_CASTRADO;
            default:
                return SexoAnimal.INDEFINIDO;
        }
    }
    
    public static String get(SexoAnimal sexo) {
        switch(sexo) {
            case MACHO:
                return "MACHO";
            case FEMEA:
                return "FEMEA";
            case FEMEA_CASTRADA:
                return "FEMEA_CASTRADA";
            case MACHO_CASTRADO:
                return "MACHO_CASTRADO";
            default:
                return "INDEFINIDO";
        }
    }
    
    public static SexoAnimal get(String sexo) {
        if(sexo == null) sexo = "";
        
        switch(sexo) {
            case "MACHO":
                return MACHO;
            case "FEMEA":
                return FEMEA;
             case "FEMEA_CASTRADA":
                return FEMEA_CASTRADA;
            case "MACHO_CASTRADO":
                return MACHO_CASTRADO;
            default:
                return INDEFINIDO;
        }
    }
}

