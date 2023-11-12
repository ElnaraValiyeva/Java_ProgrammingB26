package Task;

public class Square {
    /*


        - encapsulate the Square class

        	- setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Square

            - calculatePerimeter()
  				calculate and return the perimeter of a Square

            - toString()
                print the side, area, and perimeter of the Square object

     */

    private double side;// instance variable

    public Square(double side){
        this.side=side;
        setSide(side);
        //setter method.
    }
    public void setSide(double side){
        if(side>0){
            this.side=side;
        }
    }
    //getter method
    public double getSide(){
        return side;
    }
    //Instance method
    public double calculateArea(double are){
        side=are*side;
        return side;
    }
    public double calculatePerimeter(double area){
        side=area*side;
        return side;
    }

    @Override
    public String toString() {
        return "Square Side: " + "side= "+ side;
    }

    }



