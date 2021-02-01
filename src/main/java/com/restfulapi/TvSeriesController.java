package com.restfulapi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {

    //test hello world
//    @GetMapping
//    public Map<String, Object> sayHello(){
//        Map<String, Object> result = new HashMap<>();
//        result.put("message", "hello, world");
//        return result;
//    }


    private static final Log log = LogFactory.getLog(TvSeriesController.class);



    @GetMapping
    public List<TvSeriesDto> getAll(){

        if(log.isTraceEnabled()){
            log.trace("getAll(); USED");
        }

        List<TvSeriesDto> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,10,2,0,0,0);
        list.add(new TvSeriesDto(1,"WestWorld", 1, calendar.getTime()));
        calendar.set(2012,5,22,0,0,0);
        list.add(new TvSeriesDto(2,"Person of Internet", 5, calendar.getTime()));
        return list;
    }

}
