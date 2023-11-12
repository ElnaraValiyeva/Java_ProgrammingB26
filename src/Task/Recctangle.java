package Task;

public class Recctangle {
    private Double length;
    private Double width;

    public Recctangle(Double length,double width ){
        setLength(length);
        setWidth(width);

    }
    public void setLength(double length){
        if(length>0){
            this.length=length;
        }
    }
    public void setWidth(double width){
        if(width>0){
            this.width=width;
        }
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double calculateAre(){
        return length *width;
    }
    public double calculatePerimeters(){
        return 2*(length+width);
    }
    public String toString(){
        String str ="Rectangle info:";
        str += "\nLength: " + length;
        str+="\nWith: " + width;
        str+="\nCalculate Area: " + calculateAre();
        str+= "\nCalculate Parametr: " + calculatePerimeters();
        return str;
    }




}
