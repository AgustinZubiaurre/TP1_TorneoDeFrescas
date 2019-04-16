import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BeberEspartanoImp implements Beber{

    public int beber(int toleranciaExtraEspartano) {

        int resultado=0;

        List<Integer> tirada = Arrays.asList((int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10),
                (int)(Math.random() * 10));

        Collections.sort(tirada);
        Collections.reverse(tirada);
        tirada = tirada.stream().limit(5+toleranciaExtraEspartano).collect(Collectors.toList());

        resultado = tirada.stream().mapToInt(Integer::intValue).sum();

        return resultado;
    }
}
