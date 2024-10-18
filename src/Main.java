import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONObject;

public class Main {

    public static  void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();


        while (true){
            Opciones opciones = new Opciones();
            System.out.println("Bienvenido al conversor de Divisas\n" +
                    opciones.toString()+
                    "\nElija una opción válida");


            int option = Integer.valueOf(lectura.nextInt());
            if (option == 6){
                System.out.println("Saliendo de la aplicación, muchas gracias");
                break;
            }


            Divisa miDivisa = new Divisa("","");

            switch (option){
                case 1:
                    miDivisa = new Divisa("USD", "ARS");
                    break;
                case 2:
                    miDivisa = new Divisa("ARS", "USD");

                case 3:
                    miDivisa = new Divisa("BRL", "USD");
                case 4:
                    miDivisa = new Divisa("USD", "COP");
                case 5:
                    miDivisa = new Divisa("COP", "USD");

                default:
                    System.out.println("");

            }

            System.out.println("Digita la cantidad de " + miDivisa.getDivisaUno() + " a convertir");
            double cantidadDeDivisaUno = lectura.nextDouble();

            //Zona de la API
            String url_str = "https://v6.exchangerate-api.com/v6/b0284075bbae78daa25aff7d/pair/"+ miDivisa.getDivisaUno() +  "/"+ miDivisa.getDivisaDos() + "/"+cantidadDeDivisaUno;



            //el cliente
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder() //solicitud
                    .uri(URI.create(url_str))
                    .build();

            HttpResponse<String> response = client //respuesta
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String jsonString  = response.body();
            //System.out.println(jsonString);

            JSONObject jsonObject = new JSONObject(jsonString);
            double conversionResult = jsonObject.getDouble("conversion_result");
            System.out.println("El resultado de la conversión es: " + conversionResult + " " + miDivisa.getDivisaDos() );

        }





    }




    }