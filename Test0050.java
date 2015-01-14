
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    /**
     * Multiplica dos números
     */
    public int multiplicar(int num1, int num2){
        int contador = 0;
        int resultado = 0;
        while(contador<num2){
            resultado = resultado + num1;
            contador++;
        }
        return resultado;
    }
    /**
     * Divide dos números
     */
    public int dividir(int num1, int num2){
        int contador = num1;
        int resultado = 0;
        while(contador>0){
            contador = contador - num2;
            resultado++;
        }
        return resultado;
    }
    /**
     * Realiza el módulo entre dos números
     */
    public int modulo(int num1, int num2){
        int contador = num1;
        int resultado = 0;
        while(contador>=num2){
            contador = contador - num2;
            if(contador<num2){
                resultado = contador;
            }
        }
        return resultado;
    }
    /*
     * Realiza la potencia de un número
     */
    public int potencia(int num1, int num2){
        int resultado = num1;
        int contador = 1;
        while(contador < num2){
            resultado = multiplicar(resultado,num1);
            contador++;
        }
        return resultado;
    }
}
