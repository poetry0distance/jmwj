package com.controller;

import com.entity.MovInfo;
import com.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: wangtao
 * Date: 2020/8/20
 *
 * @author false
 * Description:
 */
@RestController
public class CacheResultController {

    @Autowired
    private CacheService cacheService;
    @GetMapping("/cache")
    public List<MovInfo> cache(){
        return cacheService.list();
    }


    @GetMapping("/except")
    public void except(){
        try {
            cacheService.sysOut();
        }catch (Exception e){
            System.out.println("捕获异常");
        }
    }
}
