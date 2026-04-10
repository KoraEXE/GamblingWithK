package modelo;

import java.time.LocalDate;

public class User {
	private String dni;
	private String name;
	private String password;
	private double balance;
	private LocalDate date_of_birth;
	private int vecesJugadas;
	private int vecesGanadas;
	private int vecesPerdidas;
	private int maxCombo;
	private int total21s;
	private double totalPerdido;
	private double totalGanado;	
	
	public User(String dni, String name, String password, double balance, LocalDate date_of_birth) {
		this.dni = dni;
		this.name = name;
		this.password = password;
		this.balance = balance;
		this.date_of_birth = date_of_birth;
	}
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public User(String dni, String name, String password) {
		this.dni = dni;
		this.name = name;
		this.password = password;
	}
	
	public User(String dni) {
		this.dni = dni;
	}
	
	public User() {
	}
	
	public int getVecesJugadas() {
		return vecesJugadas;
	}

	public void setVecesJugadas(int vecesJugadas) {
		this.vecesJugadas = vecesJugadas;
	}

	public int getVecesGanadas() {
		return vecesGanadas;
	}

	public void setVecesGanadas(int vecesGanadas) {
		this.vecesGanadas = vecesGanadas;
	}

	public int getVecesPerdidas() {
		return vecesPerdidas;
	}

	public void setVecesPerdidas(int vecesPerdidas) {
		this.vecesPerdidas = vecesPerdidas;
	}

	public int getMaxCombo() {
		return maxCombo;
	}

	public void setMaxCombo(int maxCombo) {
		this.maxCombo = maxCombo;
	}

	public int getTotal21s() {
		return total21s;
	}

	public void setTotal21s(int total21s) {
		this.total21s = total21s;
	}

	public double getTotalPerdido() {
		return totalPerdido;
	}

	public void setTotalPerdido(double totalPerdido) {
		this.totalPerdido = totalPerdido;
	}

	public double getTotalGanado() {
		return totalGanado;
	}

	public void setTotalGanado(double totalGanado) {
		this.totalGanado = totalGanado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "User [dni=" + dni + ", name=" + name + ", password=" + password + ", balance=" + balance
				+ ", date_of_birth=" + date_of_birth + ", vecesJugadas=" + vecesJugadas + ", vecesGanadas="
				+ vecesGanadas + ", vecesPerdidas=" + vecesPerdidas + ", maxCombo=" + maxCombo + ", total21s="
				+ total21s + ", totalPerdido=" + totalPerdido + ", totalGanado=" + totalGanado + "]";
	}
}
