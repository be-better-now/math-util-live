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
//VIẾT CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY.
public class MathUtil {
    
    //n! = 1.2.3.4.5.6... n
    //0! = 1! = 1
    //Không tính giai thừa cho số âm
    //20! là vừa khớp kểu long, kiểu long tối đa 18 con số 0
    //Nếu đưa vào âm hoặc 21! -> ko tính.
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        //hàm dừng liền, không cần return
        
        //xuống đây là n = 0..20
        if (n == 0 || n == 1) 
            return 1; //dừng ngay khi n đặc biệt
        
        //xuống đây, n = 2..20
        //kĩ thuật nhồi con heo đất, ốc bu dồn thịt
        //i = 2, i = 3, i = 4, i = 5,... i = n;
        long product = 1; //tích khởi đầu = 1;
        for (int i = 2; i <= n; i++)
            product *= i; //product = product * i; nhồi liên tục product.
        //nhân từ 2 đến n
        return product;  
    }
}
