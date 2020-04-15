package com.example.lib;

import android.graphics.Point;


import java.util.Arrays;

public class CHFeatureObject
{
    static public int FEATURE_TYPE_FEATURE = 0;
    static public int FEATURE_TYPE_KEYS = 1;
    static public int FEATURE_TYPE_IMAGE = 2;
    static public int FEATURE_TYPE_IMAGE_FULL = 6;// 整张图片
    static public int FEATURE_TYPE_HIST1024 = 8;
    static public int ST_PIX_FMT_NV21 = 3;
    static public int ST_PIX_FMT_JPEG = 48;
    public int nType;
    public int nId;
    public int nBufLen;
    public byte [] arryBuffer;
    private  int nPointsCount = 0;
    MyPoint[] arryPoints = null;
    CHSTImage stCapImage = new CHSTImage();


    public void ChangFeatureData()
    {
        int nReadIndex = 0;
        if (FEATURE_TYPE_KEYS == nType)
        {
            nReadIndex = 0;
            nPointsCount = nBufLen/8;
            arryPoints = new MyPoint[nPointsCount];
            int nPointIndex = 0;
            for (nPointIndex=0; nPointIndex<nPointsCount; ++nPointIndex)
            {
                MyPoint stPoint = new MyPoint();
                stPoint.x = (int)(ByteUtil.getFloat(ByteUtil.subBytes(arryBuffer, nReadIndex, 4))+0.5);
                nReadIndex += 4;
                stPoint.y = (int)(ByteUtil.getFloat(ByteUtil.subBytes(arryBuffer, nReadIndex, 4))+0.5);
                nReadIndex += 4;
                arryPoints[nPointIndex] = stPoint;
            }
        }
        else if (FEATURE_TYPE_IMAGE == nType || FEATURE_TYPE_IMAGE_FULL == nType)
        {
            nReadIndex = 0;
            stCapImage.format = ByteUtil.getInt(ByteUtil.subBytes(arryBuffer, nReadIndex, 4));
            nReadIndex += 4;
            stCapImage.width = ByteUtil.getInt(ByteUtil.subBytes(arryBuffer, nReadIndex, 4));
            nReadIndex += 4;
            stCapImage.height = ByteUtil.getInt(ByteUtil.subBytes(arryBuffer, nReadIndex, 4));
            nReadIndex += 4;
            stCapImage.stride = ByteUtil.getInt(ByteUtil.subBytes(arryBuffer, nReadIndex, 4));
            nReadIndex += 4;
            if (ST_PIX_FMT_NV21 == stCapImage.format)
            {
                stCapImage.dataLen = stCapImage.stride * stCapImage.height * 3 / 2;
            }else if(ST_PIX_FMT_JPEG == stCapImage.format)
            {
                stCapImage.dataLen = nBufLen-16;
            }

            if (stCapImage.dataLen > 0 && nBufLen >= (stCapImage.dataLen+16))
            {
                stCapImage.data = ByteUtil.subBytes(arryBuffer, nReadIndex, stCapImage.dataLen);
            }
        }
    }

    public CHSTImage getStCapImage() {
        return stCapImage;
    }

    public void setStCapImage(CHSTImage stCapImage) {
        this.stCapImage = stCapImage;
    }

    @Override
    public String toString() {
        return "CHFeatureObject{" +
                "\nnType=" + nType +
                "\n, nId=" + nId +
                "\n, nBufLen=" + nBufLen +
                "\n, arryBuffer=" + Arrays.toString(arryBuffer) +
                "\n, nPointsCount=" + nPointsCount +
                "\n, arryPoints=" + Arrays.toString(arryPoints) +
                "\n, stCapImage=" + stCapImage +
                '}';
    }
}
