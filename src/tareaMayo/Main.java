package tareaMayo;

public class Main {

    public static void main(String[] args) {
        
    	// moduloDao sin parámetros
        ModuloDAO ModuloDao = new ModuloDAO();
        
        // 2 Objetos Módulo
        Modulo modulo1 = new Modulo("Programacion", 120, "Juan Fernandez", 10, 9);
        Modulo modulo2 = new Modulo("Bases de datos", 90, "Maria Gomez", 11, 8);

        ModuloDao.insertarModulo(modulo1);
        ModuloDao.insertarModulo(modulo2);    
    }
}

