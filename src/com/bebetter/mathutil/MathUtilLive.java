/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bebetter.mathutil;

/**
 *
 * @author Merlin
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long result = MathUtil.getFactorial(5);
        System.out.println("expected 5! = 120; actual: " +result);
        System.out.println("expected 6! = 720; actual: " +MathUtil.getFactorial(6));
        System.out.println("expected 0! = 1;   actual: " +MathUtil.getFactorial(0));
        
        //Thêm code sau lần đầu tiên làm chuyện ấy - Code lên server 7:35 PM 02/10/2024 ehehe
        System.out.println("expected 1! = 1;   actual: " +MathUtil.getFactorial(1));
        System.out.println("expected 3! = 6;   actual: " +MathUtil.getFactorial(3));
    }
}
