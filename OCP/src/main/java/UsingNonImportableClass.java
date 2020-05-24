//This is an example of a class placed in the 'default' package.
//Default means no package.
//This class can only used by a class lying in the 'default' package itself.
//Classes in 'default' package cannot be imported.
public class UsingNonImportableClass {
    public void insideNonImportableClassMethod(){
        //Here we are able to use the classes in default package.
        NonImportableClass nic = new NonImportableClass();
    }
}
