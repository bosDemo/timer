package com.example.Test;

import static com.example.utils.QRCodeUtil.decodeQRCode;
import static com.example.utils.QRCodeUtil.encodeQRCode;

public class QRCodeUtilsTest {

    public static void main(String[] args) {

        // 生成路径
        String filePath = "E:/second.png";

        // 生成二维码
        encodeQRCode("第一个二维码", filePath);

        // 解码二维码
        decodeQRCode(filePath);
    }

}
