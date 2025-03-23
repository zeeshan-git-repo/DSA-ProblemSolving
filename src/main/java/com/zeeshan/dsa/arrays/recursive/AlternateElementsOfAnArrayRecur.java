/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zeeshan.dsa.arrays.recursive;

import java.util.ArrayList;

/**
 *
 * @author ZAhmad
 */
public class AlternateElementsOfAnArrayRecur {

    /**
     * Ques: Given an array arr[], the task is to print every alternate element
     * of the array starting from the first element.
     *
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        ArrayList<Integer> arrList = getAlternateElements(arr);
        System.out.println(arrList);
    }

    private static ArrayList<Integer> getAlternateElements(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        getAlternates(arr, 0, arrList);
        return arrList;
    }

    private static void getAlternates(int[] arr, int index, ArrayList<Integer> arrList) {
        if (index < arr.length) {
            arrList.add(arr[index]);
            getAlternates(arr, index + 2, arrList);
        }
    }
}
