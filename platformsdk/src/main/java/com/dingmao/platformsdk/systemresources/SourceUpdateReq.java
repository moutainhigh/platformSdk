package com.dingmao.platformsdk.systemresources;

/**
 * Create by atu on 2020/8/18
 */
public class SourceUpdateReq {
    private String source_value;//系统资源值
    private String source_no;//系统资源编码
    private String remark;//系统资源说明
    private String source_id;//资源表标识
    private String source_sort_id;//系统资源分类标识

    public String getSource_value() {
        return source_value;
    }

    public void setSource_value(String source_value) {
        this.source_value = source_value;
    }

    public String getSource_no() {
        return source_no;
    }

    public void setSource_no(String source_no) {
        this.source_no = source_no;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public String getSource_sort_id() {
        return source_sort_id;
    }

    public void setSource_sort_id(String source_sort_id) {
        this.source_sort_id = source_sort_id;
    }
}
