class Demo
{
   public static void main(String[]args)
{
    System.out.println("hey");
   C c1=new C();
     c1.m1();
}

}
class C
{
   public void m1()
        {
         System.out.println("hello");
        }
    static
      {
        System.out.println("static arg");
      }
    
      {
        System.out.println("instance arg");

      }

}