package com.lumor.design.pattern.prototype.simple;

import java.util.ArrayList;

/**
 * Created by Tom on 2018/3/7.
 */
public class CloneTest {

    public static void main(String[] args) {

        CloneTarget p = new CloneTarget();
        p.name = "Tom";
//        p.list = new ArrayList<CloneTarget>();
//        p.list.add(new CloneTarget());
        p.target = new CloneTarget();
        System.out.println(p.target);
        CloneTarget obj = null;
        try {
             obj =  (CloneTarget) p.clone();
            obj.name = "jim";
            System.out.println(obj.target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p.name);
        System.out.println(obj.name);

        System.out.println(p == obj);


    }
}
