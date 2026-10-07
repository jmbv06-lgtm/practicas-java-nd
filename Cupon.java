public class Cupon {
    public String codigo;
    public double porcentajeDescuento;
    String descripcion;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Descuento: " + porcentajeDescuento + "%");
        System.out.println("Descripción: " + descripcion);
        System.out.println("Activo: " + activo);
    }

    public void activar() {
        activo = true;
    }

    void desactivar() {
        activo = false;
    }

    void mostrarDescuento() {
        System.out.println("Descuento: " + porcentajeDescuento + "%");
    }

    // Desafío
    void mostrarResumen() {
        System.out.println("Cupón " + codigo + " - Descuento " + (int) porcentajeDescuento + "%");
    }
}
