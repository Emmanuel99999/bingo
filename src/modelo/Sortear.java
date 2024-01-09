package modelo;
import java.util.Random;
public class Sortear {
	///llamar aleatoriamente los 75 números
	public static void main(String[] args) {
	}
	public static int[]sortear() {
	    // array vacío con los 75 espacios
		int[] piscinaNum=new int[75];
		//crea el array con un bucle
		for (int i = 0; i <piscinaNum.length; i++) {
		piscinaNum[i]=i+1;
		}
		//desordena el arreglo aleatoriamente
		Random random = new Random();
        for (int i = 0; i < piscinaNum.length; i++) {
            int j = random.nextInt(piscinaNum.length);
            int temp = piscinaNum[i];
            piscinaNum[i] = piscinaNum[j];
            piscinaNum[j] = temp;
            }
        //imprime  los 75 números ya randomizados, no sé repiten
		return piscinaNum;
		}
	//metodo que recorre toda la lista de números
	public static void llamar() {
		int[] lista= modelo.Sortear.sortear();
		for (int number : lista) {
		System.out.println("La cifra siguiente es: " + number);
			}
	}
}

		
		
        
		

