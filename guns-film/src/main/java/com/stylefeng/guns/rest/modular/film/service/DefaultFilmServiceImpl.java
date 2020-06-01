package com.stylefeng.guns.rest.modular.film.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.huruilei.film.api.FilmServiceApi;
import com.huruilei.film.vo.BannerVO;
import com.huruilei.film.vo.FilmInfo;
import com.huruilei.film.vo.FilmVO;
import com.stylefeng.guns.rest.common.persistence.dao.MoocBannerTMapper;
import com.stylefeng.guns.rest.common.persistence.model.MoocBannerT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.ws.soap.Addressing;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: huruilei
 * @date: 2020/5/30
 * @description:
 * @return
 */
@Component
@Service(interfaceClass = FilmServiceApi.class)
public class DefaultFilmServiceImpl implements FilmServiceApi {

    @Autowired
    private MoocBannerTMapper bannerTMapper;

    /**
     * 获取轮播图
     * @return
     */
    @Override
    public List<BannerVO> getBanners() {
        List<BannerVO> bannerVOList = new ArrayList<>();
        List<MoocBannerT> bannerList = bannerTMapper.selectList(null);
        for (MoocBannerT banner : bannerList) {
            BannerVO bannerVO = new BannerVO();
            bannerVO.setBannerId(""+banner.getUuid());
            bannerVO.setBannerAddress(banner.getBannerAddress());
            bannerVO.setBannerUrl(banner.getBannerUrl());
            bannerVOList.add(bannerVO);
        }
        return bannerVOList;
    }

    @Override
    public FilmVO getHotFilmes(boolean isLimit, int nums) {
        FilmVO filmVO = new FilmVO();
        return null;
    }

    @Override
    public FilmVO getSoonFilms(boolean isLimit, int nums) {
        return null;
    }

    @Override
    public List<FilmInfo> getBoxRanking() {
        return null;
    }

    @Override
    public List<FilmInfo> getExpectRanking() {
        return null;
    }

    @Override
    public List<FilmInfo> getTop() {
        return null;
    }
}
