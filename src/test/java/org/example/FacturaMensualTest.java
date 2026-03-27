package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; // Importante importar la anotación
import static org.junit.jupiter.api.Assertions.*;

class FacturaMensualTest {
    @Test
    @DisplayName("Cacho debe pagar $1810")
    public void obtenerFacturaCacho(){
        Plan hogar = new Plan(){
            public double calcularMonto(Cliente cliente){
                return tarifaBase;
            }
        };
        hogar.tarifaBase = 1810;

        Cliente cacho = new Cliente();
        cacho.setPlan(hogar);
        FacturaMensual facturaCacho = new FacturaMensual();
        facturaCacho.setCliente(cacho);

        Assertions.assertEquals(1810, facturaCacho.calcularMonto());
    }


    @Test
    @DisplayName("SaraINC debe pagar $22000")
    public void obtenerFacturaSaraINC(){
        Plan comercio = new Plan(){
            public double calcularMonto(Cliente cliente){
                return tarifaBase+cliente.getDispositivos()*adicionalDispotivosConectados;
            }
        };
        comercio.tarifaBase = 20000;

        Cliente saraINC = new Cliente();
        saraINC.setCantDispositivos(4);
        saraINC.setPlan(comercio);
        FacturaMensual facturaSaraINC = new FacturaMensual();
        facturaSaraINC.setCliente(saraINC);

        Assertions.assertEquals(22000, facturaSaraINC.calcularMonto());
    }


    @Test
    @DisplayName("Lauti debe pagar $850")
    public void obtenerFacturaLauti(){
        Plan corporativo = new Plan(){
            public double calcularMonto(Cliente cliente){
                return cliente.getTarifa()*descuentoPorcentual;
            }
        };


        Cliente lauti = new Cliente();
        lauti.setTarifa(1000);
        lauti.setPlan(corporativo);
        FacturaMensual facturaLauti = new FacturaMensual();
        facturaLauti.setCliente(lauti);

        Assertions.assertEquals(850, facturaLauti.calcularMonto());
    }
}