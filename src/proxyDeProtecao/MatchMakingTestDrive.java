package proxyDeProtecao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
  PersonBean joe;
  
  public MatchMakingTestDrive() {
    joe = new PersonBeanImpl();
    joe.setName("Joe JavaBean");
  }

  public static void main(String[] args) {
    MatchMakingTestDrive drive = new MatchMakingTestDrive();
    drive.drive();
  }
  
  public void drive(){
    PersonBean ownerProxy = getOwnerProxy(joe);
    System.out.println("Name is: "+ ownerProxy.getName());
    ownerProxy.setInterests("Estudos, muito muito");
    
    try {
      ownerProxy.setHotOrNotRating(2);
    } catch (Exception e) {
      System.out.println("== Chamda de setHotOrNotRating bloquada pelo proxy! ==");
    }
    
    System.out.println("Sua classificação é: "+ ownerProxy.getHotOrNotRating()+"\n");
    
    PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
    System.out.println("Name is: "+ nonOwnerProxy.getName());
    try {
      nonOwnerProxy.setInterests("Estudos também, muito muito");
    } catch (Exception e) {
      System.out.println("== Chamda de setInterests bloquada pelo proxy! ==");
    }
    nonOwnerProxy.setHotOrNotRating(3);
    System.out.println("Sua classificação é: "+ ownerProxy.getHotOrNotRating());
    
    
  }
  
  
  
  PersonBean getNonOwnerProxy(PersonBean personBean){
    return (PersonBean) Proxy.newProxyInstance(
        personBean.getClass().getClassLoader(), 
        personBean.getClass().getInterfaces(), 
        new NonOwnerInvocationHandler(personBean));
  }
  
  PersonBean getOwnerProxy(PersonBean personBean){
    return (PersonBean) Proxy.newProxyInstance(
        personBean.getClass().getClassLoader(), 
        personBean.getClass().getInterfaces(), 
        new OwnerInvocationHandler(personBean));
  }
  
//  InvocationHandler getProxy(InvocationHandler handler, PersonBean bean){
//    return (PersonBean) Proxy.newProxyInstance(
//        personBean.getClass().getClassLoader(), 
//        personBean.getClass().getInterfaces(), 
//        new OwnerInvocationHandler(personBean));
//  }

}
