package com.prac.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class RobotInGrid {
    public static void main(String[] args) {
        boolean[][] maze ={{true, true, false},
                           {false, true, true},
                           {true, true, true},
                           {true, true, true}};

        ArrayList<Point> path = new ArrayList<>();
        path = getPath(maze);
        for (Point p : path){
            System.out.println(p.row + " " + p.col);
        }
    }
    public static ArrayList<Point> getPath(boolean[][] maze){
        if(maze.length == 0 || maze == null) return null;
        ArrayList<Point> path = new ArrayList<>();
        if(getPath(maze, maze.length - 1, maze[0].length - 1, path)){
            return path;
        }
        return null;
    }
    public static boolean getPath(boolean[][] maze, int row, int col, ArrayList<Point> path){
        if (row < 0 || col < 0 || !maze[row][col]) return false;
        boolean isAtOrigin = (row == 0) && (col == 0);
        if(isAtOrigin || getPath(maze, row, col - 1, path) || getPath(maze, row - 1, col, path)){
            Point p = new Point(row, col);
            path.add(p);
            return true;
        }
        return false;
    }
}
class Point{
    int row;
    int col;
    public Point(int row, int col){
        this.row = row;
        this.col = col;
    }
}
