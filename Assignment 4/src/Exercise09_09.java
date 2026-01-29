public class Exercise09_09 {
    public static void main(String[] args) {
        //Initializing Example Polygons
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.6);

        //Printing the Areas and Perimeters of all Example Polygons
        System.out.println("Example Polygon 1 Area: " + poly1.getArea());
        System.out.println("Example Polygon 1 Perimeter: " + poly1.getPerimeter());
        System.out.println("Example Polygon 2 Area: " + poly2.getArea());
        System.out.println("Example Polygon 2 Perimeter: " + poly2.getPerimeter());
        System.out.println("Example Polygon 3 Area: " + poly3.getArea());
        System.out.println("Example Polygon 3 Perimeter: " + poly3.getPerimeter());
    }
}
