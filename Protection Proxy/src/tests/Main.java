package tests;

import invocationHandlers.NonOwnerInvocationHandler;
import invocationHandlers.OwnerInvocationHandler;
import others.PersonBean;
import others.PersonBeanImplementation;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.drive();
    }
    public void drive(){
        PersonBean joe = new PersonBeanImplementation("Joe Schreder", "male", "Bowling, Go");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, GO GO GO");
        System.out.println("Interests set from owner proxy");
        try{
            ownerProxy.setHotOrNotRating(10);
        }
        catch (Exception ex){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is" + nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("Bowling, Go Lang");
        }
        catch (Exception e){
            System.out.println("You can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }
    public PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) java.lang.reflect.Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }
    public PersonBean getNonOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(), new NonOwnerInvocationHandler(personBean));
    }
}
