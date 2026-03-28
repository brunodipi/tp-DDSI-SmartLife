package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; // Importante importar la anotación


class FacturaMensualTest {
    @Test
    @DisplayName("Hogar con tarifa base de 1810 debe pagar $1810")
    public void obtenerFacturaHogar(){
        Hogar hogar = new Hogar();
        hogar.setTarifaBase(1810);

        Cliente cliente = new Cliente();
        cliente.setPlan(hogar);
        FacturaMensual facturaHogar = new FacturaMensual();
        facturaHogar.setCliente(cliente);

        Assertions.assertEquals(1810, facturaHogar.calcularMonto());
    }

    @Test
    @DisplayName("Un comercio con 2 dispositivos, un adicional de 1000 y una base de 20000 debe pagar $22000")
    public void obtenerFacturaSaraINC(){
        Comercio comercio = new Comercio();
        comercio.setTarifaBase(20000);
        comercio.setAdicionalDispotivosConectados(1000);

        Cliente saraINC = new Cliente();
        saraINC.setCantDispositivos(2);
        saraINC.setPlan(comercio);
        FacturaMensual facturaComercio = new FacturaMensual();
        facturaComercio.setCliente(saraINC);

        Assertions.assertEquals(22000, facturaComercio.calcularMonto());
    }


    @Test
    @DisplayName("Un corporativo con base 10000 y descuento de 50% debe pagar $5000")
    public void obtenerFacturaLauti(){
        Corporativo corporativo = new Corporativo();
        corporativo.tarifaBase = 10000;
        corporativo.setDescuentoPorcentual(50);

        Cliente cliente = new Cliente();
        cliente.setPlan(corporativo);

        FacturaMensual facturaCorporativo = new FacturaMensual();
        facturaCorporativo.setCliente(cliente);

        Assertions.assertEquals(5000, facturaCorporativo.calcularMonto());
    }

}