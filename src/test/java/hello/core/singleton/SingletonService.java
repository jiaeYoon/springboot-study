package hello.core.singleton;

public class SingletonService {

    //1. static 영역에 객체를 딱 1개만 생성해둠
    public static final SingletonService instance = new SingletonService();

    //2. 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용함
    public static SingletonService getInstance() {
        return instance;
    }

    //3. private + 생성자로 선언하여 외부에서 new 키워드를 사용한 객체 생성을 막음
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
