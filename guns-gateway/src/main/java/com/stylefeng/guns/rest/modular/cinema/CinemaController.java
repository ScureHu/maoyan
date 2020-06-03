package com.stylefeng.guns.rest.modular.cinema;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huruilei.cinema.api.CinemaServiceApi;
import com.huruilei.cinema.vo.CinemaQueryVO;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huruilei
 * @date: 2020/6/2
 * @description:
 * @return
 */
@RestController
@RequestMapping("/cinema/")
public class CinemaController {

    @Reference(interfaceClass = CinemaServiceApi.class)
    private CinemaServiceApi cinemaServiceApi;

    @RequestMapping(value = "getCinemas")
    public ResponseVO getCinemas(CinemaQueryVO cinemaQueryVO){
        return null;
    }

    @RequestMapping(value = "getCondition")
    public ResponseVO getCondition(CinemaQueryVO cinemaQueryVO){
        return null;
    }

    @RequestMapping(value = "getFields")
    public ResponseVO getFields(Integer cinemaId){
        return null;
    }

    @PostMapping(value = "getFieldInfo")
    public ResponseVO getFieldInfo(Integer cinemaId,Integer fiedldId){
        return null;
    }
}
