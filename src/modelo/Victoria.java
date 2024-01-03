package modelo;
public class Victoria {
	// se instancia un carton
	public static void main(String[] args) {
		//imprimirCarton();
		//verificar();
}
	public static int[][] imprimirCarton() {
	int[][] carton0= modelo.Carton.creaCarton();
	/*for (int i = 0; i < carton0.length; i++) {
        for (int j = 0; j < carton0[i].length; j++) {
            System.out.print(carton0[i][j] + "|");
        }
        System.out.println();
       }*/
	return carton0;     
    }
	public static String verificar() { 
	int[][] carton1=imprimirCarton();	// en las siguientes lineas se verifica si ganó el carton, cuando una casilla se llama 
	// la casilla equivaldrá a 0, por lo cual si el patrón de casillas suma 0 será un patrón ganador
	// en variables se describen las posibles combinaciones ganadoras
	//TODO añadir carton pleno como condición de victoria
	int esquinas=carton1[0][0]+carton1[0][4]+carton1[4][0]+carton1[4][4];
	int diagonalIzq=carton1[0][0]+carton1[1][1]+carton1[2][2]+carton1[3][3]+carton1[4][4];
	int diagonalDer=carton1[0][4]+carton1[1][3]+carton1[2][2]+carton1[3][1]+carton1[4][0];
	int vertical=1;
	int horizontal=1;
	//suma todas las horizontales del bingo hasta encontrar una que sume 0 
	for(int i=0; i < 5; i++) {
		if(horizontal>0) {
		horizontal=0;
		//System.out.println("--------------------");
		for (int j = 0; j < carton1[i].length; j++) {
		horizontal+=carton1[i][j];
		} //System.out.println(horizontal);
	}  }
	//suma todas las verticales del bingo hasta encontrar una que sume 0
	for(int j=0; j < 5; j++) {
		if(vertical>0) {
		vertical=0; 
		//System.out.println("**********");
		for (int i = 0; i < carton1[j].length; i++) {
		vertical+=carton1[i][j];
		} //System.out.println(vertical);
	}  }
	//condicionales para encontrar el juego ganador
	// TODO se puede mejorar con un switch?
	if (esquinas==0) {
	return "gana por esquinas";
	}
	else if (diagonalIzq==0){
	return "gana por diagonal izquierda";
	}
	else if (diagonalDer==0) {
		return"gana por diagonal derecha";
	}
	else if(vertical==0) { 
		return"gana por vertical";
	}
	else if(horizontal==0) { 
		return"gana por horizontal";
	}
	else {
		return"no hay combinación ganadora";
	}
	
}}