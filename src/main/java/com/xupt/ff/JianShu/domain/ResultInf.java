package com.xupt.ff.JianShu.domain;

import java.util.Arrays;

/**
 * @author cc_ff
 * @creat 2019-12-2019/12/10-17:31
 */
public class ResultInf {

    private boolean flag;
    private String result;
    private Object [] objects;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "ResultInf{" +
                "flag=" + flag +
                ", result='" + result + '\'' +
                ", objects=" + Arrays.toString(objects) +
                '}';
    }
}
