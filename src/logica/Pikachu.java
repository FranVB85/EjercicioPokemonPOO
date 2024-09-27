package logica;

public class Pikachu extends Pokemon implements ElectricoI {

	public Pikachu() {
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola, soy Pikachu y este en mi ataque placaje");
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola, soy Pikachu y este en mi ataque arañazo");
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola, soy Pikachu y este en mi ataque mordisco");
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("Hola, soy Pikachu y este en mi ataque impactrueno");
	}

	@Override
	public void atacarPuniotrueno() {
		System.out.println("Hola, soy Pikachu y este en mi ataque puñotrueno");
	}

}
