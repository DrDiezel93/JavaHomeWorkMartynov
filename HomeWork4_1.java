import java.util.Iterator;
import java.util.LinkedList;

public class HomeWork4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> link_lst = new LinkedList<Integer>();
        link_lst.add(1);
        link_lst.add(-85);
        link_lst.add(146);
        link_lst.add(174);
        link_lst.add(241);
        System.out.println(link_lst);
        LinkedList<Integer> revers_link_lst = ReversLinkLst(link_lst);
        System.out.println(revers_link_lst);

    }

    public static LinkedList<Integer> ReversLinkLst(LinkedList<Integer> lst) {
        LinkedList<Integer> rever_link_lst = new LinkedList<Integer>();
        Iterator<Integer> iterator = lst.descendingIterator();
            while (iterator.hasNext()) {
                rever_link_lst.add(iterator.next());
        }
        return rever_link_lst; 
    }
}
