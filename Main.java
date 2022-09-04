public class Main {
    public static void main(String[] args) {
        Caja c = new Caja();
        c.insertar(9);
        c.insertar(2);
        c.insertar(5);
        c.insertar(3);
        c.insertar(8);
        c.insertar(1);
        c.insertar(6);
        c.insertar(7);
        c.insertar(3);

        c.mostrarDatos();
        System.out.println("**********");
        c.eliminar(1);
        c.mostrarDatos();
        System.out.println("**********");
        c.ordenar();
        c.mostrarDatos();
        
    }
}
