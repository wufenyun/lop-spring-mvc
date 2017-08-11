/**
 * Package: com.lop.demo.controller.user
 * Description: 
 */
package com.lop.demo.controller.user;

import com.lopframework.lop.annotation.ServiceProcessor;
import com.lopframework.lop.annotation.ServiceProcessorMethod;

/**
 * Description:  
 * Date: 2017年8月9日 下午3:09:46
 * @author wufenyun 
 */
@ServiceProcessor
public class LopController {
    
    @ServiceProcessorMethod(method = "api.hello", version = "1.0")
    public Object hello() {
        System.out.println("hello service call");
        return "hello";
    }
}
