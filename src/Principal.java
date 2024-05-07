import com.google.gson.JsonSyntaxException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcionElegida = 0;

        // Esta instancia se utilizará para realizar consultas de conversiones de moneda.
        ConsultaConversion consulta = new ConsultaConversion();
        /* La razón de pasarle como parámetro una instancia de 'ConsultaConversion' al constructor de 'Calculos' es porque la clase
        'Calculos' necesita tener acceso a una instancia de ConsultaConversion para poder realizar las conversiones de moneda. */
        Calculos calculos = new Calculos(consulta);
        GeneradorDeArchivos generador = new GeneradorDeArchivos();

        List<String> respuestas = new ArrayList<>();

        String menu = """
                \n***************************************************
                *** Sea bienvenido al Conversor de Monedas ***
                
                1) Peso Mexicano ==>> Dólar Estadounidense
                2) Peso Mexicano ==>> Euro
                3) Peso Mexicano ==>> Libra Esterlina
                4) Dólar Estadounidense ==>> Peso Mexicano
                5) Euro ==>> Peso Mexicano
                6) Libra Esterlina ==>> Peso Mexicano
                
                7) Otra opción de conversión
                
                8) Salir
                ***************************************************
                """;

        while (opcionElegida != 8) {
            try {
                System.out.println(menu);
                opcionElegida = Integer.parseInt(lectura.nextLine());

                // Obtener la marca de tiempo actual
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcionElegida) {
                    case 1:
                        calculos.almacenarValores("MXN", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 2:
                        calculos.almacenarValores("MXN", "EUR");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 3:
                        calculos.almacenarValores("MXN", "GBP");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 4:
                        calculos.almacenarValores("USD", "MXN");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 5:
                        calculos.almacenarValores("EUR", "MXN");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 6:
                        calculos.almacenarValores("GBP", "MXN");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 7:
                        calculos.almacenarValoresPersonalizados();
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Ingrese una opción válida");
                }
            } catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error. Ingrese solo códigos de moneda válidos.");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");
            }
        }
        generador.guardarJson(respuestas);

        System.out.println("Finalizando programa");
    }
}