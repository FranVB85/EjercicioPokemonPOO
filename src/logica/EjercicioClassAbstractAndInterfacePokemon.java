package logica;

public class EjercicioClassAbstractAndInterfacePokemon {

	public static void main(String[] args) {

		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasaur bulbasaur = new Bulbasaur();
		Pikachu pikachu = new Pikachu();

		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();
		System.out.println("---------------");
		charmander.atacarAraniazo();
		charmander.atacarLanzallamas();
		System.out.println("---------------");
		bulbasaur.atacarAraniazo();
		bulbasaur.atacarDrenaje();
		System.out.println("---------------");
		pikachu.atacarAraniazo();
		pikachu.atacarImpactrueno();

	}

}
