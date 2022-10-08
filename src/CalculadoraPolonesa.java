import java.util.*;

public class CalculadoraPolonesa {
    private static Stack<Integer> stack = new Stack<Integer>();
    private static Scanner input = new Scanner(System.in);


    public static void calculator() throws Exception {

        System.out.println("Welcome to Calculator program!");

        Entrada();
    }

    private static void Entrada() {
        String Operando = " ";
        while (!Operando.equals("x")) {
            System.out.println("Entrada: ");
            Operando = input.next();
            try {
                int Variavel = Integer.valueOf(Operando);
                stack.push(Variavel);
            } catch (Exception e) {
                if (Operando.equals("*")) {
                    stack.push(stack.pop() * stack.pop());

                } else if (Operando.equals("/")) {
                    stack.push((int) stack.pop() / stack.pop());

                } else if (Operando.equals("+")) {
                    stack.push(stack.pop() + stack.pop());

                } else if (Operando.equals("-")) {
                    stack.push(stack.pop() - stack.pop());

                } else if (Operando.equals("=")) {
                    System.out.println(stack.pop());

                } else if (Operando.equals("c")) {
                    if (!stack.empty()) {
                        for (int i = 0; i < stack.size(); i++) {
                            stack.pop();
                        }
                    }
                } else if (Operando.equals("Calcular")) {
                    for (int i = 0; i < stack.size(); i++) {
                        System.out.println(stack.get(i));
                    }
                }
            }

        }
    }



    public static void main(String[] args) {
        try {
            calculator();
        } catch (Exception e) {
            System.out.println("Oops, Não calculou... ");
        }

    }
}
