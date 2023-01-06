package org.example.command.cuisine;

import org.example.command.cook.ICook;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */
public class JiangSuCuisine implements ICuisine {
    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    @Override
    public void cook() {
        cook.doCooking();
    }
}
