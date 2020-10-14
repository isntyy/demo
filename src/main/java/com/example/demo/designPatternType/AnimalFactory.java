package com.example.demo.designPatternType;

import com.example.demo.weatherInterface.Animal;
import com.example.demo.weatherInterface.Cat;
import com.example.demo.weatherInterface.Dog;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 10:54
 */
public class AnimalFactory {

    public Animal create(String name){
        if("cat".equals(name)){
            return new Cat();
        }else if ("dog".equals(name)){
            return new Dog();
        }else {
            return null;
        }
    }
}
