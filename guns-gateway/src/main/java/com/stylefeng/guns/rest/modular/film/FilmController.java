package com.stylefeng.guns.rest.modular.film;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huruilei.film.api.ProducerServiceApi;
import com.huruilei.film.vo.ImgVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huruilei
 * @date: 2020/5/30
 * @description:
 * @return
 */
@RestController
@RequestMapping("/film/")
public class FilmController {

    @Reference(interfaceClass = ProducerServiceApi.class)
    private ProducerServiceApi producerServiceApi;

    @GetMapping(value = "msg/{name}")
    public String send(@PathVariable(name = "name") String msg){
        producerServiceApi.send(msg);
        return "SUCCESS";
    }


    @GetMapping(value = "pojo")
    public String sendPojo(){
        ImgVO imgVO = new ImgVO();
        imgVO.setImg01("123");
        imgVO.setImg02("123555");
        imgVO.setImg03("12344");
        imgVO.setImg04("ceshi");
        imgVO.setMainImg("123123ddddd");
        producerServiceApi.sendPojo(imgVO);
        return "SUCCESS";
    }
}
