public class Menu {

    public void menuMostrar() {
        System.out.println("**************************************");
        System.out.println("Programa para conversión de Moneda");
        System.out.println();
        System.out.println("1) Dólar => Peso Mexicano");
        System.out.println("2) Peso Mexicano => Dólar");
        System.out.println("3) Dólar => Peso Colombiano");
        System.out.println("4) Peso Colombiano => Dólar");
        System.out.println("5) Dólar => Real Brasileño");
        System.out.println("6) Real Brasileño => Dólar");
        System.out.println("7) Salir");
        System.out.println("Seleccione una opción: ");
        System.out.println("**************************************");
    }

    public Conversion conversionObtener(int opcion, MonedaTasa monedaTasa) {
        switch (opcion) {
            case 1 -> {
                double tipoCambio = monedaTasa.monedaTasaObtener("USD", "MXN");
                return new Conversion("USD", "MXN", tipoCambio);
            }
            case 2 -> {
                double tipoCambio = monedaTasa.monedaTasaObtener("MXN", "USD");
                return new Conversion("MXN", "USD", tipoCambio);
            }
            case 3 -> {
                double tipoCambio = monedaTasa.monedaTasaObtener("USD", "COP");
                return new Conversion("USD", "COP", tipoCambio);
            }
            case 4 -> {
                double tipoCambio = monedaTasa.monedaTasaObtener("COP", "USD");
                return new Conversion("COP", "USD", tipoCambio);
            }
            case 5 -> {
                double tipoCambio = monedaTasa.monedaTasaObtener("USD", "BRL");
                return new Conversion("USD", "BRL", tipoCambio);
            }
            case 6 -> {
                double tipoCambio = monedaTasa.monedaTasaObtener("BRL", "USD");
                return new Conversion("BRL", "USD", tipoCambio);
            }
            default -> {
                return null;
            }
        }

    }
}

