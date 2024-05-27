import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MonedaFormato {

    public static String formatear(double valor) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.getDefault());

        DecimalFormat formato = new DecimalFormat("#,##0.#####", simbolos);

        return formato.format(valor);
    }
}
