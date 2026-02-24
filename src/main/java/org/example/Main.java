package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("NORTH");
        Wall wall2 = new Wall("SOUTH");
        Wall wall3 = new Wall("EAST");
        Wall wall4 = new Wall("WEST");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE);

        Bed bed = new Bed("Double", 1, 1, 1, 2);
        Lamp lamp = new Lamp(LampType.NORMAL, true, 80);
        Wardrobe wardrobe = new Wardrobe(2, 50.0, 3);
        Carpet carpet = new Carpet(3, 5, PaintColor.RED);

        Bedroom bedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        bedroom.getCeiling().create();
        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}