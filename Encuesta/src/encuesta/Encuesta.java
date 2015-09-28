/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuesta;

/**
 *
 * @author Marcos
 */
public class Encuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = (int) Math.floor(Math.random()*400+100);
		int apruebamen=0, apruebawoman=0, desapruebawoman=0;
		
		char [][] matrix = new char[2][N]; 
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				int random = (int) Math.floor(Math.random()*3);
				char voto=' ';
				if (random>=0 && random<1 ){
					voto = '0';
					if (i==1) {
						desapruebawoman++;
					}
				}
				if (random>=1 && random<2 ){
					voto = '1';
					if (i==0) {
						apruebamen++;
					}
					if (i==1) {
						apruebawoman++;
					}
				}
				if (random>=2 && random<=3 ){
					voto = 'n';
				}
				matrix[i][j] = voto;
			}
		
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j]+"|");
				if (j==N-1){
					System.out.println("");}
			}
		}
		float porc = (float) (apruebawoman+apruebamen)/N;
		int purc = (int) (porc*100);
		System.out.println("La cantidad de hombres que aprueban la gestion del gobierno es : " + apruebamen);
		System.out.println("La cantidad de mujeres que desaprueban la gestion del gobierno es : " + desapruebawoman);
		System.out.println("El porcentaje de personas que aprueban la gestion del gobierno es : " + (purc) + "%");
		System.out.println("La cantidad total de encuestados es:  " + 2*N);

	}

    }
    

