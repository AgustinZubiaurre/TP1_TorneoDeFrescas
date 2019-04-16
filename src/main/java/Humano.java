public class Humano {
    String nombre;
    Integer edad;
    Integer peso;
    Beber iBeber;
    Orinar iOrinar;

    public Humano(String nombre, Integer edad, Integer peso, Beber iBeber, Orinar iOrinar) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.iBeber = iBeber;
        this.iOrinar = iOrinar;
    }

    public Humano() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return this.nombre+" Edad:"+this.edad+" Peso:"+this.peso;
    }
}


