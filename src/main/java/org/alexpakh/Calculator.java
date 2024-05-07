package org.alexpakh;

public class Calculator {

    static String string(String string) {
        return string;
    }
    public static void main(String[] args) throws Exception {

        string("sdgf");
        int hex = 0x16;
        int bin = 0b10;
        int oct = 07;
        int dec = 10;
        int ee= 19;
        System.out.println(ee);

//        String hexs = "0x16";
//        String bins = "0b10";
//        String octs = "07";
//        String decs = "10";

        Integer.toHexString(bin);
        for (int i = 0; i < 9; i++) {

        }

        System.out.println("hex: " + hex + "; "+"oct: " + oct + "; "+"bin: " + bin + "; "+"dec: " + dec);


//        System.out.println("hex: " + hexs + "; "+"oct: " + octs + "; "+"bin: " + bins + "; "+"dec: " + decs);



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите операцию");
//        String ot = scanner.nextLine();
//
//        OperationTypeFactory operationTypeFactory = new OperationTypeFactory();
//        Operation operation = operationTypeFactory.createOperation(OperationType.valueOf(ot));
//
//        int a = scanner.nextInt(), b = scanner.nextInt();
//        if (operation instanceof Division && b == 0) {
//            System.out.println("change  number");
//            int r = operation.operation(scanner.nextInt(), scanner.nextInt());
//            System.out.println(r);
//        }
//        int result = operation.operation(a, b);
//        System.out.println(result);


    }

}