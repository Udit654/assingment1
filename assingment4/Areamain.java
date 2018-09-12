import java.io.*;

class Area
{

float area;

void calculate_Area(float l,float b)
{
area=l*b;
System.out.println("Area of the Rectangle : "+area);
}
}

class Areamain
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
float l,b;
System.out.print("Enter the Length of the Rectangle : ");
l=Float.parseFloat(input.readLine());
System.out.print("Enter the breadth of the Rectangle : ");
b=Float.parseFloat(input.readLine());
Area obj=new Area();
obj.calculate_Area(l,b);
}
}