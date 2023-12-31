package modelo;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
public class Carton {
	public static void main(String[] args) {
		int[][] carton = new int[5][5];
		Set<Integer> usedNumbers = new HashSet<>();
		for (int i = 0; i < carton.length; i++) {
			//genera número aleatorio para cada casilla según su rango, con el hashset verificamos si el número ya se usó, si se usó bajamos el contador para intentar de nuevo
		
            for (int j = 0; j < carton[i].length; j++) {
            	Random aleatorio = new Random();
            	int numero1_15 =aleatorio.nextInt(15)+1;
            	int numeroBase = (15*j)+numero1_15;
            	if(!usedNumbers.contains(numeroBase)) {
            	carton[i][j] = numeroBase;
            	usedNumbers.add(numeroBase);
            	}
            	else {
            		j--;
            	}
              }   
            }
            //deja el centro free como todos los cartones de Bingo 0=free
            carton[2][2]=00;
        
		// Imprime el array para verificar info
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                System.out.print(carton[i][j] + "|");
            }
            System.out.println();
        }
	}
}
