package com.myCompany;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        /*
        аптечка должна содержать самые необходимые препараты,
        поскольку аптечка маленького размера, каждого препарата можно взять по 1шт
         */
        TreeSet<FirstAidKit> firstAidKitTreeSet = new TreeSet<>(new CustomComporator());

        firstAidKitTreeSet.add(new FirstAidKit("бинт", 10));
        firstAidKitTreeSet.add(new FirstAidKit("парацетомол", 15));
        firstAidKitTreeSet.add(new FirstAidKit("зеленка", 20));
        firstAidKitTreeSet.add(new FirstAidKit("жгут", 5));
        firstAidKitTreeSet.add(new FirstAidKit("спирт", 25));
        firstAidKitTreeSet.add(new FirstAidKit("валидол", 30));

        /*отсортируем по стоимости препаратов*/

        for (FirstAidKit f : firstAidKitTreeSet){
            System.out.println(f.getName());
        }

    }
}
