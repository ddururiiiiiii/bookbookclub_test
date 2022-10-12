package hello.bookbookclub.member;

public class Member {

    private String id;
    private String nickName;
    private String password;
    private String joinDate;

    //생성자
    public Member(String id, String nickName, String password, String joinDate) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.joinDate = joinDate;
    }

    //getter, setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }


}
