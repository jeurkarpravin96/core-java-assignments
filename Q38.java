import java.text.DecimalFormat;
class Employee{
    DecimalFormat df=new DecimalFormat("##.##");
   static int empNo=0;
   static private double salary;
    private double totalSalary;
   static double sum=0;
   // static int auto=1;
  Employee(double salary){
      this.salary=salary;
      empNo++;
  }

 static  double totalSalary(){
      sum=sum+salary;
      return sum;
  }

  void display(double res){
       System.out.println("total salary of employess is "+df.format(res)+"\n"+"No. of Employees "+empNo);
  }

}

class Q38{
    public static void main(String args[]) {
        
        Employee e=new Employee(2004.24);
         e.totalSalary();
       // e.display(a);

        Employee e1=new Employee(20100);
        e1.totalSalary();
      //  e.display(a);

        Employee e2=new Employee(23000);
        double a= e2.totalSalary();
        e2.display(a);
    }
}