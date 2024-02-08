package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class practice {

    public void sample () {
        System.out.print("숫자 하나를 작성하세요 : ");
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        if (num>0) {
            if (num%2==0){
                System.out.println("입력하신 숫자는 짝수입니다");
            }
            else {
                System.out.println("입력하신 숫자는 홀수입니다");
            }

        }
        else{
        System.out.println("입력하신 숫자는 음수입니다");

        }



    }


}
