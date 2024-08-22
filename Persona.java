package co;

public class Persona {
    private byte edad = 67;
    public short anioDeNacimiento = 1980;
    public int dni = 30000000;
    public long coordenadaX = 453456L;
    public long coordenadaY = 3345455L;
    public float altura = 1.5F;
    public double patrimonioEnPesos = 128.45645645;
    public char sexo = 'M';
    public boolean estaVivo = true;

    public String nombre = "Marcos"; // new String("Marcos");

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public byte getEdad() {
        return edad;
    }

    public Persona(){}

    public Persona(byte edad) {
        this.edad = edad;
    }
}
