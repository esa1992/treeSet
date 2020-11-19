package com.myCompany;

import java.util.Comparator;

public class CustomComporator implements Comparator<FirstAidKit> {

    @Override
    public int compare(FirstAidKit o1, FirstAidKit o2) {
        return (int) (o1.getCoast() - o2.getCoast());
    }
}
