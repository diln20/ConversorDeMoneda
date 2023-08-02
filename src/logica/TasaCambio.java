
package logica;

/**
 *
 * @author andre_hk4s7fk
 */
public enum TasaCambio {
    DE_PESOS_A_DOLAR(0.00026),        // 1 Peso Colombiano = 0.00026 Dólares
    DE_PESOS_A_EURO(0.00022),         // 1 Peso Colombiano = 0.00022 Euros
    DE_PESOS_A_LIBRAS(0.00019),       // 1 Peso Colombiano = 0.00019 Libras
    DE_PESOS_A_YEN(0.028),            // 1 Peso Colombiano = 0.028 Yenes Japoneses
    DE_PESOS_A_WON_COREANO(0.31),     // 1 Peso Colombiano = 0.31 Wones Coreanos
    DE_DOLAR_A_PESOS(3846.15),        // 1 Dólar = 3,846.15 Pesos Colombianos
    DE_EURO_A_PESOS(4554.55),         // 1 Euro = 4,554.55 Pesos Colombianos
    DE_LIBRAS_A_PESOS(5263.16),       // 1 Libra = 5,263.16 Pesos Colombianos
    DE_WON_COREANO_A_PESOS(3225.81);  // 1 Wón Coreano = 3,225.81 Pesos Colombianos

    private final double tipoCambio;

    private TasaCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }
}

