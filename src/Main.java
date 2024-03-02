import java.util.*;
import java.util.stream.*;
class k21bpstreamdemo
{
    public static void main(String ahruti[])
    {
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(7);
        ls.add(10);
        ls.add(4);
        ls.add(1);
        ls.add(8);
        ls.add(7);
        ls.add(4);
        ls.add(1);
        System.out.println(ls);
        Stream<Integer> st= ls.stream();
        st=st.distinct().sorted();
        st.forEach(str-> System.out.println(str));

        Iterator<Integer> itr=ls.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}