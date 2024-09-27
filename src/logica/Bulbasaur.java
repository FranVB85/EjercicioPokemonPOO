package logica;

public class Bulbasaur extends Pokemon implements PlantaI {

	public Bulbasaur() {
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Bulbasaur y este en mi ataque placaje");
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola, soy Bulbasaur y este en mi ataque arazaño");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Bulbasaur y este en mi ataque mordisco");
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("Hola, soy Bulbasaur y este en mi ataque drenaje");
	}

	@Override
	public void atacarParalizar() {
		System.out.println("Hola, soy Bulbasaur y este en mi ataque paralizar");
	}

}
