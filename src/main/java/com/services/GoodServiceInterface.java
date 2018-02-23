package com.services;

import com.users.Good;
import com.users.SizeEnum;

import java.awt.*;
import java.util.List;

public interface GoodServiceInterface {

    void addGood(Good good);
    void updateGood(long id, Good good);
    void deleteGood(long id);
    List<Good> getGoodsByPrice(long from, long to);
    List<Good> getGoodsBySize(List<SizeEnum> sizeList);
    List<Good> getGoodsByColor(List<Color> colorList);
}
