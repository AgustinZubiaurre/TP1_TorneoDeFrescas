import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BeberVikingoImp implements Beber {

    public int beber(int BebedorProfesionalVikingo) {

        int resultado=0;

        List<Integer> tirada = Arrays.asList((int)(Math.random() * 10)+BebedorProfesionalVikingo,
                (int)(Math.random() * 10)+BebedorProfesionalVikingo,
                (int)(Math.random() * 10)+BebedorProfesionalVikingo,
                (int)(Math.random() * 10)+BebedorProfesionalVikingo,
                (int)(Math.random() * 10)+BebedorProfesionalVikingo,
                (int)(Math.random() * 10)+BebedorProfesionalVikingo);

        resultado = tirada.stream().mapToInt(Integer::intValue).sum();

        return resultado;
    }
}
