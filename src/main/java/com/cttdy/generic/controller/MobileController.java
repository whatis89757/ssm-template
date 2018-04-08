package com.cttdy.generic.controller;

import com.cttdy.generic.dto.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MobileController {

    /**
     * 没有该请求是调用
     *
     * @return 错误信息
     */
    @RequestMapping("/client")
    @ResponseBody
    public Result<Void> resolveRequestError() {
        return new Result<>(1, null, "错误的请求路径!");
    }

}
