import com.qs.dao.IAccountDao;
import com.qs.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public class MybatisTest {

    @Test
    public void mybatisTest() throws IOException {
        InputStream in = Resources.getResourceAsStream("sqlSessionConfig.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(in).openSession(true);
        IAccountDao accountDaoMapper = sqlSession.getMapper(IAccountDao.class);
        Account account = new Account();
        account.setId(1);
        account.setName("单狗");
        account.setMoney(BigDecimal.valueOf(100));

        accountDaoMapper.updateAccount(account);

        sqlSession.close();
        in.close();
    }
}
