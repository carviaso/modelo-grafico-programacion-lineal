package Colas;

import Colas.Factory.*;
import Colas.Factory.Factories;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author edugonch
 */
public class Fact {

    public Colas.Factory.BaseController getFactory(Factories Type) {
        if (Type == Factories.CAMINO_PRINCIPAL) {
           return (new CaminoPrincipalFactory().createController());
           
          //VENDEDORES
        } else if (Type == Factories.CAMINO_HACIA_VENDEDORES) {
           return (new CaminoHaciaVendedoresFactory().createController());
        } else if (Type == Factories.CAMINO_HACIA_VENDEDORES1) {
           return (new CaminoHaciaVendedor1Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_VENDEDORES2) {
           return (new CaminoHaciaVendedor2Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_VENDEDORES3) {
           return (new CaminoHaciaVendedor3Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_VENDEDORES4) {
           return (new CaminoHaciaVendedor4Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_VENDEDORES5) {
           return (new CaminoHaciaVendedor5Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_VENDEDORES6) {
           return (new CaminoHaciaVendedor6Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_VENDEDORES1) {
           return (new CaminoDesdeVendedor1Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_VENDEDORES2) {
           return (new CaminoDesdeVendedor2Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_VENDEDORES3) {
           return (new CaminoDesdeVendedor3Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_VENDEDORES4) {
           return (new CaminoDesdeVendedor4Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_VENDEDORES5) {
           return (new CaminoDesdeVendedor5Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_VENDEDORES6) {
           return (new CaminoDesdeVendedor6Factory().createController());
            // ------------
            // CAJAS
        } else if (Type == Factories.CAMINO_HACIA_CAJAS) {
           return (new CaminoHaciaCajasFactory().createController());
        } else if (Type == Factories.CAMINO_HACIA_CAJAS1) {
           return (new CaminoHaciaCajas1Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_CAJAS2) {
           return (new CaminoHaciaCajas2Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_CAJAS3) {
           return (new CaminoHaciaCajas3Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_CAJAS4) {
           return (new CaminoHaciaCajas4Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_CAJAS5) {
           return (new CaminoHaciaCajas5Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_CAJAS6) {
           return (new CaminoHaciaCajas6Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_CAJAS1) {
           return (new CaminoDesdeCajas1Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_CAJAS2) {
           return (new CaminoDesdeCajas2Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_CAJAS3) {
           return (new CaminoDesdeCajas3Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_CAJAS4) {
           return (new CaminoDesdeCajas4Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_CAJAS5) {
           return (new CaminoDesdeCajas5Factory().createController());
        } else if (Type == Factories.CAMINO_DESDE_CAJAS6) {
           return (new CaminoDesdeCajas6Factory().createController());
            // -------------
            // BODEGUEROS
        } else if (Type == Factories.CAMINO_HACIA_BODEGUEROS) {
           return (new CaminoHaciaBodeguerosFactory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGUEROS1) {
           return (new CaminoHaciaBodegueros1Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGUEROS2) {
           return (new CaminoHaciaBodegueros2Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGUEROS3) {
           return (new CaminoHaciaBodegueros3Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGUEROS4) {
           return (new CaminoHaciaBodegueros4Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGUEROS5) {
           return (new CaminoHaciaBodegueros5Factory().createController());
            // -------------
            // BODEGAS
        } else if (Type == Factories.CAMINO_HACIA_BODEGA1) {
           return (new CaminoHaciaBodega1Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGA2) {
           return (new CaminoHaciaBodega2Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGA3) {
           return (new CaminoHaciaBodega3Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGA4) {
           return (new CaminoHaciaBodega4Factory().createController());
        } else if (Type == Factories.CAMINO_HACIA_BODEGA5) {
           return (new CaminoHaciaBodega5Factory().createController());
        }
        return null;
    }
}