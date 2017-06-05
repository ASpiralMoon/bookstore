package org.bookstore.dto;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;

import java.util.List;

/**
 * @author 谈晟 cheng.tan@hand-china.com
 * @version 1.0
 * @description
 * @time 2017/6/4 15:10
 * @modify ...
 */
public class ResponseData<T> {

    private boolean success;
    private T data;
    private List<T> datas;
    private String info;

    public ResponseData(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public ResponseData(boolean success, List<T> datas) {
        this.success = success;
        this.datas = datas;
    }

    public ResponseData(boolean success, String info) {
        this.success = success;
        this.info = info;
    }

    public ResponseData(boolean success, T data, String info) {
        this.success = success;
        this.data = data;
        this.info = info;
    }

    public ResponseData(boolean success, List<T> datas, String info) {
        this.success = success;
        this.datas = datas;
        this.info = info;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "success=" + success +
                ", data=" + data +
                ", datas=" + datas +
                ", info='" + info + '\'' +
                '}';
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
