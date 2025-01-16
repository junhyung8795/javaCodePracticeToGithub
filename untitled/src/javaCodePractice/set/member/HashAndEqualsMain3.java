package javaCodePractice.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        //중복 등록 안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        //MemberOnlyHash m1 = new MemberOnlyHash("A");로 실험하면 id기준 해시 코드를 만들지만
        //equals를 재정의 하지 않아 해시 인덱스에 같은 id를 가진 중복 데이터를 넣을 수 있고
        //searchValue로 검사하려고 해도 해당 해시 인덱스를 찾을 순 있지만 각 인스턴스의 참조값이 달라서(m1, m2, searchValue) 검색에 실패 한다.
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        //각 인스턴스의 참조값 알 수 있음.
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("System.identityHashCode(searchValue) = " + System.identityHashCode(searchValue));
        boolean result = set.contains(searchValue);
        System.out.println("set.contans의 result ㅇ= " + result);//분명 id= "A"인 데이터를 찾으려고 해도 안찾아진다.
    }
}
