package com.example.controller;

import com.example.utils.IdWorkerUtilss;

public class IdWord {
    public static void main(String[] args) {
        int a= 100;
        for (int i=1;i<100;i++){
            String idStr = IdWorkerUtilss.getIdStr();
            System.out.println(idStr);
            System.out.println(idStr+a);
        }

    }
}
