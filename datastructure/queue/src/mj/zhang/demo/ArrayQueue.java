package mj.zhang.demo;

/**
 * @ClassName 数组模拟队列练习
 * @Author ZhangMingJun
 * @Description 数组模拟队列练习
 * @Date 2024/1/12 22:49
 * @Version 1.0
 **/
public class ArrayQueue {
    public static void main(String[] args) {
        //创建一个队列
        Queue queue = new Queue(5);

        queue.getVal();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        queue.getVal();
        queue.getVal();
        queue.getVal();
        queue.getVal();
        queue.getVal();
        queue.getVal();
        queue.getVal();


//        String s1 = "Programming";
//        String s2 = new String("Programming");
//        String s3 = "Program";
//        String s4 = "ming";
//        String s5 = "Program" + "ming";
//        String s6 = s3 + s4;
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s5);
//        System.out.println(s1 == s6);
//        System.out.println(s1 == s6.intern());
//        System.out.println(s2 == s2.intern());
        String s = "java";

        String s2 = new StringBuilder("jav").append("a").toString();
        String intern = s2.intern();
        System.out.println(intern == s2);

        String s1 = new StringBuilder("go").append("o1d").toString();
        String intern1 = s1.intern();
        System.out.println(intern1 == s1);




    }



    static class Queue{
        private int maxSize;
        private int front;
        private int rear;
        private int[] arr;


        public Queue(int maxQueueSize){
            maxSize = maxQueueSize;
            front = -1;
            rear = -1;
            arr = new int[maxQueueSize];
        }

        /**
         * 元素入队列
         * @Author ZhangMingJun
         * @Description 元素入队列
         * @Date 23:04 2024/1/12
         * @param val  入队元素值
         **/
        public void add(int val){
            //队列已满
            if (rear==maxSize){
                System.out.println("队列已满");
                return;
            }
            //队列为空的情况
            if (front==rear){
                arr[0] = val;
                front++;
                rear = 1;
                System.out.printf("添加成功,值为:%s%n",val);
                return;
            }
            //队列未满
            arr[rear] = val;
            rear++;
            System.out.printf("添加成功,值为:%s%n",val);
        }
        /**
         * 元素出队列
         * @Author ZhangMingJun
         * @Description 元素出队列
         * @Date 23:05 2024/1/12
         * @return int 取出队列的值
         **/
        public void getVal(){
            if (front==rear){
                System.out.println("队列为空");
                return;
            }

            System.out.printf("取出的队列值为：%s",arr[front]);
            System.out.println();

            front++;
        }
    }
}
