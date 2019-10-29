/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author remix
 */
public class ListaCantantesFamosos {
    ArrayList<CantanteFamoso> cantantes;
    
    public ListaCantantesFamosos(){
        cantantes = new <CantanteFamoso> ArrayList();
    }
    
    public void AgregarCantante(CantanteFamoso cantante){
        cantantes.add(cantante);
    }
    public void listarCantanteFamoso() {
        CantanteFamoso cantante;
        Iterator<CantanteFamoso> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("        Discos con mas ventas: " + cantante.getDiscoFamoso());
        }
}}
