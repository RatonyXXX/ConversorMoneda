public record Conversion(String monedaOrigen, String monedaDestino, double tipoCambio) {

    public double convertir(double valor) {

        if (tipoCambio <= 0) {
            throw new RuntimeException("El tipo de cambio debe ser un valor positivo.");
        }

        return valor * tipoCambio;
        /*
        if (monedaOrigen.equals("USD")) {
            return valor * tipoCambio;
        } else {
            return valor / tipoCambio;
        }
        */
    }
}
