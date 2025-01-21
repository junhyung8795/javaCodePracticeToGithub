package javaCodePractice.javaMap.problem;

public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1", "아무회원1");
        Member member2 = new Member("id2", "아무회원2");
        Member member3 = new Member("id3", "아무회원3");

        //회원저장
        MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);

        //회원 조회
        Member byId = repository.findById("id1");
        System.out.println("byId = " + byId);

        Member byName = repository.findByName("아무회원3");
        System.out.println("byName = " + byName);

        //회원 삭제
        repository.remove("id2");
        Member removedMember = repository.findById("id2");
        System.out.println("removedMember = " + removedMember);

    }
}
