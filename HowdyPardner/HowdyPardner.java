public class HowdyPardner {
    // have to create a function called main and that is essential
    //make sure that the file name and the class name are the same!
    public static void main(String[] args){
        //public means that its global v local, basically -- everyone can call it
        // static means that it is a member of this class and not the instance of class; without static the default is that it is an instance methodΩ
        // in java you have to tell it your inputs and your outputs. void means it isn;t going to return anything, it's null. That it just kick starts the program
        // main is the name of the function and not a potato
        // it must take an argument -- string[] args -- (??)
        // strings[] args means. Functions have to define the type of argument. This means that it accepts the command line instructions when the program is run
        // there will be a number of string of arguments following (any number) and this captures this
        System.out.println("Howdy Pardner");// this is java's console.log
        //to compile its javac [file]
        //to run the program you have to take an additional step
        //so two steps 1) compile 2) run
        int four = TimesTwo( 2);
        System.out.println(four);

    }
    public static int TimesTwo(int num){
        //you have to use static so that it knows its not an instance and belongs to the HowdyPardner class
        //int is integer and you have to identify the type that you are using
        return num * 2;
    }

}