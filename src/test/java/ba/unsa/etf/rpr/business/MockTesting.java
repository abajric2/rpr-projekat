package ba.unsa.etf.rpr.business;

import ba.unsa.etf.rpr.dao.MemberDaoSQLImpl;
import ba.unsa.etf.rpr.domain.Member;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockTesting {
    private MemberManager memberManager;
    private Member member;
    private MemberDaoSQLImpl memberDaoSQL;
    private List<Member> members;

    @BeforeEach
    public void setup() {
        memberManager = Mockito.mock(MemberManager.class);
        member = new Member();
        member.setId(1);
        member.setFirstName("Test First Name");
        member.setLastName("Test Last Name");
        member.setUsername("TestUsername");
        member.setPassword("TestPassword");
        memberDaoSQL = Mockito.mock(MemberDaoSQLImpl.class);
        members = new ArrayList<>();
        members.addAll(Arrays.asList(
                new Member("First Name 1", "Last Name 1", "Username1", "Password1", false),
                new Member("First Name 2", "Last Name 2", "Username2", "Password2", false),
                new Member("First Name 3", "Last Name 3", "Username3", "Password3", true),
                new Member("First Name 4", "Last Name 4", "Username4", "Password4", true)
        ));
    }
}
