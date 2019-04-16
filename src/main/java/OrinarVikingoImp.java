import java.util.Arrays;
import java.util.List;

public class OrinarVikingoImp implements Orinar {

    public int orinar(int BebedorProfesionalVikingo) {

        int resultado=0;

        Integer tirada = (int)(Math.random() * 10)+BebedorProfesionalVikingo;

        resultado = tirada;

        return resultado;
    }
}
