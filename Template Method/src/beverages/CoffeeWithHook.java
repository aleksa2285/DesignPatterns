package beverages;

import templates.CaffeineBeverageWithHook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("Dripping that coffee trought that filter :)");
    }
    @Override
    public void addCondiments() {
        System.out.println("Adding that Sugar and that Milk :) ");
    }
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")){
            return true;
        }
        else return false;
    }
    private String getUserInput(){
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("io error trying to read your answer");
        }
        if (answer == null){
            return "no";
        }
        else return answer;
    }
}
