import com.thinking.machines.common.*;
class test2psp
{
public static void main(String gg[])
{
aaa i,k;
i=new aaa();
i.setA(1);
i.setB(2);
bbb j;
k=new aaa();

j=new bbb();
j.setA(20);

POJOCopier.copy(k,i);

System.out.println(j.getA());

System.out.println(i.getA());
System.out.println(i.getB());
System.out.println(k.getA());
System.out.println(k.getB());
}
}

class bbb
{
int a;
public void setA(int a)
{
this.a=a;
}
public int getA()
{
return this.a;
}
}

public class aaa
{
int a,b;
public void setA(int a)
{
this.a=a;
}
public void setB(int b)
{
this.b=b;
}
public int getA()
{
return a;
}
public int getB()
{
return b;
}
}