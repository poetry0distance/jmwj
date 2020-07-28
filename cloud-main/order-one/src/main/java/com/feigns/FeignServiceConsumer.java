package com.feigns;

import com.vo.ReturnResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CONSUMER")
public interface FeignServiceConsumer {

    /**
     * 调用consumer服务
     */

    @SuppressWarnings("all")
    @GetMapping(value = "/getInfoConsumer")
    ReturnResultVo getInfoConsumer();
}
