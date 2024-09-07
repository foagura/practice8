public class Practice8 {
    public static void main(String[] args){
        /* null比較の練習 */
        String[] a = new String[2];
        a[0] = null;
        a[1] = "test";

        System.out.println(a[0] == null);    // trueが返ってくるためa[0]の値はnullであることが確認できる
        System.out.println(a[1] == null);    // falseが返ってくるためa[0]の値はnullでは無いことがわかる
    }
}
