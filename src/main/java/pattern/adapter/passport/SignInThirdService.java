package pattern.adapter.passport;

import pattern.adapter.ResultMsg;

/**
 * create by zhegui on 2018/10/5
 */
public class SignInThirdService extends SignInService{

    public ResultMsg signInForQQ(String openId){
        return thirdRegister(openId, "QQ_empty");
    }

    public ResultMsg signInForWeachat(String openId){
        return thirdLogin(openId, "WECHAT_empty");
    }

    public ResultMsg thirdRegister(String userName, String password){
        ResultMsg resultMsg = super.register(userName, password);
        if(!"200".equals(resultMsg.getCode())){
            return null;
        }
        return thirdLogin(userName, password);
    }

    public ResultMsg thirdLogin(String userName, String password){
        return super.login(userName, password);
    }

}


