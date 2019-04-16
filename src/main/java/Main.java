import java.util.*;
import java.sql.*;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //DNI Impar ordenar por peso y retirar al primero

        List<Humano> Vikingos = Arrays.asList(
                new Vikingo("Ragnar", 45, 86, new BeberVikingoImp(), new OrinarVikingoImp(), (int) (Math.random() * 10)+1),
                new Vikingo("Lagertha", 40, 65, new BeberVikingoImp(), new OrinarVikingoImp(), (int) (Math.random() * 10)+1),
                new Vikingo("Floki", 42, 75, new BeberVikingoImp(), new OrinarVikingoImp(), (int) (Math.random() * 10)+1),
                new Vikingo("Rollo", 45, 90, new BeberVikingoImp(), new OrinarVikingoImp(), (int) (Math.random() * 10)+1),
                new Vikingo("Bjorn", 25, 80, new BeberVikingoImp(), new OrinarVikingoImp(), (int) (Math.random() * 10)+1),
                new Vikingo("Ivar", 20, 70, new BeberVikingoImp(), new OrinarVikingoImp(), (int) (Math.random() * 10)+1),
                new Vikingo("Ubbe", 18, 75, new BeberVikingoImp(), new OrinarVikingoImp(), (int) (Math.random() * 10)+1));

        List<Humano> Espartanos = Arrays.asList(
                new Espartano("Miles", 33, 86, new BeberEspartanoImp(), new OrinarEspartanoImp(), (int) (Math.random() * 10)+1),
                new Espartano("Eurotas", 46, 65, new BeberEspartanoImp(), new OrinarEspartanoImp(), (int) (Math.random() * 10)+1),
                new Espartano("Lacedemón", 60, 75, new BeberEspartanoImp(), new OrinarEspartanoImp(), (int) (Math.random() * 10)+1),
                new Espartano("Amiclas", 25, 90, new BeberEspartanoImp(), new OrinarEspartanoImp(), (int) (Math.random() * 10)+1),
                new Espartano("Ébalo,", 18, 80, new BeberEspartanoImp(), new OrinarEspartanoImp(), (int) (Math.random() * 10)+1),
                new Espartano("Menelao", 55, 70, new BeberEspartanoImp(), new OrinarEspartanoImp(), (int) (Math.random() * 10)+1),
                new Espartano("Orestes,", 23, 75, new BeberEspartanoImp(), new OrinarEspartanoImp(), (int) (Math.random() * 10)+1));

        System.out.println("Presentando a los vikingos: \n" + Vikingos);
        System.out.println("Presentando a los espartanos: \n" + Espartanos);

        List<Humano> vikingosOrdenadosPorPeso = (Vikingos.stream()
                .sorted(Comparator.comparing(Humano::getPeso).reversed())
                .collect(Collectors.toList()));

        List<Humano> espartanosOrdenadosPorPeso = (Espartanos.stream()
                .sorted(Comparator.comparing(Humano::getPeso).reversed())
                .collect(Collectors.toList()));

        Humano vikingoMasPesado = vikingosOrdenadosPorPeso.stream().findFirst().get();
        Humano espartanoMasPesado = espartanosOrdenadosPorPeso.stream().findFirst().get();

        System.out.println("\nPresentando a los competidores: \n" + vikingoMasPesado +" versus "+ espartanoMasPesado);


        int tomadaEspartano = ((Espartano)espartanoMasPesado).iBeber.beber(((Espartano) espartanoMasPesado).ToleranciaExtra);
        System.out.println("\n"+espartanoMasPesado.getNombre()+" bebió  "+tomadaEspartano +" cervezas");

        int tomadaVikingo = ((Vikingo)vikingoMasPesado).iBeber.beber(((Vikingo) vikingoMasPesado).BebedorProfesional);
        System.out.println("\n"+vikingoMasPesado.getNombre()+" bebió  "+tomadaVikingo + " cervezas");

        int restaEspartano = ((Espartano)espartanoMasPesado).iOrinar.orinar(((Espartano) espartanoMasPesado).ToleranciaExtra);
        System.out.println("\n"+espartanoMasPesado.getNombre()+" no aguanto mas y orinó  "+restaEspartano + " cervezas");

        int restaVikingo = ((Vikingo)vikingoMasPesado).iOrinar.orinar(((Vikingo) vikingoMasPesado).BebedorProfesional);
        System.out.println("\n"+vikingoMasPesado.getNombre()+" no aguanto mas y orinó  "+restaVikingo + " cervezas");



        int tiradaEspartano = tomadaEspartano - restaEspartano;
        int tiradaVikingo = tomadaVikingo - restaVikingo;


        System.out.println("\n"+vikingoMasPesado.getNombre()+" en total tomo  "+tiradaEspartano + " cervezas");
        System.out.println("\n"+espartanoMasPesado.getNombre()+" en total tomo  "+tiradaVikingo + " cervezas");


        Humano ganador;

        if(tiradaEspartano>=tiradaVikingo)
        {
             ganador = espartanoMasPesado;
        }
        else
            {
                 ganador = vikingoMasPesado;
            }

        System.out.println("\n El ganador del torneo es "+ ganador.nombre);

        Humano duenioTaberna = new Humano("Germanus Maxius,", 40, 75, new BeberVikingoImp(), new OrinarEspartanoImp());

        System.out.println("\nPresentando a los competidores: \n" + ganador +" versus "+ duenioTaberna);


        int tomadaDuenio = (duenioTaberna.iBeber.beber(1));
        System.out.println("\n"+duenioTaberna.getNombre()+" bebió  "+tomadaDuenio +" cervezas");

        int tomadaCampeon = (ganador.iBeber.beber(1));
        System.out.println("\n"+ganador.getNombre()+" bebió  "+tomadaCampeon + " cervezas");

        int restaDueño = (duenioTaberna.iOrinar.orinar(1));
        System.out.println("\n"+duenioTaberna.getNombre()+" no aguanto mas y orinó  "+restaDueño + " cervezas");

        int restaCampeon = (ganador.iOrinar.orinar(1));
        System.out.println("\n"+ganador.getNombre()+" no aguanto mas y orinó  "+restaCampeon + " cervezas");



        int tiradaDuenio = tomadaDuenio - restaDueño;
        int tiradaCampeon = tomadaCampeon - restaCampeon;


        System.out.println("\n"+duenioTaberna.getNombre()+" en total tomo  "+tiradaDuenio + " cervezas");
        System.out.println("\n"+ganador.getNombre()+" en total tomo  "+tiradaCampeon + " cervezas");

        Humano ganadorMundial;
        int cantidadGanadora;

        if(tiradaDuenio>=tiradaCampeon)
        {
            ganadorMundial=duenioTaberna;
            cantidadGanadora=tiradaDuenio;
        }
        else
        {
            ganadorMundial = ganador;
            cantidadGanadora=tiradaCampeon;

        }

        System.out.println("\n El ganador indiscutido del mundo es "+ ganadorMundial.nombre);

        JDBC BDD = new JDBC();
        BDD.guardarGanador (ganadorMundial,cantidadGanadora);

    }
}