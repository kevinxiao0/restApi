package com.restfulapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TvSeriesDto {
    private int id;
    private String name;
    private int seasonCount;
    private Date originRelease;

//    public TvSeriesDto() {
//    }
//
//    public TvSeriesDto(int id, String neme, int seasonCount, Date originRelease) {
//        this.id = id;
//        this.name = neme;
//        this.seasonCount = seasonCount;
//        this.originRelease = originRelease;
//    }


}
