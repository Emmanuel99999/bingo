package modelo;
import java.util.Random;
public class Llamado {
	///llamar aleatoriamente los 75 números
	public static void main(String[] args) {
	    // array vacío con los 75 espacios
		int[] numPool=new int[75];
		//crea el array con un bucle
		for (int i = 0; i <numPool.length; i++) {
		numPool[i]=i+1;
		}
		//desordena el arreglo aleatoriamente
		Random random = new Random();
        for (int i = 0; i < numPool.length; i++) {
            int j = random.nextInt(numPool.length);
            int temp = numPool[i];
            numPool[i] = numPool[j];
            numPool[j] = temp;
        }
        //imprime  los 75 números ya randomizados, no sé repiten
        for (int number : numPool) {
            System.out.println("La cifra siguiente es: "+number);
        }
		}
		}

		
		
        
		

