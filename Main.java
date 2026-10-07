public class Main {
    public static void main(String[] args) {

        // ===== ND1.1 PRODUCTOS =====
        System.out.println("===== ND1.1 PRODUCTOS =====");
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        producto1.nombre = "Audífonos Bluetooth";
        producto1.precio = 32.50;
        producto1.categoria = "Tecnología";
        producto1.disponible = true;

        producto2.nombre = "Mouse Gamer";
        producto2.precio = 18.99;
        producto2.categoria = "Accesorios";
        producto2.disponible = true;

        producto3.nombre = "Teclado Mecánico";
        producto3.precio = 45.00;
        producto3.categoria = "Accesorios";
        producto3.disponible = true;

        producto1.mostrarInformacion();
        producto1.cambiarDisponibilidad(false);
        producto1.mostrarDisponibilidad();
        producto1.mostrarPrecio();
        System.out.println("--- Los otros productos no cambian ---");
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();

        // ===== ND1.2 CAMPAÑAS =====
        System.out.println("\n===== ND1.2 CAMPAÑAS =====");
        Campania c1 = new Campania();
        c1.nombre = "Promo Verano";
        c1.presupuesto = 500;
        c1.plataforma = "Instagram";

        Campania c2 = new Campania();
        c2.nombre = "Reto Viral";
        c2.presupuesto = 300;
        c2.plataforma = "TikTok";

        Campania c3 = new Campania();
        c3.nombre = "Ofertas Hogar";
        c3.presupuesto = 400;
        c3.plataforma = "Facebook";

        c1.activar();
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();
        c2.mostrarPresupuesto();
        c3.desactivar();

        // ===== ND1.3 CUPONES =====
        System.out.println("\n===== ND1.3 CUPONES =====");
        Cupon cupon1 = new Cupon();
        cupon1.codigo = "VERANO20";
        cupon1.porcentajeDescuento = 20;
        cupon1.descripcion = "Descuento de verano";
        cupon1.activo = true;

        Cupon cupon2 = new Cupon();
        cupon2.codigo = "ENVIOGRATIS";
        cupon2.porcentajeDescuento = 10;
        cupon2.descripcion = "Descuento en envíos";
        cupon2.activo = false;

        Cupon cupon3 = new Cupon();
        cupon3.codigo = "BLACK50";
        cupon3.porcentajeDescuento = 50;
        cupon3.descripcion = "Black Friday";
        cupon3.activo = true;

        cupon1.mostrarInformacion();
        cupon1.mostrarResumen();
        cupon2.activar();
        cupon2.mostrarResumen();
        cupon3.desactivar();
        cupon3.mostrarDescuento();
    }
}
