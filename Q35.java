class MathOperation{
    static int add(int i,int j){
        return i+j;
    }
    static int subtract(int i,int j){
        return i-j;
    }
    static int multiply(int i,int j){
        return i*j;
    }
    static double power(int i,int j){
        return Math.pow(i,j);
    }
    static void display(int res){
        System.out.println(res);
    }
}

class Q35{
    public static void main(String [] args) {
      int add= MathOperation.add(2,3);
       MathOperation.display(add);   
       int sub= MathOperation.subtract(2,3);
       MathOperation.display(sub);
       int multi= MathOperation.multiply(2,3);
       MathOperation.display(multi);
      int power=(int) MathOperation.power(2,3);
       MathOperation.display(power);
    }
}