/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vicsa
 */
public class MergeSort {

    private int j;
    private int i;
    public void sort(int arreglo[], int izq, int der){
        if (izq<der){
        int mitad = (izq+der)/2;
        sort(arreglo, izq, mitad);
        sort(arreglo, mitad+1, der);
        
        merge(arreglo, izq, mitad, der);
        }
    }
    public void merge(int arreglo[], int izq, int mitad, int der){
        int n1=mitad - izq+1;
        int n2=mitad -der;
        
        int izqArreglo[]=new int[n1];
        int derArreglo[]=new int[n2];
        
        for (int i=0;i<n1;i++){
            izqArreglo[i]=arreglo[izq+1];
        }
        for (int j=0;i<n2;j++){
            derArreglo[j]=arreglo[mitad +j +1];
        }
        int i=0, j=0;
        int k = izq;
        
        while(i<n1 && j<n2){
            if(izqArreglo[i]<=derArreglo[j]){
                arreglo[k]=izqArreglo[i];
                i++;
            }else{
                arreglo[k]=derArreglo[j];
                j++;
            }
        }
        while (i<n1){
            arreglo[k]=izqArreglo[i];
            i++;
            k++;
        }
        while (i<n2){
            arreglo[k]=derArreglo[j];
            j++;
            k++;
        }
    }
    public void printArreglo(int arreglo[]){
        int n= arreglo.length;
        for(int i=0;i<n;++i){
            System.out.println(arreglo[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort();
        int arreglo[]= {5,26,12,6,1,4,7};
        int n=arreglo.length;
        
        System.out.println("Arreglo Original:");
        for (int value: arreglo){
            System.out.print(value+"");
        }
        System.out.println();
        
        System.out.println("Arreglo Ordenado");
        mergeSort.sort(arreglo, 0, n-1);
        mergeSort.printArreglo(arreglo);

}

}


