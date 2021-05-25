package examples;

import com.sun.tools.doclint.Entity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.not;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


class FirstJUnitCase {
    @Test(timeout = 10)
    void doFirstTest()
    {
        assertEquals(1,1);
        

    }
    @Test
    void checkList(ArrayList<Integer> al)
    {
        // assertThat(al, hasItems(2));
        assertThat(al, hasItems(2));

    }


    public static void main(String[] args) {
        FirstJUnitCase f = new FirstJUnitCase();
        f.doFirstTest();
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
                l.add(3);
    }
}