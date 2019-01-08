/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5;

/**
 *
 * @author Hieu Trung
 */
public abstract class MayMoc {

    String ten;
    String hang;
    int namSX;

    public abstract void move();

    public void inTT() {
        System.out.println("Info");
    }
}

class MayBay extends MayMoc {

    @Override
    public void inTT() {
        System.out.println("Info");
    }

    @Override
    public void move() {
        System.out.println("Máy bay thì bay cao! ");
    }
}

class Thuyen extends MayMoc {
    int trongTai;
    public void boi() {
        System.out.println("Swimming");
    }
    @Override
    public void move() {
        System.out.println("Thuyền thì bơi nhanh! ");
    }
}

class Main {
    public static void main(String[] args) {
        MayBay mb = new MayBay();
        mb.ten = "Boing 777";
        mb.hang = "Boing";
        mb.namSX = 2017;
        mb.inTT();
        mb.move();
        Thuyen t = new Thuyen();
        t.move();
        t.boi();
    }
}
