public class OrinarEspartanoImp implements Orinar{

    public int orinar(int ToleranciaExtra) {

        int resultado=0;

        resultado = (int)(Math.random() * 10) * ToleranciaExtra;

        return resultado;
    }
}
