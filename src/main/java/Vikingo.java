public class Vikingo extends Humano{
    Integer BebedorProfesional;

    public Vikingo(String nombre, Integer edad, Integer peso, Beber iBeber, Orinar iOrinar, Integer bebedorProfesional) {
        super(nombre, edad, peso, iBeber, iOrinar);
        BebedorProfesional = bebedorProfesional;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+" Bebedor +"+this.BebedorProfesional;
    }
}
