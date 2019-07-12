package com.company;

import com.company.constant.Color;
import com.company.constant.Food;
import com.company.constant.Indicator;
import com.company.constant.MyDay;

import java.util.EnumSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        EnumSet<MyDay> enumSet = EnumSet.allOf(MyDay.class);
        System.out.println(enumSet);

        Iterator<MyDay> iterator = enumSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("========");
        EnumSet<MyDay> enumSet2 = EnumSet.noneOf(MyDay.class);
        System.out.println(enumSet2);
        enumSet2.add(MyDay.MONDAY);
        System.out.println(enumSet2);

        System.out.println("========");
        EnumSet<MyDay> enumSet3 = EnumSet.of(MyDay.MONDAY);
        enumSet3.add(MyDay.MONDAY);
        System.out.println(enumSet3);

    }
}
