package ru.bg.task.circle;

import org.junit.jupiter.api.Test;
import ru.bg.task.TestUtilsGenerator;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CircleTest {
    @Test
    public void buildCircleInPxTest() {
        Circle circle = TestUtilsGenerator.generateCircle(100, 100, 1);
        List<Point> points = circle.buildCircleInPx(300);
        assertEquals(361, points.size());
        assertEquals(159.0, points.get(0).getX());
        assertEquals(100.0, points.get(0).getY());
        assertEquals(44.0, points.get(200).getX());
        assertEquals(79.0, points.get(200).getY());
        assertEquals(159.0, points.get(360).getX());
        assertEquals(99.0, points.get(360).getY());
    }
}
