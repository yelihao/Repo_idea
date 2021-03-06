package middle1;

public class 预处理技巧 {
    /*
    预处理：某一部分的查询是频繁的，但是可以省去时间复杂度的，则就用空间换时间的方式，把他换掉
     */


    /**
     * Q1：牛牛有一些排成一行的正方形。每一个正方形是红或是绿。牛牛现在可以旋转任意一个正方形然后用红绿进行染色。
     * 牛牛的目标是在完成染色后，每个红色R逗比每个绿色R距离最左侧近，牛牛想知道他最少需要染几个正方形。
     * 如： s = RGRGR
     * 我们涂染成RRRGG，就满足要求了，染个数为2，没有比这个更好的方案了
     */
    //和题目相反了
    //从每一个位置开始，左边全染成R，右侧全染成G        O(N2)
    public static int minPaintTest(String s){
        char[] str = s.toCharArray();
        int N = str.length;
        //左侧部分为L，右侧为N-L
        //要求左侧都是G，右侧都是R
        int min = 0 ;   //全局变量
        for (int L = 0; L<=N;L++){
            if (L == 0){
                //统计arr整体，一共有多少个G，这些G全染成R
            }
            else if (L==N){
                //统计有多少R，染成R
            }else {
                //普遍状况，统计arr[0....L]有多少G，全染成R   + arr[L+1...N-1]一共有多少R，全部染成G
            }
        }
        return 0;//为代码
    }
    /*
    预先设置一个长度也为N的arr
    arr中统计0-L上有几个R
    同时设置一个同长度的arr2
    arr2统计L～N-1有几个G
     */


    /*
    用二进制来拼
     */
    /**  !!!!!!!!
     * Q2：给定一函数f，可以从1-5的数字等概率返回一个。请加工出能等概率返回1-7的函数g
     */
    public static int f(){
        return (int)(Math.random() * 5) + 1;
    }
    /*
    先对f包一层，f返回1，2则返回0，f返回3，4则返回1，f返回5则重来
     */
    //等概率返回0和1的函数
    public static int r01(){
        int res = 0;
        do {
            res = f();
        }while (res == 3);  //得到数字是3 就重新做
        return res < 3 ? 0:1;   //1 2返回0， 4，5返回1
    }
    //需要3个二进制位置可以返回 0-3
    //r01 3次，二进制组合在一起，组合在一起为7则重新做
    public static int g(){  //1-7
        int res = 0;
        do {        //返回的是0-6
            res = (r01() << 2) + (r01() << 1) + r01();
        }while (res == 7);  //等于7 就重新做
        return res+1;
    }


    /**6
     * 拓展：给定一个函数f，以p概率返回0，以1-p返回1，请加工出等概率返回0和1的函数g
     */
    /*
    也用二进制位的方法；
    f俩回：若生成的是00重做，11重做，只有10（定义0返回）和01（定义1返回）是等概率的
     */




}
