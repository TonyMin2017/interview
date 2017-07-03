package com.interview.test;

/**
 * Created by THINK on 2017/7/3.
 */
public class Test {
    //这是源代码：
    public static void main(String[] args) {

        System.out.println("閔粤在此方法中布置了作业：请各位收到后一一作答。");
        /**
         * 一、问答题（40分）
         * 1.==与equal有何区别？ （汤宇航）
         * 答: ==比较的是地址,而 equal比较的是值(内容)
         * 2.java语言里&的&&有何区别？（覃津传）
         *    答：
         *         单&时，左边无论真假，右边都进行运算；
         *         双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
         *
         * 3.java的char型变量能否存储一个中文汉字？为什么？（毛璇）
         * 答：可以，Java使用的unicode字符，每个字符两个字节，一个汉字就是两个字节，所以可以。
         * 4.overload与override的区别？overload的方法 是否可以改变返回值？（覃认追）
         * 答：overload与override的区别：
         *          overload(重载)存在于父类和子类的同类中，方法名相同，参数类型、参数个数、参数顺序只有有一个不相同；
         *          override(重写)存在于父类和子类之间；方法名相同，参数列表相同，返回值相同或者是其子类，返回值类型不能严与父类，方法被定义为final的不能被重写；
         *     overload(重载)的方法可以改变返回值；因为方法重载与返回值无关，它对返回值的类型没有任何要求；
         * 5.内存溢出是指的什么？Java会不会内存溢出？ （黄卓燊）
         * 6.JSP中的动态include与静态include的区别是什么？ （应传福）
         *      答:两种都是在当前页面加载或包含另一页面内容，
                   区别：1.使用<jsp:include>动作标签实现时它总是会检查所含文件中的变化，适合包含动态页面，并且可以携带参数；
                        2.静态<%@include>是用伪码实现，它不会检查所含文件的变化，适合包含静态页面，
                       只是简单的将被加载的资源拷贝到了当前，不能实现参数共享。
         * 7.运行时异常与一般异常有何异同？ （舒张）
         *    运行时异常：runtime exception。由虚拟机接管的异常，可以不由我们处理，比如NullPointerException异常就是最常见的
          运行时异常。RuntimeException体系包括错误的数组脚本越界（ArrayIndexOutOfBoundsException），空指针异常
         （NullPointerException）、类转换异常（ClassCastException）等等.
              一般异常：checked exception。checked 异常也就是我们经常遇到的IO异常，以及SQL异常都是这种异常。checked异常
          必须try..catch处理或用throws声明继续抛给上层调用方法处理对于这种异常，这些异常并不是程序本身的错误,而是在应用环境中出现的外部错误.
         * 8.ArrayList与LinkedList的区别？ （黄卓燊）
         * 9.数据库的连接池的作用与工作机制分别是什么？ （梁梦楚）
         *    答：
         *    工作机制：在内部对象池中，维护一定数量的数据库连接，并对外暴露数据库连接的获取和返回方法。
         * 如外部使用者可通过getConnection方法获取数据库连接，使用完毕后再通过releaseConnection方法将连接返回，注意此时的连接并没有关闭，而是由连接池管理器回收，并为下一次使用做好准备。
         *    作用：
         *    1.资源重用
         *    由于数据库连接得到重用，避免了频繁创建、释放连接引起的大量性能开销。在减少系统消耗的基础上，增进了系统环境的平稳性（减少内存碎片以级数据库临时进程、线程的数量）
         *    2.更快的系统响应速度
         *    数据库连接池在初始化过程中，往往已经创建了若干数据库连接置于池内备用。此时连接池的初始化操作均已完成。对于业务请求处理而言，直接利用现有可用连接，避免了数据库连接初始化和释放过程的时间开销，从而缩减了系统整体响应时间。
         *    3.新的资源分配手段
         *    对于多应用共享同一数据库的系统而言，可在应用层通过数据库连接的配置，实现数据库连接技术。
         *    4.统一的连接管理，避免数据库连接泄露
         *    在较为完备的数据库连接池实现中，可根据预先的连接占用超时设定，强制收回被占用的连接，从而避免了常规数据库连接操作中可能出现的资源泄露
         * 10.Spring是如何实现IOC的？如何使用AOP机制配置事务？ （黄卓燊）
         *二、数据库（10分）
         *1.（黄卓燊）
         *2.（黄卓燊）
         * 三、编程题：（10分）
         * 1.编写一个函数判读n是否为质数 ？（陈广林）
         * 2.编写一个F(n)，求从小到大的n个质数之和？ （陈超嫦）
         * 3.编写一个程序，统计从键盘中输入的5种字符数？ （张雄英）
         * 答:
         *        详情见 public void getCount(String str)
         * 四、思考题：（10分）
         * 1.编写一个程序交换a=1,b=2的值，不得使用中间变量；
         * 2.Java是完全面向对象的语言吗？为什么？ （曾翔伟）
         * 五、翻译题 （10分）
         * 六、拓展题
         * 1.说说你对团队的理解？工作中你喜欢和什么样的人合作？不喜欢和什么样的人合作？
         *
         * 2.说说你期望的工作环境与工作氛围？你对你的直接上司有什么期望？
         * 3.说说你的职业规划及实现步骤？
         *
         */

        LiuJiangWen();

        int n=2;//编程题1题，判断n是否为质数
        System.out.println("判断n是否为质数：数字"+n
                +":"+new Test().isPrime(n));
    }

    public static void LiuJiangWen() {
        System.out.println("第六题第1小题：");
        System.out.print("说说你对团队的理解:");
        System.out.println("團隊是指一群互助互利、团结一致为统一目标和标准而坚毅奋斗到底的一群人。团队不仅强调个人的业务成果，更强调团队的整体业绩。团队是在集体讨论研究和决策以及信息共享和标准强化的基础上，强调通过队员奋斗得到胜利果实，这些果实超过个人业绩的总和。");
        System.out.print("工作中你喜欢和什么样的人合作?");
        System.out.println("答：是人都喜欢。");
        System.out.print("不喜欢和什么样的人合作?");
        System.out.println("答：没有什么不喜欢的。");
    }
        //三.程序题：第3题
        public void getCount(String str){
            int c1=0;//空格数
            int c2=0;//阿拉伯数字数
            int c3=0;//英文字符数
            int c4=0;//中文字符数
            int c5=0;//其它字符数
            char [] chars = str.toCharArray();
            for (int i = 0;i<chars.length;i++){
                if (chars[i]==32){
                    c1++;
                }else if(chars[i]>=48&&chars[i]<=57){
                    c2++;
                }else if((chars[i]>=65&&chars[i]<=90)||( chars[i]>=97&&chars[i]<=122)){
                    c3++;
                }else if(chars[i]<=255){
                    c5++;
                }else{
                    c4++;
                }
            }
            System.out.println("空格数"+c1);
            System.out.println("阿拉伯数字数"+c2);
            System.out.println("英文字符数"+c3);
            System.out.println("中文字符数"+c4);
            System.out.println("其它字符数"+c5);
            System.out.println("总字符数"+chars.length);
        }



    //编程题1题，判断n是否为质数
    public boolean isPrime(int n){
        for (int i = 2; i<= Math.sqrt(n); i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}
