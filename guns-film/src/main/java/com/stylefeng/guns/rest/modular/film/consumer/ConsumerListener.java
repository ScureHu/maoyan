package com.stylefeng.guns.rest.modular.film.consumer;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author: huruilei
 * @date: 2020/6/1
 * @description:
 * @return
 */
@Component
public class ConsumerListener {

    @KafkaListener(topics = "demo")
    public void listen(ConsumerRecord<?, ?> record){
        System.out.printf("topic is %s, offset is %d, value is %s \n", record.topic(), record.offset(), record.value());
    }


    @KafkaListener(topics = "demo2")
    public void listen2(ConsumerRecord<?, ?> record){
        JSONObject object = JSONObject.parseObject(record.value().toString());

        System.out.printf("topic is %s, offset is %d, value is %s \n", record.topic(), record.offset(), "k="+object.getString("mainImg"));
    }
}
