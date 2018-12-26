package com.test.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Designation:
 * @Author: Yuanlinzhu
 * @Date: 18-12-26 下午6:42
 * @Version: 1.0
 */

@Controller
@Slf4j
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		return  "test";
	}
}
