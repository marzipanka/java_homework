package homework4.task4;

import java.util.Stack;

//Задача 4: Стеки (Stacks)
//        Написать функцию, использующую стек для проверки правильности последовательности скобок в строке (например, "([]{})" является правильной, а "([)]" — нет).
public class Main {
    public static void main(String[] args) {
        String expression1 = "([]{})";
        String expression2 = "([)]";

        System.out.println(isValid(expression1)); // true
        System.out.println(isValid(expression2)); // false
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}