package com.company.stringreverse;

import java.util.Arrays;

public class StringReverseCustom {

    public String reverse(String str){
        char[] s = str.toCharArray();
        int ptr_left = 0;
        int ptr_right = str.length()-1;

        while(ptr_left <= ptr_right){
            char str_tmp = s[ptr_left];
            s[ptr_left]  = s[ptr_right];
            s[ptr_right] = str_tmp;
            ptr_left++;
            ptr_right--;
        }
        return new String(s);
    }

}
