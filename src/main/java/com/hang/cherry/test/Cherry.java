package com.hang.cherry.test;

import com.hang.cherry.model.Animal;
import com.hang.cherry.model.Cat;
import com.hang.cherry.model.LoyaltyItem;
import com.hang.cherry.model.XItem;

/**
 * Test
 *
 * @author Hang W
 */
public class Cherry {

    public static void main(String[] args) {

        boolean flag = Animal.class.isAssignableFrom(Cat.class);
        System.out.println("flag:" + flag);

        boolean flag2 = Animal.class.isAssignableFrom(Animal.class);
        System.out.println("flag2:" + flag2);

        boolean flag3 = Cat.class.isAssignableFrom(Animal.class);
        System.out.println("flag3:" + flag3);

        System.out.println("----------------------------------------------------------------------");

        boolean flag4 = XItem.class.isAssignableFrom(LoyaltyItem.class);
        System.out.println("flag4:" + flag4);

        boolean flag5 = LoyaltyItem.class.isAssignableFrom(XItem.class);
        System.out.println("flag5:" + flag5);

        System.out.println("----------------------------------------------------------------------");

        LoyaltyItem loyaltyItem = new LoyaltyItem();
        loyaltyItem.setHigh(1.78);
        loyaltyItem.setTime(3.14);
        loyaltyItem.setName("Hang");

        setXItem(loyaltyItem);

        System.out.println("----------------------------------------------------------------------");

        XItem xItem = new XItem();
        xItem.setHigh(1.789);
        xItem.setTime(3.145);
        xItem.setName("Wang");

        setLoyaltyItem(xItem);

    }

    private static void setLoyaltyItem(XItem xItem) {

        LoyaltyItem loyaltyItem = LoyaltyItem.dto2Model(xItem, LoyaltyItem.class);

        double high = loyaltyItem.getHigh();
        double time = loyaltyItem.getTime();
        String name = loyaltyItem.getName();
        System.out.println(high + "---" + time + "---" + name);
    }

    private static void setXItem(LoyaltyItem loyaltyItem) {

        XItem xitem = loyaltyItem.dto2Model(XItem.class);

        double high = xitem.getHigh();
        double time = xitem.getTime();
        String name = xitem.getName();
        System.out.println(high + "---" + time + "---" + name);
    }

}
