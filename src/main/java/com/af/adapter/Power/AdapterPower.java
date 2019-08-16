package com.af.adapter.Power;

/**
 * Created by Administrator on 2019/8/16.
 */
public class AdapterPower implements DC5 {

    private Power220 power220;

    public AdapterPower(Power220 power220){
        this.power220 = power220;
    }

    public int outputDC5() {
        //获取直流电
        int power = power220.output();
        //b变压器
        int dcV = power/44;
        //输出变压后的
        return dcV;
    }
}
