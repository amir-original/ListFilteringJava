import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFilteringTest {


    @Test
    void should_return_null_if_All_data_In_List_Are_Strings() {
        List list = Arrays.asList("g","gf","a","b");
        ListFilter listFilter = new ListFilter();
        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList();
        Assertions.assertEquals(expectedArray,result);
    }

    @Test
    void should_Return_1_2_Between_Strings_And_Numbers_List() {
        List list = Arrays.asList(1,2,"a","b");
        ListFilter listFilter = new ListFilter();

        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList(1,2);
        Assertions.assertEquals(expectedArray,result);
    }

    @Test
    void should_return_1_2_0_15_Between_Strings_And_Numbers_List() {
        List list = Arrays.asList(1, 2, "a", "b", 0, 15);
        ListFilter listFilter = new ListFilter();

        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList(1,2,0,15);
        Assertions.assertEquals(expectedArray,result);
    }

    @Test
    void should_return_1_2_231_Between_Strings_And_Numbers_List() {
        List list = Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231);
        ListFilter listFilter = new ListFilter();

        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList(1,2,231);
        Assertions.assertEquals(expectedArray,result);

    }
}
