package com.prac.mediumPract;

public class RobotInABound {
    public static void main(String[] args) {
        String instruction = "GG";
        boolean res = findPathsOfRobot(instruction);
        System.out.println(res);
    }
    public static boolean findPathsOfRobot(String instruction){
        // north = 0, east = 1, south = 2, west = 3
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        // Initial position is in the center
        int x = 0, y = 0;
        // facing north
        int idx = 0;

       for (char i : instruction.toCharArray()) {
            if (i == 'L')
                idx = (idx + 3) % 4;
            else if (i == 'R')
                idx = (idx + 1) % 4;
            else {
                x += directions[idx][0];
                y += directions[idx][1];
            }
        }

        // after one cycle:
        // robot returns into initial position
        // or robot doesn't face north

        if ((x == 0 && y == 0) || (idx != 0)) return true;
        return false;
    }
}
