package modelo;
public class Partida {
	private String username;
	private String password;
	private int[][] cartonJuego;
	private int victorias;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password; 
	}
	public int[][] getCartonJuego() {
		return cartonJuego;
	}
	public void setCartonJuego(int[][] cartonJuego) {
		this.cartonJuego = cartonJuego;
	}
	public int getVictorias() {
		return victorias;
	}
	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}

	

}
