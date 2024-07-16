class student
{
String regno;
String name;
student(String regno,String name)
{
this.regno=regno;
this.name=name;
}
void display()
{
	System.out.println("name is :"+name);
	System.out.println("regno is :"+regno);
}
}
class demo
{
public static void main (String args[])
{
student []a= new student[3];
a[0]=new student("102CS22057","Tejaswini.S")
;a[1]=new student("102CS22046","Ranjitha.R");
a[2]=new student("102CS22030","Meghana.R");
for (int i=0;i<3;i++)
a[i].display();
}
}