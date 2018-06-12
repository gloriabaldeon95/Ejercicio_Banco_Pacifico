/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationbancopacifico;

import Modelo.Cliente;
import Modelo.Cta_Ahorro;
import Modelo.Cta_Corriente;
import Modelo.Cta_Lista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gloria PC
 */
public class JavaApplicationBancoPacifico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cta_Corriente ctaC = new Cta_Corriente(100);
        ctaC.setApellido("Baldeon");
        ctaC.setNombre("Gloria");
                       
        Cta_Ahorro ctaA = new Cta_Ahorro(200);
        ctaA.setApellido("Lopez");
        ctaA.setNombre("Nathaly");
      
        Cta_Lista ctaL = new Cta_Lista(150);
        ctaL.setApellido("Chevez");
        ctaL.setNombre("Antonio");
      
        
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(ctaC);
        clientes.add(ctaA);
        clientes.add(ctaL);
        
        clientes.forEach((Cliente) -> {
            Cliente.Mostrar();
        });
            
    Scanner s= new Scanner(System.in);
    
    s.nextLine();
    
    }
    
      }

