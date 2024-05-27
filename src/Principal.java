import java.util.Objects;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Menu menu = new Menu();
        MonedaTasa monedaTasa = new MonedaTasa();

        while (true) {
            menu.menuMostrar();

            try {
                int opcion = Integer.parseInt(lectura.nextLine());

                switch (opcion) {
                    case 1, 2, 3, 4, 5, 6 -> {
                        System.out.println("Ingresa el valor que deseas convertir: ");
                        double valor = Double.parseDouble(lectura.nextLine());

                        Conversion conversion = menu.conversionObtener(opcion, monedaTasa);
                        if (conversion != null) {
                            double resultado = conversion.convertir(valor);

                            //System.out.printf("Tipo de cambio: %s\n",MonedaFormato.formatear(conversion.tipoCambio()));
                            System.out.printf("La conversion final del valor %s [%s] corresponde al valor de %s [%s]\n",
                                    MonedaFormato.formatear(valor),
                                    conversion.monedaOrigen(),
                                    MonedaFormato.formatear(resultado),
                                    conversion.monedaDestino()  );
                        }
                    }
                    case 7 -> {
                        System.out.println("Programa Terminado");
                        return;
                    }
                    default -> System.out.println("Seleccione una opción válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: ingresa un valor numérico válido.");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}