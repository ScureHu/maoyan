package com.stylefeng.guns.rest.modular.film;

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
    /**
     * 背景：传入购票数量、传入购买座位、影厅编号
     * 业务：
     *      1、判断传入的座位是否存在
     *      2、查询过往订单，判断座位是否已售
     *      3、新增订单
     * 逻辑：
     *      1、新增一条订单
     *      2、判断座位是否存在 & 是否已售
     *      3、一条为假，则修改订单为无效状态
     */

}
