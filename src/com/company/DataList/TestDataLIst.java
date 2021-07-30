package com.company.DataList;

import java.util.Arrays;

public class TestDataLIst {
    public static void main(String[] args) {
        int[]tver=new int[5];
        for (int i = 0; i < tver.length; i++) {
            tver[i]=1;
        }
        int[]tver1=new int[10];
        System.arraycopy(tver,0,tver1,5,4);
        System.out.println(Arrays.toString(tver1));
    }

}
