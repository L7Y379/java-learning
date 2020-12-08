package test_this_static_extend.This_Test9;
/**
 *什么时候成员变量声明为实例变量呢？
 *			-所有对象都具有这个属性，但是这个属性的值会随着对象的变化而发生变化【不同对象的这个属性值不同】
 *
 *什么时候成员变量声明为静态变量呢？
 *			-所有对象都具有这个属性，并且所有对象的这个属性的值是一样的，建议定为静态变量，节省内存的开销。
 *
 *静态变量在类加载的时候初始化，内存在方法区里开辟。访问的时候不需要创建对象，直接使用“类名。静态变量名”访问
 *
 *
 *关于java中static关键字的总结：
 *		1.static英语单词翻译成“静态的”，
 *		2.static修饰的方法是静态方法
 *		3.static修饰的变量是静态变量
 *		4.所有带有static的元素都是静态的，都可以使用“类名.”的方式去访问，当然也可以采用“引用.”的方式去访问【不推荐，建议使用类名.】
 *		5.static修饰的元素都是类级别的特征，和对象无关。
 */
public class Chinese {
    //身份证号【每一个中国人对象身份证号不一样】
    //实例变量
    String id="ss";

    //姓名【每一个对象的姓名不同】
    //实例变量
    String name;

    //国籍
    //更改为静态变量
    static String country="中国";

    //构造无参数构造方法
    public Chinese() {

    }

    //构造有参数方法
    public Chinese(String id,String name) {
        this.id=id;
        this.name=name;
    }
}