package cn.org.dududu.www.controller.consts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/" + ServiceController.DOMAIN)
public class ServiceController {

    public static final String DOMAIN = "service";

    @RequestMapping(ControllerConsts.URL_INDEX)
    public String index() {
        return DOMAIN + ControllerConsts.VIEW_INDEX;
    }

}
