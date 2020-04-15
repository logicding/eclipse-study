package com.example.lib;



public class FaceAttribute
{
    private String strName;
    private String strLabel;
    private float fLabel;
    private float score;

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrLabel() {
        return strLabel;
    }

    public void setStrLabel(String strLabel) {
        this.strLabel = strLabel;
    }

    public float getfLabel() {
        return fLabel;
    }

    public void setfLabel(float fLabel) {
        this.fLabel = fLabel;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FaceAttribute{" +
                "strName='" + strName + '\'' +
                ", strLabel='" + strLabel + '\'' +
                ", fLabel=" + fLabel +
                ", score=" + score +
                '}';
    }
}
