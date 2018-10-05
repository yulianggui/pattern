package pattern.adapter.passport;

import pattern.adapter.ResultMsg;

/**
 * create by zhegui on 2018/10/5
 */
public class SignInService {

    public ResultMsg register(String userName, String password){
        return new ResultMsg("200", "登录成功！", userName);
    }

    public ResultMsg login(String userName, String password){
        return new ResultMsg("200", "注册成功！", userName);
    }
}
