/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Scanner;

/**
 *
 * @author remix
 */
public class Casa_Disquera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cantante, disco;
        ListaCantantesFamosos listacantate = new ListaCantantesFamosos();
        Agregar insertar = new Agregar();

        CantanteFamoso cantante1 = new CantanteFamoso("Eminem", " The Slim Shady LP ");
        listacantate.AgregarCantante(cantante1);

        System.out.println("La lista contiene los siguientes datos: ");
        listacantate.listarCantanteFamoso();
        String continuar = new String();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese nombre de un cantante: ");
            cantante = insertar.AgregarCantante();
            System.out.println("Ingrese su disco mas vendido: ");
            disco = insertar.AgregarCantante();
            listacantate.AgregarCantante(new CantanteFamoso(cantante, disco));
            System.out.println("Datos de la lista: ");
            listacantate.listarCantanteFamoso();
            System.out.println("¿Deseas agregar otro cantante y su disco (S/N)?");
            continuar = sc.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

    }
    }
    

