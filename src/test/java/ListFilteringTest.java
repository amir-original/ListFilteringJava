import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFilteringTest {


    @Test
    void should_Return_Null_If_All_data_In_List_Are_String() {
        List list = Arrays.asList("g","gf","a","b");
        ListFilter listFilter = new ListFilter();
        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList();
        Assertions.assertEquals(expectedArray,result);
    }

    @Test
    void should_return_1_2_3_If_All_Data_In_List_Are_Integer() {
        List list = Arrays.asList(1,2,3);
        ListFilter listFilter = new ListFilter();
        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList(1,2,3);
        Assertions.assertEquals(expectedArray,result);
    }

    @Test
    void should_Return_1_2_Between_Strings_And_Integers_List() {
        List list = Arrays.asList(1,2,"a","b");
        ListFilter listFilter = new ListFilter();

        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList(1,2);
        Assertions.assertEquals(expectedArray,result);
    }

    @Test
    void should_return_1_2_0_15_Between_Strings_And_Integers_List() {
        List list = Arrays.asList(1, 2, "a", "b", 0, 15);
        ListFilter listFilter = new ListFilter();

        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList(1,2,0,15);
        Assertions.assertEquals(expectedArray,result);
    }

    @Test
    void should_return_1_2_231_Between_Strings_And_Integers_List() {
        List list = Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231);
        ListFilter listFilter = new ListFilter();

        List result = listFilter.filterStrings(list);

        List expectedArray = Arrays.asList(1,2,231);
        Assertions.assertEquals(expectedArray,result);

    }
}
