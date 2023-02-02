import java.util.LinkedList;

public class HomeWork4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> link_lst = new LinkedList<Integer>();
        link_lst.add(1);
        link_lst.add(-85);
        link_lst.add(146);
        link_lst.add(174);
        link_lst.add(241);
        System.out.println(link_lst);
        Integer numb = 86;
        EnqueueLinkLst(link_lst, numb);
        Integer del_first_numb_in_link = DequeueLinkLst(link_lst);
        System.out.println(del_first_numb_in_link);
        System.out.println(link_lst);
        Integer first_numb_in_link = FirstLinkLst(link_lst);
        System.out.println(first_numb_in_link);
    }

    public static void EnqueueLinkLst(LinkedList<Integer> lst, Integer num) {
        lst.add(num);
        System.out.println(lst);
    }

    public static Integer DequeueLinkLst(LinkedList<Integer> lst) {
        Integer del_first_numb = lst.remove(0);
        return del_first_numb;
    }

    public static Integer FirstLinkLst(LinkedList<Integer> lst) {
        Integer first_numb = lst.get(0);
        return first_numb;
    }
}
