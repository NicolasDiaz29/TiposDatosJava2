package modelo;

import javax.imageio.spi.ImageReaderSpi;

public class TiposDatosJava2
{
    public static void main(String[] args) 
    {
        // Tipos de datos primitivos
        int x = 12;
        char c = '@';
        double y = 2.45;
        boolean esta = true;
        System.out.println("Tipos de datos primitivos: ");
        System.out.println("x = " + x);

        // Tipos de datos referenciados
        String s = "UIS SOCORRO";
        int [] a = new int[12];
        Punto pl = new Punto(2,3);
        System.out.println("Tipos de datos referenciados: ");
        System.out.println(pl);

    }

}