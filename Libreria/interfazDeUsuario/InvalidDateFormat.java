package libreria.interfazDeUsuario;

public class InvalidDateFormat extends Exception {
    public InvalidDateFormat(){
        super();
    }
    public InvalidDateFormat(String message) {
        super(message);
    }
}