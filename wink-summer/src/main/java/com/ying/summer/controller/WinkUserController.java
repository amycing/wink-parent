package com.ying.summer.controller;



import com.ying.summer.entity.WinkUser;
import com.ying.summer.service.IWinkUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ying
 * @since 2020-04-21
 */
@RestController
@RequestMapping("/summer/winkUser")
public class WinkUserController {
    @Autowired
    private IWinkUserService winkUserServiceImpl;
    @GetMapping("/appMenus")
    @ApiOperation("获取应用菜单")
    public List<WinkUser> appMenus(){
        List<WinkUser> list = winkUserServiceImpl.list();
        return list;
    }


}

