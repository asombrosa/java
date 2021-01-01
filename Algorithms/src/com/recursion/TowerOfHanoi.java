package com.recursion;

public class TowerOfHanoi {
    public void move(int numberOfDisks, char startingDisk, char endingDisk, char intermediaryDisk) {
        if (numberOfDisks == 0) {
            return;
        }
        move(numberOfDisks - 1, startingDisk, intermediaryDisk, endingDisk);
        System.out.println("Moving Disk " + numberOfDisks + " from " + startingDisk + " to " + endingDisk);
        move(numberOfDisks - 1, intermediaryDisk, endingDisk, startingDisk);
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.move(3, 'A', 'C', 'B');
    }
}
