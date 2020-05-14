package com.hang.cherry.model;

/**
 * bird
 *
 * @author Hang W
 */
public class LoyaltyItem {

    private double high;

    private double time;

    private String name;

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <T> T dto2Model(Class<T> clazz) {
        T model = null;

        try {
            if (clazz.isAssignableFrom(XItem.class)) {
                model = clazz.newInstance();
                XItem item = (XItem) model;
                item.setHigh(high);
                item.setTime(time);
                item.setName(name);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return model;
    }

    public static <T> T dto2Model(XItem xItem, Class<T> clazz) {
        T model = null;

        try {
            if (clazz.isAssignableFrom(LoyaltyItem.class)) {
                model = clazz.newInstance();
                LoyaltyItem item = (LoyaltyItem) model;
                item.setHigh(xItem.getHigh());
                item.setTime(xItem.getTime());
                item.setName(xItem.getName());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return model;
    }


}
