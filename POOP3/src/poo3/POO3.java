package poo3;

/**
 * Este es el programa POO3 que demuestra varios conceptos de Java.
 *
 * @author Galindo Mayer Johann Zair
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

public class POO3 {

    public static void main(String[] args) {
        
        System.out.println("######### Arrays #########");
        int [] nums4 ={1,2,3,4};
        System.out.println("######### for #########");
        // Usamos un bucle "for" para iterar a través del arreglo "nums4"
        for (int i=0; i < nums4.length; i++){
            System.out.println(i);
        }
        System.out.println("######### for - each #########");
        // Usamos un bucle "for-each" para iterar a través del arreglo "nums4"
        for (int i: nums4){
            System.out.println(i);
        }
        System.out.println("######### Concatenar #########");
        String s = "Hola Mundo";
        String s1 = "Hola Mundo"; 
        System.out.println(s);
        System.out.println(s1);
        // Concatenamos cadenas para formar una cadena más larga
        String nombre ="Johann Zair";
        String apellido = "Galindo Mayer";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        
        System.out.println("######### Operador Punto #########");
        System.out.println("Numero de elementos del arreglo: " + nums4.length);
        System.out.println("Numero de elementos nombre: " + nombre.length());
        System.out.println(nombreCompleto.toUpperCase()); // Convertimos a mayúsculas
        System.out.println(nombreCompleto);
        
        System.out.println("######### Wrappers y Autoboxing #########");
        
        Integer k = 50;
        int r = 1;
        int b = 7;
        // Realizamos casting de tipos
        boolean s3 = false;
        System.out.println(s3);
        String s4 = r + "";
        System.out.println(s4);
        System.out.println (s4.length());
        
        System.out.println("######### Colecciones #########");
        
        System.out.println("######### ArrayList #########");
        ArrayList<Integer> miArrayList = new ArrayList<>();
        miArrayList.add(b);
        miArrayList.add(9);
        System.out.println (miArrayList.size());
        System.out.println (miArrayList.get(0));
        miArrayList.add(0,20);
        System.out.println("***");
        for (Integer integer : miArrayList){
            System.out.println(integer);
        }
        System.out.println("######### Hashtable #########");
        Hashtable<Integer,String> agenda = new Hashtable<>();
        agenda.put(k, "Zayra");
        agenda.put(553884390, "Iron Man");
        agenda.put(553677124, "Katherine");
        agenda.put(554249890, "Maria Elena");
        agenda.put(558366979, "Santiago");
        System.out.println(agenda.size());
        System.out.println("***");
        for (String valor : agenda.values()){
            System.out.println(valor);
        }
        for (Integer clave : agenda.keySet()){
            System.out.println(clave);
        }
        
        System.out.println("######### Enumeracion #########");
        Integer clave;
        String valor;
        Enumeration <Integer> llaves = (Enumeration<Integer>)agenda.keySet();
        while (llaves.hasMoreElements()){
            clave = llaves.nextElement();
            Object Clave = null;
            valor = agenda.get(Clave);
            System.out.println("clave: " + clave + " valor: " + valor);
        }
        
        System.out.println("######### Math #########");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));
        System.out.println(Math.min(3, 65));
        
        System.out.println("######### Date #########");
        Date hoy = new Date();
        System.out.println(hoy);
        System.out.println(hoy.toString());   
    }
}