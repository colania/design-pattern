package org.example.command.cuisine;

import org.example.command.cook.GuangDongCook;
import org.example.command.cook.ICook;

/**
 * @description:
 * @author：wwei
 * @date: 2022/12/27
 */
public class GuangDongCuisine implements ICuisine{
    private ICook guangDongCook;

    public GuangDongCuisine(ICook guangDongCook) {
        this.guangDongCook = guangDongCook;
    }

    @Override
    public void cook() {
        guangDongCook.doCooking();
    }
}
