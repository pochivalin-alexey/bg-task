package ru.bg.task.circle;

import java.util.ArrayList;
import java.util.List;

public class Circle {
    private Point center;
    private int d;

    public Circle(Point center, int d) {
        this.center = center;
        this.d = d;
    }

/**
 * Получить точки окружности для отрисовки в пикселях
 * @param dpi - разрешение (точек на дюйм)
 * @return points - список точек, содержащих координаты в пикселях
 **/
    public List<Point> buildCircleInPx(int dpi) {
        List<Point> points = new ArrayList<>();
        double mpi = dpi * 0.393700787401575;
        double radius = this.d * mpi / 2;
        for (int i = 0; i <= 360; i++) {
            int x = (int) (this.center.getX() + radius * Math.cos(Math.toRadians(i)));
            int y = (int) (this.center.getY() + radius * Math.sin(Math.toRadians(i)));
            Point point = new Point(x, y);
            points.add(point);
        }
        return points;
    }
}
