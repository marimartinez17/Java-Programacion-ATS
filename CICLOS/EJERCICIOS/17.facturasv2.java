/* Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide 
de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuántas facturas 
se emitieron de más de $600 

Hacer nas modificaciones al ejercicio anterior suponiendo que no se introduce el precio
por litro, solo existen tres productos con precios:
1- 0.6$/litro
2- 3$/litro
3- 1,25 e/litro*/

package com.mycompany.facturasv2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int codigo, litros, litrosArt1 = 0, cantFactMayores = 0;
        float facturacionTotal = 0, importeFactura;

        for (int i=0; i<5; i++){
            // Solicitar datos al usuario
            do {
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el código del artículo:\n1- 0.6$/litr0\n2- 3$/litro\n3- 1,25 e/litro"));
            } while (codigo < 1 || codigo > 3);
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad vendida en litros: "));
            
            // Calcular monto de cada factura
            if (codigo == 1){
                importeFactura = (float)litros * 0.6f;
            } else if (codigo == 2){
                importeFactura = (float)litros * 3f;
            } else {
                importeFactura = (float)litros * 0.6f;
            }
            
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
