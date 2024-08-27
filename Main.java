import co.Persona;

public class Main {
    public static void main(String[] args) {
         /*System.out.println("Estoy trabajando con una instancia de la clase Persona");

        Persona marta = new Persona();

        System.out.println(marta.edad);
        System.out.println(marta.anioDeNacimiento);
        System.out.println(marta.dni);
        System.out.println(marta.coordenadaX);
        System.out.println(marta.coordenadaY);
        System.out.println(marta.altura);
        System.out.println(marta.patrimonioEnPesos);
        System.out.println(marta.sexo);
        System.out.println(marta.estaVivo);*/

        /*byte nuevaEdad = 12;

        Persona ramon = new Persona();
        ramon.setEdad(nuevaEdad);

        System.out.println(ramon.getEdad());

        Persona ana = new Persona((byte) 46);

        System.out.println(ana.getEdad());*/

        int t = 4;
        int a = (56 + 67) / 5 + 56 % 4 / 2 * 23 + 1 + t++; // los parentesis le dan mayor precedencia a la suma en este caso
        boolean f = true && !false && true ; // true && true && true
        boolean i = true && 4 + 7 > 6 - 7 == false || false;
        // true && 11 > -1 == false || false
        // true && true == false || false
        // true && false || false
        // false || false
        // false

        String respuesta = (true && 4 + 7 > 6 - 7 == false || false) ? "A" : "B" ;

        System.out.println(respuesta);

        int r = 1;

        /*int y = ++r; // pre incrementar y=2
        System.out.println("valor de y " + y);
        int u = r++; // post incremental u=2
        System.out.println("valor de u " + u);
        // r = 3
        System.out.println("valor de r " + r);*/

        /*int e = 5;
        int j = --e; // 4
        System.out.println(j);
        int w = j--; // 4
        System.out.println(w);
        // j = 3
        System.out.println(j);*/

        /*int x = 45;
        x = -x;
        System.out.println(-x);
        System.out.println(x);*/

        //boolean s = true; // por default false
        //System.out.println(!s);

        int l = 4, k = 7, m = 8;

    }
}
