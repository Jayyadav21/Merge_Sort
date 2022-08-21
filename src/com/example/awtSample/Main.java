package com.example.awtSample;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

     int[] A={2,3,6,9,8,7};
     mergeSort(A,0,A.length-1);
        System.out.println(Arrays.toString(A));

    }
    public static void mergeSort(int[] A, int s, int e){

        if(s>=e) return ;

        int m=s+(e-s)/2;

        mergeSort(A,s,m);
        mergeSort(A,m+1,e);
        merge(A,s,m,e);

    }

    private static void merge(int[] A, int s, int m, int e) {

        int[] T=new int[e-s+1];
        int p1=s,p2=m+1,p3=0;

        while (p1<=m && p2<=e){
            if(A[p1]<=A[p2]) {
                T[p3] = A[p1];
                p3++;
                p1++;
            }else {
                T[p3] = A[p2];
                p3++;
                p2++;
            }
        }
        while (p1<=m){
            T[p3++]=A[p1++];

        }
        while (p2<=e){
            T[p3]=A[p2];
            p3++;
            p2++;
        }

        for(int i=0,j=s;i<T.length;i++,j++){
            A[j]=T[i];
        }
    }
}



















