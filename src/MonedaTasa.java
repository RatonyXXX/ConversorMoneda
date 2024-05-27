import java.util.Map;

public class MonedaTasa {

    private Map<String, Double> tasas;

    public MonedaTasa() {
        MonedaApi monedaApi = new MonedaApi();
        this.tasas = monedaApi.monedaApiObtener().conversion_rates();
    }

    public double monedaTasaObtener(String monedaOrigen, String monedaDestino) {
        Double tasaOrigen = tasas.get(monedaOrigen);
        Double tasaDestino = tasas.get(monedaDestino);

        if (tasaOrigen != null && tasaDestino != null) {
            return tasaDestino / tasaOrigen;
        } else {
            throw new RuntimeException("No se encontró el tipo de cambio para la conversión de " +
                    monedaOrigen + " a " + monedaDestino);
        }
    }

}
