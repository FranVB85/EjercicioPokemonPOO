package logica;

public class Charmander extends Pokemon implements FuegoI {

	public Charmander() {
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Charmander y este en mi ataque placaje");
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola, soy Charmander y este en mi ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Charmander y este en mi ataque mordisco");
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("Hola, soy Charmander y este en mi ataque puño de fuego");
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("Hola, soy Charmander y este en mi ataque lanzallamas");
	}

	@Override
	public void atacarAscuas() {
		System.out.println("Hola, soy Charmander y este en mi ataque ascuas");
	}

}
