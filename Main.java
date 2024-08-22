import co.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("Estoy trabajando con una instancia de la clase Persona");

        Persona marta = new Persona();

        /*System.out.println(marta.edad);
        System.out.println(marta.anioDeNacimiento);
        System.out.println(marta.dni);
        System.out.println(marta.coordenadaX);
        System.out.println(marta.coordenadaY);
        System.out.println(marta.altura);
        System.out.println(marta.patrimonioEnPesos);
        System.out.println(marta.sexo);
        System.out.println(marta.estaVivo);*/

        byte nuevaEdad = 12;

        Persona ramon = new Persona();
        ramon.setEdad(nuevaEdad);

        System.out.println(ramon.getEdad());

        Persona ana = new Persona((byte) 46);

        System.out.println(ana.getEdad());

    }
}
