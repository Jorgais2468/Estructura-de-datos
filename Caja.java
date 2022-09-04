/*
Elaborar un programa que incorpore en un vector de 10 elementos 
sus operaciones basicas:
-Insertar
-Eliminar
-Ordenar
-Busacr
 */
public class Caja implements ICaja{
    private int[] elementos;
    private int indice;

    public Caja(){
        elementos = new int[10];
        indice = 0;
    }

    @Override
    public boolean insertar(int valor) {
        if (indice > 9) {
            return false;
        }
        elementos[indice] = valor;
        indice++;
        return true;
    }

    @Override
    public void eliminar(int indice) {
        if (elementos[indice]!=0) {
            for (int i = indice; i < elementos.length -1; i++) {
                elementos[indice] = elementos[i+1];
                indice++;
            }
        }
    }

    @Override
    public void ordenar() {
        int auxiliar;
        for(int i = 2; i < elementos.length; i++){
            for(int j = 0;j < elementos.length-i;j++){
                if(elementos[j] > elementos[j+1]){
                    auxiliar = elementos[j];
                    elementos[j] = elementos[j+1];
                    elementos[j+1] = auxiliar;
                }   
            }
        }
    }

    @Override
    public boolean buscar(int valor) {
        return true;
    }

    @Override
    public void mostrarDatos() {
        for (int i : elementos) {
            System.out.println(i);
        } 
    }
    
}
