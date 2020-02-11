/**
*DANIELA VILLAMAR 19086
* 7 DE FEBRERO DEL 2020
*/

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;


public class Main {
	public static void main(String [ ] args){
	   
		//creacion scanner e impresora
		PrintWriter impresora = null;
		Scanner leer = new Scanner(System.in);
		
		//sistema para calcular algoritmos del sort
		//pide cantidad de enteros random a ordenar e utilizar
		System.out.println("Bienvenido al sistema de ordenamiento por SORTS.");
		System.out.println("Ingrese la cantidad de numeros que desea ordenar: ");
		boolean error=false;
		int cantidad=0;
		//el dato ingresado debe de ser un entero
		do{
			try {
				cantidad= Integer.parseInt(leer.next());
				if(cantidad<10 || cantidad>3000){
					throw new NumberFormatException("Error numero entero");
				}
				error=false;
			}catch(NumberFormatException e){
				error=true;
				System.out.println("Error, debe ingresar enteros entre 10 y 3000.: ");
				System.out.println("Ingrese la cantidad de numeros que desea ordenar entre 10 y 3000: ");
			}
		}while(error==true);
		//ya con el dato entero se crea el numero random
		int random;
		Integer[] listaBS = new Integer[cantidad]; 
		Integer[] listaQS = new Integer[cantidad];
		Integer[] listaRS = new Integer[cantidad];
		Integer[] listaMS = new Integer[cantidad];
		Integer[] lista = new Integer[cantidad]; 
		for(int i = 0; i < cantidad; i = i + 1)
		{
			random=(int) (Math.random() * (cantidad-1)) + 1;
			lista[i]=(random);
			listaQS[i]=(random);
			listaBS[i]=(random);
			listaRS[i]=(random);
			listaMS[i]=(random);
			
		}
		
		//se imprime la lista original en un txt
            try {
				impresora=new PrintWriter("listaOriginal.txt", "UTF-8");
				for (int i = 0; i < lista.length; i++){
                impresora.println("Dato" + (i+1) +": " +lista[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
            }

		//Pruebas de algoritmos
		//Bubble Sort
		Integer[] listaOrdenadaBS = (Integer[]) BubbleSort.bubble(listaBS);
			
		//Merge Sort
		Comparable[] listaOrdenadaMS = MergeSort.mergesort(listaMS);
				
		//Quick Sort
		Integer[] listaOrdenadaQS = (Integer[])QuickSort.sort(listaQS);
				
		//Radix Sort
		Integer[] listaOrdenadaRS = (Integer[])RadixSort.radixsort(listaRS, listaRS.length);
				
		
		
		
		
		//se imprime la lista final en un txt
            try {
				impresora=new PrintWriter("listaOrdenadaBS.txt", "UTF-8");
				for (int i = 0; i < listaOrdenadaBS.length; i++){
                	impresora.println("Dato" + (i+1) +": " +listaOrdenadaBS[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
			}

