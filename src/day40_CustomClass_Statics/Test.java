package day40_CustomClass_Statics;

public class Test {

    public static void main(String[] args) {

        System.out.println( StaticBlocks.list );
        StaticBlocks.list.set(0, "Z"); //after set, static block's value will be change to [Z, B, C]

        System.out.println( StaticBlocks.list );

        System.out.println("---------------------------------------");

//        ExecutionOfStaticBlock.method1();
//        ExecutionOfStaticBlock.method1();
//        ExecutionOfStaticBlock.method1();



    }

}