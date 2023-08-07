package Day19.Collectionex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EmployeeService {

   // 필드 선언
   private ArrayList<Employee> list;      
   // 선언을 한거지 힙영역에 할당한것이 아님(new)가 잇어야 인스턴스 생성!
   // 인스턴스를 생성하려면? 1) 생성자메소드를 통해(간단) / 2) set메소드로 생성하는거
   
   private HashMap <Integer, Employee> map;  
   
   
   //싱글톤 선언
   private static EmployeeService service = new EmployeeService();
   private EmployeeService() {
      list = new ArrayList<Employee>();
      map= new HashMap<Integer, Employee>();
   }
   public static EmployeeService getInstance() {
      return service;
   }
   
   // public을 막아버려! ↑위에 처럼 싱글톤 선언!!
//   
//   public EmployeeService() {
//      list=new ArrayList<Employee>(); // 인스턴스 생성!
//      
//   }
   // 이 데이터는 정확하게 확인(반환) 안해도 된다 : void
   // 이 데이터는 정확하게 확인해야하는 경우 : return 사용
   // 메소드는 하나의 값만 가진다
   // 다른 수식에 참여할때는 무조건 return을 써야함 !!
   
   
   
   //추가 //확인할 필요없이 저장저장하는 것 반환필요 XX
   public void AddEmployee(Employee e) {
      /*boolean flag=false;  //false로 해야 동작시작하지 않는다.
        for(Employee emp:list){// 이름으로 비교해서 등록 판단하자(원래 ssn으로 비교한다)
           if(e.getName().equals(emp.getName())) {
              flag=true;
              System.out.println(e.getName()+"님은 이미 회원입니다");
              return;
           }
        }
        //ArrayList를 add()를 사용하여 객체를 저장한다.
        if(flag==false) {
           list.add(e);
      System.out.println(e.getName()+"님이 회원으로 가입되셨습니다.");
        }*/ // 여기는 ArrayList로 한것
      
      //여기부터는 HashMap 사용 (set기능을 가짐) /hash는 순서가 없어 key만 모은다
   /*   boolean flag = false;
      Set<Integer> set = map.keySet();
      for(int key:set) {
         if(map.get(key).getName().equals(e.getName())) {
            flag=true;
            System.out.println(e.getName()+"님은 이미 등록되었음");
            return;
         }
      }
   if(flag==false) {
      map.put(e.getSsn(),e);
      System.out.println(e.getName()+"님이 회원으로 가입되셨습니다.");
         }
      }*/  // cotain 사용
      
      if(map.containsKey(e.getSsn())) {
         System.out.println(e.getName()+"님은 이미 회원입니다.");
         return;
      }else {
         map.put(e.getSsn(), e);
         System.out.println(e.getName()+"님이 회원가입 되었습니다.");
         
      }
   }
      
   public void deleteEmployee(String name) {
      boolean flag=false;  
        for(Employee emp:list){
           if(emp.getName().equals(name)) {  // 같으면 찾을거야
              flag=true;      // 찾았다
              list.remove(emp);
              System.out.println(emp.getName()+"님은 삭제되었습니다.");
           }
        }
        if(flag==false) {
           System.out.println("삭제할 대상이 없습니다.");
        }
   }
   //조회
   public ArrayList<Employee> findEmployee(String name){ //나중에 Employee 로 바꿔야함
      // 메소드 데이터 타입이름과 값의 타입은 동일해야한다
      ArrayList<Employee> temp = new ArrayList<Employee>();
      for(Employee e:list) {
         if(e.getName().equals(name)) {
            temp.add(e);  // 추가
         }
      }
      //ArrayList는 여러사람이니까 조회할땐 한사람의 데이터인 Employee타입이 와야한다
      return temp;
      }
   
   public void getAllEmployee() {
      // 밑에 주석단건 ArrayList로 출력한것
      //for (Employee e : list) {
      //   System.out.println(e);   // e클래스에 toString이 없으면 주소값이 나옴
         
      //HashMap으로 출력
      //Set<Integer> set = map.keySet();
      //for(int key:set)
         //System.out.println(map.get(key));
      
      // 위에꺼를 반복자(Iterator)로 적고 싶다.
      Set<Integer> set = map.keySet();
      Iterator<Integer> it = set.iterator();
      while(it.hasNext()) {
         Integer key = it.next();
         System.out.println(map.get(key));
      }
      }
   }
