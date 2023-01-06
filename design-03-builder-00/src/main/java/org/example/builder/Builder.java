package org.example.builder;

import org.example.entity.ceiling.LevelOneCeiling;
import org.example.entity.ceiling.LevelTwoCeiling;
import org.example.entity.coat.DuluxCoat;
import org.example.entity.coat.LiBangCoat;
import org.example.entity.floor.ShengXiangFloor;
import org.example.entity.tile.DongPengTile;
import org.example.entity.tile.MarcoPoloTile;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/21
 */
public class Builder {

    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}
