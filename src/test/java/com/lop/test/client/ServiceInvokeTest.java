/**
 * Package: com.lop.client.demo
 * Description: 
 */
package com.lop.test.client;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Description:  
 * Date: 2017年8月11日 上午9:14:04
 * @author wufenyun 
 */
public class ServiceInvokeTest {
    
    String url = "http://localhost/router";
    LopClient lopClient = new LopClient();
    
    @Test
    public void test() {
        Map<String,Object> param = new HashMap<>();
        param.put("method", "api.hello");
        param.put("appkey", "00001");
        param.put("version", "1.0");
        param.put("name", "tomson");
        param.put("age", "11");
        param.put("locale", "en");
        lopClient.post(url, param);
    }
    
    @Test
    public void test2() {
        User user = new User("five","20");
        lopClient.post(url, user);
    }
    
    
    class User{
        private String name;
        private String age;
        public User(String name,String age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
    }
}
