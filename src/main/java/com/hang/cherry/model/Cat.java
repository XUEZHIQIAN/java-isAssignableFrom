package com.hang.cherry.model;

/**
 * cat
 *
 * @author Hang W
 */
public class Cat extends Animal {

    public <T> T dto2Model(Class<T> clazz) {
        T model = null;

        try {
            if (clazz.isAssignableFrom(Cat.class)) {
                model = clazz.newInstance();
                Cat cat = (Cat) model;
                cat.setName(super.getName());
                cat.setAge(super.getAge());
                cat.setWeight(super.getWeight());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return model;
    }
}
