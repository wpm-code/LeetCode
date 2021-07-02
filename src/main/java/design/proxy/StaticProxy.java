package design.proxy;

/**
 * 静态代理
 * 代理类和被代理类要实现同一个接口
 */
public class StaticProxy {
    public static void main(String[] args) {
        TeacherProxy teacherProxy = new TeacherProxy(new Teacher());
        teacherProxy.teaching();
    }
}

interface ITeacher{
    void teaching();
}

class Teacher implements ITeacher{

    @Override
    public void teaching() {
        System.out.println("上课");
    }
}

class TeacherProxy implements ITeacher{
    private ITeacher target;    //目标对象

    public TeacherProxy(ITeacher target) {
        this.target = target;
    }

    @Override
    public void teaching() {
        System.out.println("开始代理");     //前后可以进行功能拓展
        target.teaching();      //核心代理方法
        System.out.println("代理结束");
    }
}