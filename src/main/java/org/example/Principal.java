package org.example;


import controlador.ControladorPrincipal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vista.VentanaPrincipal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

  //  private static final Logger logger = LogManager.getLogger(Principal.class);

    public static void main(String[] args) {


      //  PruebaMap();

            VentanaPrincipal vistaPrincipal = new VentanaPrincipal();
            ControladorPrincipal controlador = new ControladorPrincipal(vistaPrincipal);








    }

    public static void PruebaMap() {


        Map map = new HashMap();
        map.put("USA", 1);
        map.put("Japan", 3);
        map.put("China", 2);
        map.put("India", 5);
        map.put("Germany", 4);


        map.replace("China", 5000);


        List<String> clave = new ArrayList<String>(map.keySet());


        for (int i = 0; i < clave.size(); i++) {

            System.out.println(clave.get(i));
        }

        List<String> valor = new ArrayList<String>(map.values());

        for (int i = 0; i < valor.size(); i++) {

            System.out.println(valor.get(i));
        }

    }

}