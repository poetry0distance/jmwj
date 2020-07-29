package com.feigns;

import com.vo.ReturnResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CONSUMER")
@SuppressWarnings("all")
public interface FeignServiceConsumer {

    /**
     * 调用consumer服务
     */

    @GetMapping(value = "/getInfoConsumer")
    ReturnResultVo getInfoConsumer();

    @GetMapping("/listForMov")
    ReturnResultVo listForMov();

}
