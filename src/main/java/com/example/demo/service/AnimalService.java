package com.example.demo.service;

import com.example.demo.designPatternType.AnimalFactory;
import com.example.demo.weatherInterface.Animal;

/**
 * @desc:
 * @author: wangyaoyao
 * @date: 2020/10/14 10:58
 */
public class AnimalService {

    AnimalFactory factory = new AnimalFactory();

    public void speak(String name){
        Animal animal = factory.create(name);
        animal.speak();
    }

    public static void main(String[] args) {
        new AnimalService().speak("dog");
    }
}
