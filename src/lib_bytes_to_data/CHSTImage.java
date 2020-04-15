package com.example.lib;

import java.util.Arrays;

public class CHSTImage
{
    public  int format;   //
    public  int width;    //
    public  int height;   //
    public  int stride;   //
    public  int dataLen;  //
    public  byte []data;  //


    @Override
    public String toString() {
        return "CHSTImage{" +
                "\n format=" + format +
                "\n , width=" + width +
                "\n , height=" + height +
                "\n , stride=" + stride +
                "\n , dataLen=" + dataLen +
                "\n , data=" + Arrays.toString(data) +
                '}';
    }
}
