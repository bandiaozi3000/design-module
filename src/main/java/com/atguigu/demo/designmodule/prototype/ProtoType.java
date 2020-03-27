package com.atguigu.demo.designmodule.prototype;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class ProtoType implements Cloneable {

    private Integer fileid;

    private String filename;

    private Map<String,Double> scores;

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }

    @Override
    protected ProtoType clone() throws CloneNotSupportedException {
        ProtoType protoType = (ProtoType)super.clone();
        protoType.scores = (Map<String,Double>)((HashMap)this.scores).clone();
        return protoType;
    }
}
