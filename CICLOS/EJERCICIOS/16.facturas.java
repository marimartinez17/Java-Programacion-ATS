/* Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide 
de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuántas facturas 
se emitieron de más de $600 */

package com.mycompany.resumenventas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int codigo, litros, litrosArt1 = 0, cantFactMayores = 0;
        float precioLitro, facturacionTotal = 0, importeFactura;

        for (int i=0; i<5; i++){
            // Solicitar datos al usuario
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el código del artículo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad vendida en litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Ingresar el precio por litro: "));
            
            // Calcular monto de cada factura
            importeFactura = litros * precioLitro;
            
            // Si la factura es mayor a $600
            if (importeFactura > 600){
                cantFactMayores++;
            }
            // cantidad en litros vendidos del artículo 1
            if (codigo == 1){
                litrosArt1 += litros;
            }
            
            // Acumular monto de las facturas
            facturacionTotal += importeFactura;
        }
      
        // Salida de datos
        JOptionPane.showMessageDialog(null, "RESÚMEN DE VENTAS\n"
                +"Facturación total: "+facturacionTotal+"$.\n"
                +"Cantidad en litros vendidos del artículo 1: "+litrosArt1+".\n"
                +"Facturas superiores a $600: "+cantFactMayores);
    }
}
