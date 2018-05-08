package arithmetic;

/**
 * 两数的和
 * @author zhangjiayu zhangjiayu
 * @create 2018/5/4
 */
public class SoultionTwo {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(l1.val + l2.val);
        res.next = new ListNode(l1.next.val + l2.next.val);
        res.next.next = new ListNode(l1.next.next.val + l2.next.next.val);
        return res;
    }

    public static ListNode addTwoNumbersBetter(ListNode l1, ListNode l2) {

        if (l1 == null ){
            return l2;
        }

        if (l2 == null){
            return l1;
        }

        ListNode res = getRes(null, l1, l2, 0);
        return res;
    }

    private static ListNode getRes(ListNode res, ListNode l1, ListNode l2, int nextValue){

        if (l1 == null ){
            res.next = l2;
            return res;
        }

        if (l2 == null){
            res.next = l1;
            return res;
        }

        int resVal = l1.val + l2.val + nextValue;
        if (resVal >= 10){
            resVal = resVal%10;
            if (null != res){
                res.next = new ListNode(resVal);
                res.next.next = getRes(res.next, l1.next, l2.next, 1);
            }else {
                res = new ListNode(resVal);
                res.next.next = getRes(res, l1, l2, 1);
            }
        }else {
            if (null != res){
                res.next = new ListNode(resVal);
                res.next.next = getRes(res.next, l1.next, l2.next, 0);
            }else {
                res = new ListNode(resVal);
                res.next.next = getRes(res, l1.next, l2.next, 0);
            }

        }

        return  res;
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);

        m1.next = m2;
        m2.next = m3;

        addTwoNumbersBetter(n1, m1);

    }

}
