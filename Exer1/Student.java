package Exer1;

public class Student
 {
    String name;
    int roll;
    int age;
    double grade;
    //default constructor
    Student()
    {
        this.name="Unknown";
        this.roll=0;
        this.age=0;
        this.grade=0.0;
    }
    //parameterized constructor
    Student(String nm,int rl,int ag,double gd)
    {
        this.name=nm;
        this.roll=rl;
        this.age=ag;
        this.grade=gd;
    }
    //getter and setter method
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getRoll()
    {
        return roll;
    }
    public void setRoll(int roll)
    {
        this.roll=roll;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public double getGrade()
    {
        return grade;
    }
    public void setGrade(double grade)
    {
        this.grade=grade;
    }
    public void toDisplayInfo()
    {
        System.err.println("Student Information");
        System.out.println("Name:"+getName());
        System.out.println("Roll:"+getRoll());
        System.out.println("Age:"+getAge());
        System.out.println("Grade:"+getGrade());
    }   
}
