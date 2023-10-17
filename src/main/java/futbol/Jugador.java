package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;

	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public int compareTo(Futbolista f) {
		return Math.abs(this.getEdad() - f.getEdad());
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}
}
