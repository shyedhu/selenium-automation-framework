package com.shyedhu.automation.utils;

import org.testng.annotations.DataProvider;

/** 
* This is DataHelper class for storing static test data
* 
* @author  Shyedhu
* @version 1.0 
*/
public class DataHelper {
        @DataProvider(name="RegisterProvider")
        public static Object[][] getUserData(){
            return new Object[][] {
                { "Shyedhu", "Shyedhu@gmail.com", "Shyedhu", "Abdul", "123456","123456","USA"}
            };  
}}