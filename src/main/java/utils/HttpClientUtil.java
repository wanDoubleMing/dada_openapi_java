package utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * DATE: 18/9/3
 *
 * @author: wan
 */
public class HttpClientUtil {

    private static final String UTF_8 = "UTF-8";

    private static final int TIME_OUT = 2000;

    /**
     * post 参数json字符串，返回String
     *
     * @param uri
     * @param jsonParams
     * @return
     */
    public static String postRequest(String uri, String jsonParams) {
        String output;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpPost postRequest = new HttpPost(uri);

            //设置超时时间。
            RequestConfig requestConfig = setRequestConfig();
            postRequest.setConfig(requestConfig);

            postRequest.setHeader("Content-Type", "application/json;charset=utf-8");
            StringEntity input = new StringEntity(jsonParams, UTF_8);
            postRequest.setEntity(input);

            HttpResponse response = httpClient.execute(postRequest);
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("POST调用异常 : " + response.getStatusLine().getStatusCode());
            }
            output = EntityUtils.toString(response.getEntity(), UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("POST调用异常", e);
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return output;
    }

    private static RequestConfig setRequestConfig(){
        return RequestConfig.custom().setSocketTimeout(TIME_OUT).setConnectTimeout(TIME_OUT).build();
    }
}
