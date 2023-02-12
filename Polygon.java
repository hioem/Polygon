import java.text.DecimalFormat;

/**
 * @file Polygon.java
 * @date 2/5/2023
 * @author Matthew Hioe
 *
 * @description This will take the method the sides, length of the sides, and the name of the shape
 */
public class Polygon { //make public for CS A

    //instance variables
    private int sides;
    private double length;
    private String shape;
    private double area;
    private double perimeter;

    //default constructor (make public for CS A)
    public Polygon(){
        sides = 3;
        length = 1.0;
        shape = "Triangle";
        perimeter = 3.0;
        area = 0.433;
    }

    //overloaded constructor (with parameters)

    /**
     * Creates a Polygon object with specified sides and length with the name. 
     *
     * @param s is the amount of sides in the polygon
     * @param l is the length of each side
     * @param shapes is the shape name of the polygon
     */
    public Polygon(int s, double l, String shapes){
        sides = 3;
        length = 1.0;
        if(s >= 3 && l>1.0) {
            sides = s;
            length = l;
            calculatePerimeter();
            calculateArea();
            shape = shapes;
        }
        else if(s<3 || l<1.0){
            System.out.println("Not a polygon");
            shape = "Triangle";
            calculateArea();
        }
        else {
        }

    }

    public Polygon(int sides){
        this.sides = sides;
    }

    //accessors

    /**
     *
     * @return the amount of sides in the polygon
     */
    public double getNumSides(){
        return sides;
    }

    /**
     *
     * @return the length of each side in the polygon
     */
    public double getSideLength(){
        return length;
    }

    /**
     *
     * @return the area of the triangle
     */
    public double getArea() {
        if(sides >= 3 && length>1.0) {
            double area = Math.round((sides * (length * length)) / (4.0 * Math.tan((Math.PI / sides)))*1000);
            area /= 1000.0;
            return area;
        }
        else{}{
            return area;
        }

    }
    /**
     *
     * @return the name of the shape
     */
    public String getShapeType(){
        return shape;
    }
    public double calculatePerimeter(){
        perimeter = Math.round(length * sides * 1000);
        perimeter /= 1000.0;
        return perimeter;
    }
    public double calculateArea() {
        double area = Math.round((sides * (length * length)) / (4.0 * Math.tan((Math.PI / sides)))*1000);
        area /= 1000.0;
        return area;
    }


    //mutators

    /**
     * Allows the user to change the sides of the Polygon.
     *
     * @param newSides desired sides
     */
    public void setNumSides(int newSides){
        if (newSides>=3) {
            sides = newSides;
        }
        else{}
    }
    /**
     * Allows the user to change the lengths of each side in the Polygon.
     *
     * @param newLength desired length
     */
    public void setSideLength(double newLength){
        if(newLength>=1.0) {
            length = newLength;
        }
        else{

        }
    }
    /**
     * Allows the user to change the name of the Polygon.
     *
     * @param newShape desired sides
     */
    public void setShapeName(String newShape){
        shape = newShape;
    }



    //toString method

    /**
     *  Prints the amount of sides, the name of the polygon, and the length of each side
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.###");
        return "There are " + sides +
                " sides, each with a length of " + df.format(length) + ", meaning this shape is a " + shape + "!"+ "\n" +
                "With a perimeter of "+ df.format(perimeter) + " and the area of " + df.format(perimeter) + " !";

    }

}
