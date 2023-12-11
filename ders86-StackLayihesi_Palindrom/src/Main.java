
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nurlan Rustamov
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("Cumle yaz: ");
        Scanner scan = new Scanner(System.in);
        String cumle = scan.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < cumle.length() / 2; i++) {
            stack.push(cumle.charAt(i));
        }
        if(isPalindrom(cumle, stack)){
            System.out.println("Bu cumle Palindromdur");
        }else{
            System.out.println("Bu cumle Palindrom deyil");
        }
    }

    public static boolean isPalindrom(String cumle, Stack<Character> stack) {
        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
