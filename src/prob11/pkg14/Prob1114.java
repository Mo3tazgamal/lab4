/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prob11.pkg14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MEZOO
 */
public class Prob1114 {

    
    public static void main(String[] args){ 
            ArrayList<Integer> arr1 = new ArrayList<>(); 
            ArrayList<Integer> arr2 = new ArrayList<>();
            ArrayList<Integer> combinedArr = new ArrayList<>();

        System.out.println("enter 5 integers for list 1");
        for (int i = 0 ; i <5 ; i++){
        Scanner in = new Scanner(System.in);
            arr1.add(in.nextInt());
        }
        
        combinedArr= union(arr1);
        for (int j = 0 ; j <combinedArr.size() ; j++)
        System.out.print(combinedArr.get(j) + " ");
        
    }
    public static ArrayList<Integer> union( ArrayList<Integer> list1){
        ArrayList<Integer> combinedArr = new ArrayList<>();
        combinedArr.addAll(list1);
      

        
return       combinedArr;
    }
}
    