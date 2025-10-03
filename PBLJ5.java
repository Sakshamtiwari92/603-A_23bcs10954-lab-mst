import java.io.*;import java.util.*;
class PBLJ5{
public static void main(String[] args)throws Exception{
Scanner sc=new Scanner(System.in);
System.out.println("Part a: Enter integers separated by space:");
String[] arr=sc.nextLine().split(" ");
int sum=0;
for(String s:arr){Integer x=Integer.parseInt(s);sum+=x;}
System.out.println("Sum="+sum);

System.out.println("Part b: Serialization and Deserialization");
Student st=new Student(1,"Raj");
ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.ser"));
oos.writeObject(st);oos.close();
ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.ser"));
Student s2=(Student)ois.readObject();ois.close();
System.out.println("Deserialized:"+s2.id+" "+s2.name);

System.out.println("Part c: Employee Management System");
File f=new File("emp.dat");
while(true){
System.out.println("1.Add 2.View 3.Exit");
int ch=sc.nextInt();sc.nextLine();
if(ch==1){
System.out.println("Enter id name salary");
int id=sc.nextInt();String nm=sc.next();double sal=sc.nextDouble();
Employee e=new Employee(id,nm,sal);
FileOutputStream fos=new FileOutputStream(f,true);
if(f.length()==0){ObjectOutputStream o=new ObjectOutputStream(fos);o.writeObject(e);o.close();}
else{AppendableObjectOutputStream o=new AppendableObjectOutputStream(fos);o.writeObject(e);o.close();}
}
else if(ch==2){
FileInputStream fis=new FileInputStream(f);
ObjectInputStream in=new ObjectInputStream(fis);
try{while(true){Employee e=(Employee)in.readObject();System.out.println(e.id+" "+e.name+" "+e.salary);}}
catch(EOFException ee){}in.close();
}
else{sc.close();break;}
}
}
}
class Student implements Serializable{
int id;String name;
Student(int i,String n){id=i;name=n;}
}
class Employee implements Serializable{
int id;String name;double salary;
Employee(int i,String n,double s){id=i;name=n;salary=s;}
}
class AppendableObjectOutputStream extends ObjectOutputStream{
AppendableObjectOutputStream(OutputStream out)throws IOException{super(out);}
protected void writeStreamHeader()throws IOException{}
}
