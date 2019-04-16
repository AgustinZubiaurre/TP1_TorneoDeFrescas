public class Espartano extends Humano{
    Integer ToleranciaExtra;

    public Espartano(String nombre, Integer edad, Integer peso, Beber iBeber, Orinar iOrinar, Integer toleranciaExtra) {
        super(nombre, edad, peso, iBeber, iOrinar);
        ToleranciaExtra = toleranciaExtra;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+" Tolerancia +"+this.ToleranciaExtra;
    }
}
