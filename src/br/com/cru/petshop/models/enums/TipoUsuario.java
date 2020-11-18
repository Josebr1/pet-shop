package br.com.cru.petshop.models.enums;
/**
 * 
 * @author jose.antonio
 */
public enum TipoUsuario {
    ADMINISTRADOR(1),
    ATENDENTE(2);

    private final int value;
    
    private TipoUsuario(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static TipoUsuario get(int tipoUsuario) {
        switch(tipoUsuario){
            case 1:
                return TipoUsuario.ADMINISTRADOR;
            case 2:
                return ATENDENTE;
            default:
                return ADMINISTRADOR;
        }
    }
    
    public static TipoUsuario get(String tipoUsuario) {
        switch(tipoUsuario){
            case "ADMINISTRADOR":
                return ADMINISTRADOR;
            case "ATENDENTE":
                return ATENDENTE;
            default:
                return ADMINISTRADOR;
        }
    }


    public static String get(TipoUsuario tipoUsuario) {
        switch(tipoUsuario){
            case ADMINISTRADOR:
                return "ADMINISTRADOR";
            case ATENDENTE:
                return "ATENDENTE";
            default:
                return "ADMINISTRADOR";
        }
    }
}
