public class TestClass{
{
int test = i;
printI(); //valid forward reference
}
void printI(){
System.out.print(i);
}
int i = 10;
public static void main(String[] args){
new TestClass();
}
}