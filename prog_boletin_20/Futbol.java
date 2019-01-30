package prog_boletin_20;
//@author emendezduran

import java.util.Random;

public class Futbol {

    String[] nomEq;
    int[][] tabla;

    public Futbol() {
    }

    public Futbol(int numero) {
        tabla = new int[numero][((numero-1)*2)];
        nomEq = new String[numero];
        randNom();
        randGol();
        

    }
    
    public void randGol() {
        Random rand = new Random();
        for (int i = 0; i < nomEq.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = rand.nextInt(5);
            }

        }

    }

    public void randNom() {
        for (int i = 0; i < nomEq.length; i++) {
            nomEq[i] = "Equipo " +(i + 1);
        }
    }
    
    public void mostrarTabla() {
        System.out.printf("%10s","Jornada");
        for (int k = 1; k < tabla[0].length +1; k++) {
            System.out.printf("%5d", k);
        }
        System.out.println("");
        for (int i = 0; i < nomEq.length; i++) {
            System.out.printf("%10s", nomEq[i]);
            for (int j = 0; j < tabla[i].length; j++) {

                System.out.printf("%5d", tabla[i][j]);

            }
            System.out.println(" ");
        }

    }
}   

