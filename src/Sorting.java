package AsgnJune15;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = scanner.nextInt();
        }
        insertionSort(a);
        display(a);
    }

   public static void swap(int ar[],int a,int b){
        ar[a]=ar[a]+ar[b];
        ar[b]=ar[a]-ar[b];
        ar[a]=ar[a]-ar[b];
    }

    static void display(int a[]){
        System.out.print(Arrays.toString(a));
    }
    
    static int[] mergeSort(int a[],int first,int last){
        if(first==last){
            int arr[] = new int[1];
            arr[0] = a[first];
            return arr;
        }
        int mid = (first+last)/2;
        int left[]=mergeSort(a,first,mid);
        int right[]=mergeSort(a,mid+1,last);

        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right) {
        int a[]=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
           if(left[i]<=right[j]){
               a[k]=left[i];
               i++;
               k++;
           }else {
               a[k]=right[j];
               j++;
               k++;
           }
            while (i<left.length){
            a[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            a[k]=right[j];
            j++;
            k++;
        }
        return a;


        }
    }

    static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j=i-1;
                while(j>=0 && a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=key;
            }
        }

    static void bubbleSort(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }

    static void selectionSort(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length-1 ; j++) {
                if(a[i]>a[j]){
                   swap(a,i,j);
                }
            }
        }
    }
}
