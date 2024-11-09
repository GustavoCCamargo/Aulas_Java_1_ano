package aulas;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Aula34 {

    public static void aula(){
        System.out.println("Aula Dia 08-10, Listas.");
        ex02();
    }


    public static void ex01(){
        LinkedList <Integer> lista = new LinkedList<>();
        int x;
        lista.add(10);
        lista.add(20);
        lista.add(15);
        lista.add(16);
        lista.add(21);
        lista.add(22);
        lista.add(25);

        for(int i = 0; i<lista.size(); i++){
            x = lista.get(i);
            System.out.println(x);
        }
        System.out.println("------------------------------------------------");

        lista.add(3,500);

        for(int i = 0; i<lista.size(); i++){
            x = lista.get(i);
            System.out.println(x);
        }
        System.out.println("------------------------------------------------");

        lista.set(2, 345);
        for(int i = 0; i<lista.size(); i++){
            x = lista.get(i);
            System.out.println(x);
        }
        System.out.println("------------------------------------------------");

        for(int y : lista){
            System.out.println(y);        
        }
        System.out.println("------------------------------------------------");

        ListIterator <Integer> l = lista.listIterator();

        while (l.hasNext()) {
            System.out.println(l.next());
        }
    }

    public static void ex02(){
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(20); 
        conjunto.add(50); 
        conjunto.add(40); 
        conjunto.add(30); 

        for(int y :conjunto){
            System.out.println(y);
        }

        System.out.println(conjunto.contains(20));
    }
}