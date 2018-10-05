package pattern.template;

import pattern.template.dto.MemberDao;
import pattern.template.entity.Member;

import java.util.List;

/**
 * create by zhegui on 2018/10/5
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao();
        List<Member> members = memberDao.query();
    }
}
