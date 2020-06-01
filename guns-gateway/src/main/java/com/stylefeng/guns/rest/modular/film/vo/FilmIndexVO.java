package com.stylefeng.guns.rest.modular.film.vo;

import com.huruilei.film.vo.BannerVO;
import com.huruilei.film.vo.FilmInfo;
import com.huruilei.film.vo.FilmVO;
import lombok.Data;

import java.util.List;

@Data
public class FilmIndexVO {

    private List<BannerVO> banners;
    private FilmVO hotFilms;
    private FilmVO soonFilms;
    private List<FilmInfo> boxRanking;
    private List<FilmInfo> expectRanking;
    private List<FilmInfo> top100;

}
