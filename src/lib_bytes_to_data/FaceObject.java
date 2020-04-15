package com.example.lib;


import java.util.Arrays;

public class FaceObject
{
    private  int faceTrackId = 0;
    private  int faceRectLeft;
    private  int faceRectTop;
    private  int faceRectRight;
    private  int faceRectButtom;
    private  int facePointCount;
    private  int faceFeatureLen;
    private  int faceAttributeCount;
    private  float faceYaw;
    private  float facePitch;
    private  float faceRoll;
    private  float faceQuality;
    public byte [] arrFaceFeature;
    public MyPoint [] arrFacePoint;
    public FaceAttribute [] arrFaceAttribute;

    public int getFaceTrackId() {
        return faceTrackId;
    }

    public void setFaceTrackId(int faceTrackId) {
        this.faceTrackId = faceTrackId;
    }

    public int getFaceRectLeft() {
        return faceRectLeft;
    }

    public void setFaceRectLeft(int faceRectLeft) {
        this.faceRectLeft = faceRectLeft;
    }

    public int getFaceRectTop() {
        return faceRectTop;
    }

    public void setFaceRectTop(int faceRectTop) {
        this.faceRectTop = faceRectTop;
    }

    public int getFaceRectRight() {
        return faceRectRight;
    }

    public void setFaceRectRight(int faceRectRight) {
        this.faceRectRight = faceRectRight;
    }

    public int getFaceRectButtom() {
        return faceRectButtom;
    }

    public void setFaceRectButtom(int faceRectButtom) {
        this.faceRectButtom = faceRectButtom;
    }

    public int getFacePointCount() {
        return facePointCount;
    }

    public void setFacePointCount(int facePointCount) {
        this.facePointCount = facePointCount;
    }

    public int getFaceFeatureLen() {
        return faceFeatureLen;
    }

    public void setFaceFeatureLen(int faceFeatureLen) {
        this.faceFeatureLen = faceFeatureLen;
    }

    public int getFaceAttributeCount() {
        return faceAttributeCount;
    }

    public void setFaceAttributeCount(int faceAttributeCount) {
        this.faceAttributeCount = faceAttributeCount;
    }

    public float getFaceYaw() {
        return faceYaw;
    }

    public void setFaceYaw(float faceYaw) {
        this.faceYaw = faceYaw;
    }

    public float getFacePitch() {
        return facePitch;
    }

    public void setFacePitch(float facePitch) {
        this.facePitch = facePitch;
    }

    public float getFaceRoll() {
        return faceRoll;
    }

    public void setFaceRoll(float faceRoll) {
        this.faceRoll = faceRoll;
    }

    public float getFaceQuality() {
        return faceQuality;
    }

    public void setFaceQuality(float faceQuality) {
        this.faceQuality = faceQuality;
    }

    public MyPoint[] getArrFacePoint() {
        return arrFacePoint;
    }

    public void setArrFacePoint(MyPoint[] arrFacePoint) {
        this.arrFacePoint = arrFacePoint;
    }

    public byte[] getArrFaceFeature() {
        return arrFaceFeature;
    }

    public void setArrFaceFeature(byte[] arrFaceFeature) {
        this.arrFaceFeature = arrFaceFeature;
    }

    public FaceAttribute[] getArrFaceAttribute() {
        return arrFaceAttribute;
    }

    public void setArrFaceAttribute(FaceAttribute[] arrFaceAttribute) {
        this.arrFaceAttribute = arrFaceAttribute;
    }

    @Override
    public String toString() {
        return "FaceObject{" +
                "faceTrackId=" + faceTrackId +
                ", faceRectLeft=" + faceRectLeft +
                ", faceRectTop=" + faceRectTop +
                ", faceRectRight=" + faceRectRight +
                ", faceRectButtom=" + faceRectButtom +
                ", facePointCount=" + facePointCount +
                ", faceFeatureLen=" + faceFeatureLen +
                ", faceAttributeCount=" + faceAttributeCount +
                ", faceYaw=" + faceYaw +
                ", facePitch=" + facePitch +
                ", faceRoll=" + faceRoll +
                ", faceQuality=" + faceQuality +
                ", arrFacePoint=" + Arrays.toString(arrFacePoint) +
                ", \narrFaceFeature=" + Arrays.toString(arrFaceFeature) +
                ", \narrFaceAttribute=" + Arrays.toString(arrFaceAttribute) +
                "\n"+
                '}';
    }



}
