package com.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * User: wangtao
 * Date: 2020/7/29
 *
 * @author false
 * Description:
 */
@Data
public class MovInfo implements Serializable {

    private int movieNum;
    private String movieName;
    private String movieYear;
    private String movieCountry;
    private String movieType;
    private String movieDirector;
    private String movieAssess;
    private String movieScore;
    private String movieUrl;
    private String movieIntro;
}
