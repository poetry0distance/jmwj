package com.controller;

import com.common.ReturnDate;
import com.entity.ServiceInfo;
import com.returnCode.ReturnCodeCommon;
import com.vo.ReturnResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * User: wangtao
 * Date: 2020/7/22
 *
 * @author false
 * Description:
 */
@RestController
@Slf4j
public class ConsumerOneController {

    @Value("${server.port}")
    private String PORT;

    @GetMapping(value = "/getInfoConsumer")
    public ReturnResultVo getInfoConsumer(){

        ReturnCodeCommon returnCodeCommon = new ReturnCodeCommon();
        ReturnResultVo returnResultVo = new ReturnResultVo();
        ServiceInfo serviceInfo = new ServiceInfo();
        serviceInfo.setPort(Integer.valueOf(PORT));
        serviceInfo.setServiceName("consumer-one");
        returnResultVo.setCode(returnCodeCommon.getSUCCESS_CODE());
        returnResultVo.setMsg(returnCodeCommon.getSUCCESS_MESSAGE());
        returnResultVo.setResult(serviceInfo);
        log.info("test consumer-one cli---> consumer");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnResultVo;
    }
}
