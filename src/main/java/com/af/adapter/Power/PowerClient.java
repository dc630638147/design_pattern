package com.af.adapter.Power;

/**
 * Created by Administrator on 2019/8/16.
 */
public class PowerClient {

    public static void main(String[] args) {
        int i = new AdapterPower(new Power220()).outputDC5();
        System.out.println(i);
    }
}
