package com.plan.ModelTxt;


public class ModelTxt {
    String postName = null;
    String text = null;

    public ModelTxt(String postName, String text) {
        this.postName = postName;
        this.text = text;

    }

    public String getPostName() {
        return postName;
    }

    public String getText() {
        return text;
    }
}
