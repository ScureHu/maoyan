package com.stylefeng.guns.rest.modular.film.vo;

import com.huruilei.film.vo.CatVO;
import com.huruilei.film.vo.SourceVO;
import com.huruilei.film.vo.YearVO;
import lombok.Data;

import java.util.List;

@Data
public class FilmConditionVO {

    private List<CatVO> catInfo;
    private List<SourceVO> sourceInfo;
    private List<YearVO> yearInfo;

}
