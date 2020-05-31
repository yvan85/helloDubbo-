package leetcode;


/***
 * 最长公共前缀
 */
public class LongestCommonPrefix {

    /***
     * 二分法
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false;
            }
        }
        return true;
    }


    /***
     * 水平扫描
     */
    public String longestCommonPrefix2(String[] strs) {
        if(strs.length <1 ) {return "";}
        //第一个参数,以他为标准
        String str0 = strs[0];
        if ("".equals(str0)) {return "";}
        char[] str = str0.toCharArray();

        //遍历元素0
        for (int j = 0; j < str.length; j++) {
            //遍历后面的
            for (int i = 1; i < strs.length; i++) {
                //如果后面元素i长度不够执行本次循环，说明元素i完全满足，直接返回
                if (strs[i].length() < j+1) {
                    return strs[i];
                }

                if (str[j] == strs[i].charAt(j)) {
                    //正常情况，匹配到了
                    continue;
                } else {
                    //匹配失败，直接截取返回
                    return str0.substring(0, j);
                }
            }
        }
        //元素0遍历完了，说明第一个元素就是
        return str0;
    }
}
