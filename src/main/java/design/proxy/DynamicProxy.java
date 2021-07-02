package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy {
    public static void main(String[] args) {
        //目标对象
        ITeacherDao teacher = new TeacherDao();
        //代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacher).getProxyInstance();

        proxyInstance.teaching();
    }
}

interface ITeacherDao{
    void teaching();
}

class TeacherDao implements ITeacherDao{

    @Override
    public void teaching() {
        System.out.println("上课");
    }
}

class ProxyFactory {
    private Object target;

    //使用构造器对target初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance() {
        /**
         *  newProxyInstance(ClassLoader loader,    目标对象使用的类加载器
         *  @NotNull Class<?>[] interfaces,         目标对象实现的接口类型
         *  @NotNull reflect.InvocationHandler h)   事件处理
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理开始");
                Object result = method.invoke(target, args);
                return result;
            }
        });
    }
}