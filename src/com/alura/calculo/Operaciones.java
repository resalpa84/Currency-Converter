package com.alura.calculo;

import com.alura.modelos.CambioDivisa;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Operaciones {
    public void menus(){
        System.out.println("⟵-----------------------------------⟶");
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("1) Dolar --> Peso Argentino");
        System.out.println("2) Peso Argentino --> Peso Dolar");
        System.out.println("3) Dolar --> Real Brasileño");
        System.out.println("4) Real Brasileño --> Dolar");
        System.out.println("5) Dolar --> Peso Colombiano");
        System.out.println("6) Peso Colombiano --> Dolar");
        System.out.println("7) Salir");
        System.out.println("Elejir una opcion valida");
        System.out.println("⟵-----------------------------------⟶");

    }
    public void conversion(String base,String target,Consulta consulta) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite el valor que desea convertir de ("+base+") a ("+target+"):");
        double valor = lectura.nextDouble();
        consulta.setBase(base);
        consulta.setTarget(target);
        Gson gson = new Gson();
        CambioDivisa cambioDivisa = gson.fromJson(consulta.getConsulta(), CambioDivisa.class);
        double valorFinal = valor * cambioDivisa.getConversion_rate();
        System.out.println("El valor "+valor+" ("+base+") corresponde al valor final de --> "+valorFinal+" ("+target+")");

    }
}
