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
public class Agregar {
    private String AgregarI;
    Scanner sc = new Scanner(System.in);

    public Agregar() {
        AgregarI = "";
    }

    public String AgregarCantante() {
        AgregarI = sc.nextLine();
        return AgregarI;
    }
    public String getEntrada() {
        return AgregarI;
    }
}
