public class HelloGoodbye {
    public static void main(String[] args) {
        final int argsLastIndex = args.length - 1;
        System.out.print("Hello");
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                System.out.print(" " + args[i]);
            } else {
                System.out.print(" and " + args[i]);
            }
        }
        System.out.print("\nGoodbye ");

        for (int i = argsLastIndex; i >= 0; i--) {
            if (i == argsLastIndex) {
                System.out.print(args[i]);
            } else {
                System.out.print(" and " + args[i]);
            }
        }
    }
    
}
