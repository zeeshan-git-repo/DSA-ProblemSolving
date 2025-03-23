/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.dsa.arrays.iterative;

import java.util.ArrayList;

/**
 *
 * @author ZAhmad
 */
public class AlternateElementsOfAnArrayItr {

    /**
     * Ques: Given an array arr[], the task is to print every alternate element
     * of the array starting from the first element.
     *
     * @param args
     */
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        ArrayList<Integer> arrList = getAlternateElements(arr);
        System.out.println(arrList);

    }

    private static ArrayList<Integer> getAlternateElements(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for (int index = 0; index < arr.length; index += 2) {
            list.add(arr[index]);
        }
        return list;
    }

}
