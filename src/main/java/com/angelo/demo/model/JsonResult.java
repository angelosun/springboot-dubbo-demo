package com.angelo.demo.model;


import com.angelo.demo.model.enums.JsonResultCodeEnum;

/**
 * 返回前端数据格式
 */
public class JsonResult {

    private Integer code;
    private String msg;
    private Object data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static JsonResult createNewInstance(JsonResultCodeEnum codeEnum, String msg, Object data) {
        JsonResult result = new JsonResult();
        result.setCode(codeEnum.getValue());
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static JsonResult createSuccessResult(Object data) {
        return createNewInstance(JsonResultCodeEnum.SUCCESS, null, data);
    }

    public static JsonResult createSuccessResult(String msg) {
        return createNewInstance(JsonResultCodeEnum.SUCCESS, msg, null);
    }

    public static JsonResult createErrorResult(String msg) {
        return createNewInstance(JsonResultCodeEnum.FAIL, msg, null);
    }


}
