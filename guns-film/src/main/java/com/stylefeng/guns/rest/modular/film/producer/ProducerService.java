package com.stylefeng.guns.rest.modular.film.producer;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.huruilei.film.api.ProducerServiceApi;
import com.huruilei.film.vo.ImgVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author: huruilei
 * @date: 2020/6/1
 * @description:
 * @return
 */
@Component
@Service(interfaceClass = ProducerServiceApi.class)
public class ProducerService implements ProducerServiceApi {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    public void send(String msg){
        kafkaTemplate.send("demo",msg);
    }

    public void sendPojo(ImgVO imgVO){
        kafkaTemplate.send("demo2", JSONObject.toJSONString(imgVO));
    }
}
