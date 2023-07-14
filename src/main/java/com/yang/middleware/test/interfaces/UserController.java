package com.yang.middleware.test.interfaces;

import com.yang.middleware.ratelimiter.annotation.DoRateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/14
 * @Copyright：
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    @DoRateLimiter(permitsPerSecond = 1, returnJSON = "{\"code\":\"1111\",\"info\":\"调用方法超过最大次数，限流返回！\"}")
    public UserInfo queryUserInfo(@RequestParam String userId) {
        logger.info("userId:{}", userId);
        return new UserInfo("灰灰："+userId, 24, "广东省广州番禺");
    }
}
