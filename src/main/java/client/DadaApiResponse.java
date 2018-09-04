package client;

import com.alibaba.fastjson.JSONObject;

/**
 * DATE: 18/9/3
 *
 * @author: wan
 */
public class DadaApiResponse {

    private static final int STATUS_CODE = -2;

    private final static String STATUS_MSG = "请求超时异常";

    private String status;

    private int code;

    private String msg;

    private Object result;

    public static DadaApiResponse except() {
        DadaApiResponse apiResponse = new DadaApiResponse();
        apiResponse.setCode(STATUS_CODE);
        apiResponse.setMsg(STATUS_MSG);
        return apiResponse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
