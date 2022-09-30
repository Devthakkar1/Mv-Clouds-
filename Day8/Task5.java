class employee_name{
    String name="raj";
void name(){System.out.println("name="+name);}  
}  
class employee_salary extends employee_name{  
    int salary=300000;
void salary(){System.out.println("salary="+salary);}  
}  
class employee_age extends employee_salary{ 
    int age = 18;
void age(){System.out.println("age="+age);}  
}  
class day8_task1
{  
public static void main(String args[])
{  
employee_age d=new employee_age();  
d.name();  
d.salary();  
d.age();  
}
}