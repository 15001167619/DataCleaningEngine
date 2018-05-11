package com.binggou.engine.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 武海升
 * @version 2.0
 * @description
 * @date 2018-05-11 15:44
 */
@Controller
public class DataEngineController {

    @RequestMapping("{url}.shtml")
    public String page(@PathVariable("url") String url) {
        return  url;
    }

    @RequestMapping("{module}/{url}.shtml")
    public String page(@PathVariable("module") String module,@PathVariable("url") String url) {
        return module + "/" + url;
    }

}
