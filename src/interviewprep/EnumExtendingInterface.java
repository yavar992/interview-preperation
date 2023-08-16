package interviewprep;

public enum EnumExtendingInterface implements EnumInterface {
    

    Value1{
   @Override
    public void doSomething() {
        System.out.println("hello i am inside the value 1 ");
    }
    } ,



    VALUE2{
        @Override
        public void doSomething() {
            System.out.println("hello i am inside the value 2 ");
        }
    }
    
}
