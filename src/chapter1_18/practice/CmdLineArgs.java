package chapter1_18.practice;

import java.util.Arrays;

public class CmdLineArgs {

    public static void main(String[] args){
        // args
        System.out.println(args.length);

        System.out.println(Arrays.toString(args));
        System.out.println((Integer.valueOf(args[0])));
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
