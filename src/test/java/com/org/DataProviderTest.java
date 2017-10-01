package com.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviderTest  {

    @DataProvider(name = "testData")
    public Object[][]testData(){
        Object[][] objects = new Object[2][2];

        objects[0][0] = "a";
        objects[0][1] = "a";
        objects[1][0] = "b";
        objects[1][1] = "b";

        return objects;
    }

    @Test(dataProvider = "testData")
    public void loginWithData(String username,
                                      String password){

        System.out.println("+++++++++++"+username+password);
    }
}
