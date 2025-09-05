--class Student
{
 String n;
 float cm,pm,jm;
}
class Studentmarks
{
 public static void main(String args[])
  { 
    Student s1=new Student();
    s1.n="Steve";
    s1.cm=90;
    s1.pm=56;
    s1.jm=69;
    
    float avg1=(s1.cm+s1.pm+s1.jm)/3;
    System.out.println("STUDENT NAME:"+s1.n);
    System.out.println("AVG OF STUDENT ONE:"+avg1);
    
    //:::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    
    Student s2=new Student();
    s2.n="Alex";
    s2.cm=100;
    s2.pm=70;
    s2.jm=85;
    
    float avg2=(s2.cm+s2.pm+s2.jm)/3;
    System.out.println("STUDENT NAME:"+s2.n);
    System.out.println("AVG OF STUDENT ONE:"+avg2);
  }
}
