package com.lyhm.lyhmaicode.controller;

import com.lyhm.lyhmaicode.common.BaseResponse;
import com.lyhm.lyhmaicode.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//表示需要返回json格式的数据给用户
@RequestMapping("/health") //表示这是门牌号 health健康接口
public class HealthController {

//    @GetMapping("/") //表示获取health路径下的数据
//    public String health(){
//        return "ok!";
//    }

    @GetMapping("/")
    public BaseResponse<String> healthCheck(){
        return ResultUtils.success("ok");
    }

}
