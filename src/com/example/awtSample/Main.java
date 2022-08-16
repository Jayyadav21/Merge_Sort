package com.example.awtSample;


import javax.swing.tree.TreeNode;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] A={1,1};

       HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();

       hmap.put(7,0);
       hmap.put(1,1);
       hmap.put(3,2);
       hmap.put(4,3);
       hmap.put(5,1);
       hmap.put(8,1);

        System.out.println(hmap.get(hmap));
    }
}
















