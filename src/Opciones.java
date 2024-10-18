import java.util.Arrays;

public class Opciones {

    private String[] opciones = {
            "Dolar ==> Peso Argentino", //USD - ARS
            "Peso Argentino ==> Dolar",//AUR
            "Real Brasileño ==> Dolar",//BRL
            "Dolar ==> Peso Colombiano",// USD
            "Peso Colombiano ==> Dolar",// COP
            "Salir"
    };

    public   String[] conversion = {
        "USD", "ARS","BRL","USD","COP"
    };

    @Override
    public String toString() {
        StringBuilder opcionesTexto = new StringBuilder();
        for (int i = 0; i < opciones.length; i++) {
            opcionesTexto.append((i + 1) + ". " + opciones[i] + "\n");
        }
        return opcionesTexto.toString();

    }


}
