/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extremadura;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Extremadura {

    //static Provincia[] provincias = new Provincia[2];
    static ArrayList<Provincia> provincias = new ArrayList<>();

    public static void rellenarDatos() {

        Provincia p = new Provincia();
        p.setNombre("Badajoz");
        p.setExtension(234000);
        provincias.add(p);

        p = new Provincia();
        p.setNombre("Cáceres");
        p.setExtension(190000);
        provincias.add(p);

        Localidad loc;
        //ArrayList <Localidad> aux= new ArrayList <>(); //OTRA MANERA DE HACERLO
        for (int i = 0; i < 300; i++) {
            loc = new Localidad();
            loc.setNombre("Cachorrilla " + i);
            loc.setExtension(10000 + i);
            loc.setHabitantes(300 + i);
            provincias.get(0).addLocalidad(loc);
            //aux.add(loc);
        }
        //provincias.get(0).setLocalidades(aux);

        for (int i = 0; i < 300; i++) {
            loc = new Localidad();
            loc.setNombre("Malpartida " + i);
            loc.setExtension(5000 + i);
            loc.setHabitantes(200 + i);
            provincias.get(1).addLocalidad(loc);
        }

        /*Provincia p;
        p = new Provincia();
        p.setNombre("Badajoz");
        p.setExtension(21000);
        provincias[0]=p;
        p = new Provincia();
        p.setNombre("Cáceres");
        p.setExtension(19000);
        provincias[1] = p;*/
 /*provincias[0] = new Provincia();
        provincias[0].setNombre("Badajoz");
        provincias[0].setExtension(2000);
        
        provincias[1] = new Provincia();
        provincias[1].setNombre("Cáceres");
        provincias[1].setExtension(1000);
        
        Localidad localidad;
        for( int p=0; p<provincias.length; p++){
            for( int lo=0; lo<provincias[p].getLocalidades().length; lo++){
                localidad = new Localidad();
                
                localidad.setNombre("Cachorrilla "+ lo);
                localidad.setHabitantes(lo+p);
                localidad.setExtension(1000);
                provincias[p].anadirLocalidad(localidad);
            }
        }*/
    }

    public static void ejercicio1() {
        //Mostrar nombre de las provincias
        /*for (int i = 0; i < provincias.size(); i++) {
            System.out.println(provincias.get(i).getNombre());
        }*/
        for (Provincia p : provincias) {
            System.out.println(p.getNombre());
        }
    }

    public static void ejercicio2() {
        //Mostrar localidades de cada provincia
        /*for (int i = 0; i < provincias.size(); i++) {
            System.out.println(provincias.get(i).getNombre());
            for (int c = 0; c < provincias.get(i).getLocalidades().size(); c++) {
                System.out.println(provincias.get(i).getLocalidades().get(c).getNombre());
            }
        }*/
        for (Provincia p : provincias) {
            System.out.println(p.getNombre());
            for (Localidad loc : p.getLocalidades()) {
                System.out.println(loc.getNombre());
            }
        }
    }

    public static void ejercicio3() {
        //Número de habitantes por provincias
        /*int sumaBadajoz=0;
        int sumaCaceres=0;
        for ( int i=0; i<provincias.size(); i++){
            for ( int c=0; c<provincias.get(i).getLocalidades().size();c++){
              sumaBadajoz= sumaBadajoz + provincias.get(0).getLocalidades().get(i).getHabitantes();
              sumaCaceres= sumaCaceres + provincias.get(1).getLocalidades().get(i).getHabitantes();
            }
        }
        System.out.println("El numero total de habitantes de Badajoz es "+ sumaBadajoz);
        System.out.println("El numero total de habitantes de Cáceres es "+ sumaCaceres);*/
        
        int sumaProvincia;
        for (Provincia p : provincias) {
            sumaProvincia=0;
            for (Localidad loc : p.getLocalidades()) {
                sumaProvincia=sumaProvincia + loc.getHabitantes();
            }
            
            System.out.println(sumaProvincia);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rellenarDatos();
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

}
