import com.alura.calculo.Consulta;
import com.alura.calculo.Operaciones;
import com.alura.modelos.CambioDivisa;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        boolean bandera = true;
        Scanner lectura = new Scanner(System.in);
        Consulta consulta = new Consulta();
        Operaciones operacion = new Operaciones();
        while (bandera){
            operacion.menus();
            String opcion = lectura.nextLine();
            switch(opcion) {
                case "1":
                    operacion.conversion("USD","ARS",consulta);
                    break;
                case "2":
                    operacion.conversion("ARS","USD",consulta);
                    break;
                case "3":
                    operacion.conversion("USD","BRL",consulta);
                    break;
                case "4":
                    operacion.conversion("BRL","USD",consulta);
                    break;
                case "5":
                    operacion.conversion("USD","COP",consulta);
                    break;
                case "6":
                    operacion.conversion("COP","USD",consulta);
                    break;
                case "7":
                    System.out.println("Gracias por usar nuestros servicios.");
                    System.out.println("¡Regrese pronto! \uD83E\uDD1D\uD83C\uDFFC");
                    bandera = false;
                    break;
                default:
                    // code block
            }
        }









        // Imprimir para verificar los valores
        //System.out.println("Result: " + cambioDivisa.getResult());
        //System.out.println("Base Code: " + cambioDivisa.getBase_code());
        //System.out.println("Target Code: " + cambioDivisa.getTarget_code());
        //System.out.println("Conversion Rate: " + cambioDivisa.getConversion_rate());
    }
}