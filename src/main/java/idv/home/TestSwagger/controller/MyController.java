package idv.home.TestSwagger.controller;

import idv.home.TestSwagger.bean.Animal;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "測試 Controller")
public class MyController {
    @GetMapping("/test")
    @ApiOperation(value = "測試1", notes = "我是測試1")
    public String test1(@RequestParam Integer id, String name) {
        return id + name;
    }

    @PostMapping("/testBody")
    public String test2(@RequestBody Animal animal) {
        return animal.getAge() + "=" + animal.getName();
    }

    @PostMapping("/test3")
    public String nonInstance(@ApiParam(name = "name的名字", value = "description的名字") @RequestBody Animal animal) {
        return animal.getName();
    }

    @ApiResponses({
            @ApiResponse(code = 200, message = "哈哈！成功了"),
            @ApiResponse(code = 404, message = "沒找到網頁哦！")
    })
    @GetMapping("/test4")
    public String testResponse(Integer id, String name) {
        return id + name;
    }
}
