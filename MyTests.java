/** 
*DANIELA VILLAMAR 19086
* 10 DE FEBRERO DEL 2020
*/

package application;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void sortTester() {
    	// muestra listas de prueba
    	// primer lista esta ordenada como supone ser
    	Integer[] listaOrdenadaReal = new Integer[5];
    	listaOrdenadaReal[0]=1;
    	listaOrdenadaReal[1]=2;
    	listaOrdenadaReal[2]=3;
    	listaOrdenadaReal[3]=4;
    	listaOrdenadaReal[4]=5;
        // segunda esta desordenada y se debe ordenar
        Integer[] listaDePruebaDesordenada = new Integer[5];
        listaDePruebaDesordenada[0]=4;
        listaDePruebaDesordenada[1]=1;
        listaDePruebaDesordenada[2]=3;
        listaDePruebaDesordenada[3]=5;
        listaDePruebaDesordenada[4]=2;
        //Cuarta Prueba RadixSort
       	assertArrayEquals(listaOrdenadaReal, RadixSort.radixsort(listaDePruebaDesordenada, listaDePruebaDesordenada.length));
        //Tercera Prueba QuickSort
        //assertArrayEquals(listaOrdenadaReal, QuickSort.sort(listaDePruebaDesordenada));
        //Segunda Prueba MergeSort
        //assertArrayEquals(listaOrdenadaReal, MergeSort.mergesort(listaDePruebaDesordenada));
        // Primera Prueba BubbleSort
        //assertArrayEquals(listaOrdenadaReal, BubbleSort.bubble(listaDePruebaDesordenada));
        
        // No hay prueba de selection sort porque hay errores, las unicas sin error y que funcionan sn problemas son esas..
        
    }

	
}
