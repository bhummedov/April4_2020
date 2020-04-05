package Polygon;

public interface Polygons {
    int calculatePerimeter(int edge);
}

    class Square implements Polygons {
        public int calculatePerimeter(int edge) {
            return edge*4;
        }
    }

    class Triange implements Polygons {
        public int calculatePerimeter(int edge) {
            return edge*3;
        }
    }
