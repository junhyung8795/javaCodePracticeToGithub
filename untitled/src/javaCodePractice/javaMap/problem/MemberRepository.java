package javaCodePractice.javaMap.problem;

import java.util.Map;
import java.util.HashMap;

public class MemberRepository {
    Map<String, Member> members = new HashMap<>();
    public void save(Member member){
        members.put(member.getId(), member);
    }
    public Member findById(String id){
        return members.get(id);
    }
    public Member findByName(String name){
        for (String s : members.keySet()) {
            if (members.get(s).getName().equals(name)) {
                return members.get(s);
            }
        }
//        for (Member member : members.values()){
//            if (member.getName().equals(name)) {
//                return member;
//            }
//        }members.values()는 Collection<Member> values를 반환하므로 이렇게 코드를 작성해도된다.
        return null;
    }
    public void remove(String id){
        members.remove(id);
    }
}
