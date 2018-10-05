package pattern.delegate;

import pattern.delegate.controllers.MemberAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * create by zhegui on 2018/10/5
 */
public class ServletDispatcher {

    private List<Handler> handlerMappeing = new ArrayList<Handler>();

    public ServletDispatcher(){
        try{
            Handler memberHander = new Handler();
            Class<?> memberActionClass = MemberAction.class;
            memberHander.setController(memberActionClass.newInstance()) ;
            memberHander.setMethod(memberActionClass.getMethod("getMemberById", new Class[]{String.class}));
            memberHander.setUrl("/web/getMemberById.json");
            handlerMappeing.add(memberHander);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void doService(HttpServletRequest request, HttpServletResponse response){
        this.doDispatcher(request, response);
    }

    private void doDispatcher(HttpServletRequest request, HttpServletResponse response){

        //1、获取用户请求的url
        String uri = request.getRequestURI();
        //2、Servlet拿到URL后，要做权衡（要做判断，做出选择）

        //3、通过拿到的URL去handlerMappeing(我们把它认为是策略常量)
        Handler handler = null;
        for(Handler h : handlerMappeing){
            if(uri.equals(h.getUrl())){
                handler = h;
                break;
            }
        }
        //4、通过反射去调用其对应的方法
        Object object = null;
        try{
            if(null != handler){
                object = handler.getMethod().invoke(handler.getController(), request.getParameter("id"));
            }
            //response.getWriter().write((String) object);
        }catch (Exception e){
            e.printStackTrace();
        }

        //5、获取到Method执行的结果，通过Response返回出去

    }

    class Handler{

        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public void setController(Object controller) {
            this.controller = controller;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
