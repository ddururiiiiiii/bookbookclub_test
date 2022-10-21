package hello.bookbookclub;

import hello.bookbookclub.member.Member;
import hello.bookbookclub.member.MemberService;
import hello.bookbookclub.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {


    MemberService memberService = new MemberServiceImpl();
    private String id;
    private String nickName;
    private String password;
    private String joinDate;
    @Test
    void join(){
        //given
        Member member = new Member("abcd", "닉네임", "1234", "2022-10-12");

        //when
        memberService.join(member);
        Member findMember = memberService.findMember("abcd");

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
