 /* DANIELA VILLAMAR 19086*/
 /* 8 DE FEBRERO DEL 2020*/
 
 /* Referencia de ayuda;
 * https://www.geeksforgeeks.org/bubble-sort/
 */
public class BubbleSort 
{
    
    public static Comparable[] bubble(Comparable [] A)
    {
         int i, j, aux;
         for(i=0;i<A.length-1;i++)
              for(j=0;j<A.length-i-1;j++)
                   if(A[j+1].compareTo(A[j])<0){
                      aux=(int) A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
    return A;
    }
    
    
    
    
    
}
