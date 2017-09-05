/**
 * Package: com.lop.demo.controller.user
 * Description: 
 */
package com.lop.demo.controller.user;

import com.lop.demo.service.user.entity.User;
import com.lopframework.config.annotation.ServiceMapping;
import com.lopframework.config.annotation.ServiceProcessor;

/**
 * Description:  
 * Date: 2017年8月9日 下午3:09:46
 * @author wufenyun 
 */
@ServiceProcessor
public class LopController {
    
    @ServiceMapping(method = "api.hello", version = "1.0")
    public Object hello(User user) throws InterruptedException {
        System.out.println("hello service call");
        System.out.println(user.getName());
        //Thread.sleep(2000);
        return "hello";
    }
}
