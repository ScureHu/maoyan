package com.huruilei.film.api;

import com.huruilei.film.vo.BannerVO;
import com.huruilei.film.vo.FilmInfo;
import com.huruilei.film.vo.FilmVO;

import java.util.List;

/**
 * @author: huruilei
 * @date: 2020/5/30
 * @description:
 * @return
 */
public interface FilmServiceApi {

    //获取banners
    List<BannerVO> getBanners();
    //获取热映影片
    FilmVO getHotFilmes(boolean isLimit,int nums);
    //获取即将上映影片
    FilmVO getSoonFilms(boolean isLimit,int nums);
    // 获取票房排行榜
    List<FilmInfo> getBoxRanking();
    // 获取人气排行榜
    List<FilmInfo> getExpectRanking();
    // 获取Top100
    List<FilmInfo> getTop();
}
