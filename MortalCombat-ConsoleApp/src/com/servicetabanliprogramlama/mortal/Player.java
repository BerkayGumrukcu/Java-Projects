package com.servicetabanliprogramlama.mortal;

import com.servicetabanliprogramlama.mortal.Silahlar.Yumruk;
import java.util.Random;

public class Player {

    private int healthPoint = 10;
    private Silah mySilah = new Yumruk();
    private int Score = 0;
    private String name = " Ad atanmadı";
    private double pAttack = 0.5;
    private double pDeffend = 0.5;
    private boolean isAlive = true;

    public int getHealthPoint() {
        return this.healthPoint;
    }

    private void setHealthPoint(int healthPoint) {
        if (healthPoint > 0) {
            this.healthPoint = healthPoint;
        } else {
            this.setAlive(false);
        }

    }

    public int getScore() {

        return this.Score;
    }

    public void setScore(int score) {
        this.Score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getpAttack() {
        return this.pAttack;
    }

    public void setpAttack(double pAttack) {
        this.pAttack = pAttack;
    }

    public double getpDeffend() {
        return this.pDeffend;
    }

    public void setpDeffend(double pDeffend) {
        this.pDeffend = pDeffend;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    private void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public Player(String name) {
        this.name = name;
        this.mySilah = new Yumruk();
    }

    public boolean Attack(Player p) {
        this.mySilah.Saldir();
        Random rnd = new Random();
        double deffendChance = rnd.nextDouble();
        if (this.pAttack < deffendChance) {
            return !p.Defend(this);
        } else {
            this.setHealthPoint(this.getHealthPoint() - 1);
            return false;
        }
    }

    public boolean Defend(Player p) {
        Random rnd = new Random();
        double deffendChance = rnd.nextDouble();
        if (this.pDeffend < deffendChance) {
            return true;
        } else {
            this.setHealthPoint(this.getHealthPoint() - 1);
            return false;
        }
    }

    public void setSilah(Silah s) {
        this.mySilah = s;
    }
}
