package javaCodePractice.compare;

//나는 비교가 가능한 객체야라는 것을 티내 주어야 한다.
//implements Comparable<MadeObject>
public class MadeObject implements Comparable<MadeObject> {
    private String name;
    private int age;

    public MadeObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MadeObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //이 클래스의 기본 정렬 방식을 나이의 오름차 순으로 구현
    //++Comparable를 통해 구현한 순서를 자연 순서(Natural Ordering)라고 부른다.
    @Override
    public int compareTo(MadeObject o) {
        return this.age < o.age ?  -1 : (this.age == o.age ? 0 : 1) ;
    }

}
