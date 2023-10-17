package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;

	public Portero() {
		super();
		this.golesRecibidos = 0;
		this.dorsal = 8;
	}

	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	public int compareTo(Portero p) {
		return Math.abs(this.getGolesRecibidos() - p.getGolesRecibidos());
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
}
