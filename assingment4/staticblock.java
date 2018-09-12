class Test 
{
static int i;
int j;
static 
{
i = 10;
System.out.println("static invoked ");
}
}
class staticblock 
{
public static void main(String args[]) 
{
System.out.println(Test.i); 
}
}