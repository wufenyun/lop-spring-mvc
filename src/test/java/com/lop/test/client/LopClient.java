/**
 * Package: com.lop.client.demo.util
 * Description: 
 */
package com.lop.test.client;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Description:  
 * Date: 2017年8月11日 下午1:54:56
 * @author wufenyun 
 */
public class LopClient {
    
    private OkHttpClient client = new OkHttpClient();
    
    public void post(String url,Map<String,Object> map) {
        FormBody.Builder builder = new FormBody.Builder();
        if (null != map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {

                System.out.println("Key = " + entry.getKey() + ", Value = "
                        + entry.getValue());
                builder.add(entry.getKey(), entry.getValue().toString());

            }
        }

        RequestBody body = builder.build();
        Request request = new Request.Builder().url(url).post(body).build();
        try {
            Response resp = client.newCall(request).execute();
            ResponseBody obj= resp.body();
            Reader reader = obj.charStream();
            int n;
            CharBuffer target = CharBuffer.allocate(1024);
            while((n=reader.read(target))!=-1) {
                target.flip();
                System.out.println(target);
            }
            System.out.println(obj.contentType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void post(String url,Object data) {
        MediaType type = MediaType.parse("application/json;charset=utf-8");
        String content = JSON.toJSONString(data);
        RequestBody body = RequestBody.create(type, content);
        Request request = new Request.Builder().url(url).post(body).build();
        try {
            client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
