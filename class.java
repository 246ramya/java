Class Rect {
int length,height;
Rect(int a ,int b)
{
length=a;
height=b;
}

void area(int a,int b){
println("the area of a rectangle is "+(a*b));
}
}

class Overload{
public static void main(String arg[])
{
Rect obj=new Rect();
obj.area(10,20);
}
}