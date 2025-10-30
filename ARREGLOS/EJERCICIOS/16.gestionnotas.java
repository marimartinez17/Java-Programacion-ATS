/*
 * Ejercicio # 16: Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. 
 * Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre 
 * de un grupo, debemos mostrar al final: La nota media del grupo en cada trimestre, y la media del alumno que se 
 * encuentra en la posición N (N se lee por teclado).
 */

package com.mycompany.gestionnotas;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        float trimestre1[] = new float[5];
        float trimestre2[] = new float[5];
        float trimestre3[] = new float[5];
        float mediaTri1,mediaTri2,mediaTri3,mediaAlumno;
        float acumTri1=0,acumTri2=0,acumTri3=0;
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        // Leer calificaciones
        for (int i=0;i<5;i++){
            System.out.println("Ingrese las calificaciones (0-20) del alumno #"+(i+1)+":");
            do{
                System.out.print("Trimestre # 1: ");
                trimestre1[i] = entrada.nextInt();
            } while (trimestre1[i]<1 || trimestre1[i]>20);
            do{
                System.out.print("Trimestre # 2: ");
                trimestre2[i] = entrada.nextInt();
            } while (trimestre2[i]<1 || trimestre2[i]>20);
            do{
                System.out.print("Trimestre # 3: ");
                trimestre3[i] = entrada.nextInt();
            } while (trimestre3[i]<1 || trimestre3[i]>20);
        }
        
        //Calc media trimestre #1
        for (int i=0;i<5;i++){
            acumTri1+=trimestre1[i];
        }
        mediaTri1 = acumTri1/5;
        
        //Calc media trimestre #2
        for (int i=0;i<5;i++){
            acumTri2+=trimestre2[i];
        }
        mediaTri2 = acumTri2/5;
        
        //Calc media trimestre #3
        for (int i=0;i<5;i++){
            acumTri3+=trimestre3[i];
        }
        mediaTri3 = acumTri3/5;
        
        do{
            System.out.print("Ingrese un número (1-5) para conocer la media de un alumno: ");
            num = entrada.nextInt();
        } while (num < 1 || num > 5);
        
        //Calc media del alumno
        mediaAlumno = (trimestre1[num-1]+trimestre2[num-1]+trimestre3[num-1])/3;
        
        // Salida de datos
        System.out.println("MEDIA GRUPAL DE CALIFICACIONES: ");
        System.out.println("Trimestre I: "+mediaTri1);
        System.out.println("Trimestre II: "+mediaTri2);
        System.out.println("Trimestre III: "+mediaTri3);
        
        System.out.println("MEDIA DEL ALUMNO #"+(num)+": "+(mediaAlumno));
    }
}
