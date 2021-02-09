package com.restfulapi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

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


//    @GetMapping
//    public List<TvSeriesDto> getAll(){
//
//        if(log.isTraceEnabled()){
//            log.trace("getAll(); trace USED");
//        }
//
//        List<TvSeriesDto> list = new ArrayList<>();
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2016,10,2,0,0,0);
//        list.add(new TvSeriesDto(1,"WestWorld", 1, calendar.getTime()));
//        calendar.set(2012,5,22,0,0,0);
//        list.add(new TvSeriesDto(2,"Person of Internet", 5, calendar.getTime()));
//        return list;
//    }

    @GetMapping
    public List<TvSeriesDto> getAll() {
        List<TvSeriesDto> list = new ArrayList<>();
        list.add(createWestWorld());
        list.add(createPoi());
        return list;
    }


    @GetMapping("/{id}")
    public TvSeriesDto getOne(@PathVariable int id) {
        if(log.isTraceEnabled()){
            log.trace("getOne"+id);
        }
        if (id == 101) {
            return createWestWorld();
        } else if (id == 102) {
            return createPoi();
        } else {
            throw new ResourceNotFoundException();
        }
    }

    @PostMapping
    public TvSeriesDto insertOne(@RequestBody TvSeriesDto tvSeriesDto){
        if(log.isTraceEnabled()){
            log.trace("insert vtSeriesDto" +tvSeriesDto);
        }

        tvSeriesDto.setId(9999);
        return tvSeriesDto;


    }




    private TvSeriesDto createPoi() {
        Calendar c = Calendar.getInstance();
        c.set(2011, Calendar.SEPTEMBER, 22, 0, 0, 0);
        return new TvSeriesDto(102, "Person of Interset", 5, c.getTime());
    }

    private TvSeriesDto createWestWorld() {
        Calendar c = Calendar.getInstance();
        c.set(2016, Calendar.OCTOBER, 2, 0, 0, 0);
        return new TvSeriesDto(101, "West World", 1, c.getTime());
    }

}
