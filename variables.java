class variables{
    static int staticint=10; //static variable
    int nonStatic=5; //non static variable
    public static void main(String[] args){
        variables v1=new variables();  //creating the object v1
        int x=7;  //local variable      
        System.out.println("local variable 'x'="+x);                            //accessed using the variable name
        System.out.println("non static variable 'nonStatic'="+v1.nonStatic);    //accessed using the object reference 
        System.out.println("static variable 'staticint'="+variables.staticint); //accessed using the class name
    }
}