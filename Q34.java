class circle{
    private int radius;
    private double area;
    final double PI=3.14;

    void setRadius(int radius){
            this.radius=radius;
    }

    void calculateArea(){
        area=2*PI*radius*radius;
    }

    void Display(){
        System.out.println("Area of circle "+area);
    }
}
class Q34{
    public static void main(String args[]) {
        circle a=new circle();
        a.setRadius(2);
        a.calculateArea();
        a.Display();
    }
}