package logica;

public class Squirtle extends Pokemon implements AguaI {

	public Squirtle() {
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Squirtle y este en mi ataque placaje");
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola, soy Squirtle y este en mi ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Squirtle y este en mi ataque mordisco");
	}

	@Override
	public void atacarHidrobomba() {
		System.out.println("Hola, soy Squirtle y este en mi ataque hidrobomba");
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("Hola, soy Squirtle y este en mi ataque burbuja");
	}

	@Override
	public void atacarPistolaAgua() {
		System.out.println("Hola, soy Squirtle y este en mi ataque pistola de agua");
	}

}
