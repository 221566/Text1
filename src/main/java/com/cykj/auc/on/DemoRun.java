package com.cykj.auc.on;

import com.cykj.auc.bean.UserInfo;
import com.cykj.auc.mapper.UserMapper;
import com.cykj.auc.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class DemoRun {
    public static void main(String[] args) {
            UserInfo info = new UserInfo();
            info.setAccount("zhaoliu");
            info.setPwd("123");
            SqlSession session = MybatisUtil.getInstance().getSqlSession();
            UserMapper userMapper = session.getMapper(UserMapper.class);
            userMapper.addUser(info);
            session.commit();;
            session.close();


//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session = sessionFactory.openSession(false);
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            UserInfo info = new UserInfo();
//            info.setAccount("zhangsan");
//            info.setPwd("123");
//            userMapper.addUser(info);
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
