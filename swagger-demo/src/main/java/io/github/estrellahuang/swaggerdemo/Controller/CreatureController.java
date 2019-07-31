package io.github.estrellahuang.swaggerdemo.Controller;

import io.github.estrellahuang.swaggerdemo.pojo.Creature;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * swagger测试类
 *
 * @author Huang Yuxin
 * @date 2019-07-30
 */
@RestController
@RequestMapping(value = "/testWithoutDatabase")
public class CreatureController {

    @ApiOperation(value = "根据生物id查询生物", notes = "")
    @ApiImplicitParam(name = "id", value = "生物id", required = true, dataType = "Long")
    @GetMapping("creatures/{id}")
    public Object queryCreatureById(@PathVariable Long id) {
        return "查询生物" + id;
    }

    @ApiOperation(value = "查询所有生物", notes = "根据传入的属性查询生物，属性可不填写")
    @ApiImplicitParam(name = "creature", value = "生物类", required = false, dataType = "Creature")
    @GetMapping("creatures")
    public Object queryAllCreatures(@RequestBody(required = false) Creature creature) {
        return "查询所有生物";
    }

    @ApiOperation(value = "创建生物", notes = "创建生物")
    @ApiImplicitParam(name = "creature", value = "生物类", required = true, dataType = "Creature")
    @PostMapping("/creatures")
    public Object addCreature(@RequestBody Creature creature) {
        return "新增生物一个:" + creature.toString();
    }

    @ApiOperation(value = "删除生物", notes = "根据生物id删除生物")
    @ApiImplicitParam(name = "id", value = "生物id", required = true, dataType = "Long")
    @DeleteMapping("/creatures/{id}")
    public Object deleteCreature(@PathVariable Long id) {
        return "删除生物一个:" + id;
    }

    @ApiOperation(value = "更新生物", notes = "更新生物")
    @ApiImplicitParam(name = "creature", value = "生物类", required = true, dataType = "Creature")
    @PutMapping("/creatures")
    public Object updateCreature(@RequestBody Creature creature) {
        return "更新生物:" + creature.toString();
    }

}
