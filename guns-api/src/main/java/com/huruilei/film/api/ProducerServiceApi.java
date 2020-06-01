package com.huruilei.film.api;

import com.huruilei.film.vo.ImgVO;

/**
 * @author: huruilei
 * @date: 2020/6/1
 * @description:
 * @return
 */
public interface ProducerServiceApi {
    //发送普通信息
    public void send(String msg);

    //发送实体
    public void sendPojo(ImgVO imgVO);
}
