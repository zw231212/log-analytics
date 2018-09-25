package cn.org.escience.log.ddsdb.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author zzq
 * @email z191550636@sina.com
 */
public class StringUtil {

    /**
     * 将keyword使用常用的符号进行分割
     * @param keyword 需要分割的字符
     * @return 分割出来的字符set集合
     */
    public static Set<String> splitKeyword(String keyword) {
        if(keyword==null || "".equals(keyword.trim())) return null;
        String str1[] = keyword.split("[\\n、,，| ; ；/.\\\\]");
        Set<String> infos = new HashSet<>(str1.length);
        for (String s : str1) {
            s = s.trim();
            if(s.length()==0)continue;
            infos.add(s.trim());
        }
        return infos;
    }

    public static String substringAfter(String propertyPath, String propertySeparator) {
        if(StringUtil.isNullOrBlank(propertyPath)){
            return null;
        }
        return propertyPath.split(".")[0];
    }

    public static String substringBefore(String propertyPath, String propertySeparator) {
        if(StringUtil.isNullOrBlank(propertyPath)){
            return null;
        }
        String[] infos = propertyPath.split(".");
        if(infos.length==2){
            return infos[1];
        }
        return propertyPath;
    }

    /**
     * 统计一段文本里面的一个词的数量
     * @param content 需要统计的文本
     * @param term 统计的对象
     * @return 最终的词频数
     */
    public static int wordCount(String content,String term){
        if(content==null||"".equals(content.trim())||term==null||"".equals(term.trim())){
            return 0;
        }
        int countNum =0;
        int termLen = term.length();
        int termIndex = content.indexOf(term);
        while (termIndex!=-1){
            countNum++;
            content = content.substring(termIndex+termLen);
            termIndex = content.indexOf(term);
        }
        return countNum;
    }

    /**
     * 判断是否全是英文和数字
     * @param str 输入字符串
     * @return
     */
    public static boolean isAllEnglishAndNum(String str){
        return str.matches("[a-zA-Z0-9]+");//判断英文和数字
    }

    /**
     * 判断是否全是英文和数字
     * @param str 输入字符串
     * @return
     */
    public static boolean isAllEnEnv(String str){
        return str.matches("[a-zA-Z0-9,\\s;]+");//判断英文和数字
    }

    /**
     * 判断是否全是英文和数字
     * @param str 输入字符串
     * @return
     */
    public static boolean containsNum(String str){
        return str.matches("[0-9]+");//判断数字
    }

    /**
     * 判断是否全是英文
     * @param str 输入字符串
     * @return
     */
    public static boolean isAllEnglish(String str){
        return str.matches("[a-zA-Z]+");//判断英文
    }

    /**
     * 将一个string list 合并成字符串
     * @param list 待合并的字符列表
     * @param separator 分隔符
     * @return 合并后的字符串
     */
    public static String listToString(List<String> list, String separator) {
        if(list == null || list.size()==0) return null;
        if(separator==null || "".equals(separator)) separator="、";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i));
                sb.append(separator);
            }
        }
        return sb.toString();
    }

    public static List<String> str2List(String info) {
        if(info==null){
            return null;
        }
        String[] idsArr = info.split(";");
        List<String> idsList = Arrays.asList(idsArr);
        return idsList.parallelStream().filter(id ->
                !(id==null ||
                    "".equals(id.trim())||
                    "null".equals(id.trim()))
        ).collect(Collectors.toList());
    }
    public static List<String> str2List(String infos,String sep) {
        if(infos==null){
            return null;
        }
        if(isNullOrBlank(sep)){
            sep = ";";
        }
        String[] infosArr = infos.split(sep);
        List<String> idsList = Arrays.asList(infosArr);
        return idsList.parallelStream().filter(info ->
                !(info==null ||
                        "".equals(info.trim())||
                        "null".equals(info.trim()))
        ).collect(Collectors.toList());
    }



    /**
     * 过滤文本中的所有 html标签,过滤所有的空格并且只保留第一个空格
     * @param html
     * @return
     */
    public static String filterHTMLTag(String html) {
        if (html == null || "".equals(html)) {
            return "";
        }
        html = html.replaceAll("<[\\s\\S]*?>", "");   //过滤html标签
        html = html.replaceAll(" ", "");   //过滤
        html = html.replaceAll("\\s+", " ");    //过滤空格，并保留一个空格

        return html;
    }

    /**
     * 过滤文本中的所有 html标签
     * @param htmlStr
     * @return
     */
    public static String filterHtml(String htmlStr) {

        String regEx_script = "<[//s]*?script[^>]*?>[//s//S]*?<[//s]*?///[//s]*?script[//s]*?>"; // 定义script的正则表达式{或<script[^>]*?>[//s//S]*?<///script>
        String regEx_style = "<[//s]*?style[^>]*?>[//s//S]*?<[//s]*?///[//s]*?style[//s]*?>"; // 定义style的正则表达式{或<style[^>]*?>[//s//S]*?<///style>
        String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式
        String regEx_html1 = "<[^>]+";

        Pattern p_script = Pattern.compile(regEx_script,
                Pattern.CASE_INSENSITIVE);
        Matcher m_script = p_script.matcher(htmlStr);
        htmlStr = m_script.replaceAll(""); // 过滤script标签

        Pattern p_style = Pattern
                .compile(regEx_style, Pattern.CASE_INSENSITIVE);
        Matcher m_style = p_style.matcher(htmlStr);
        htmlStr = m_style.replaceAll(""); // 过滤style标签

        Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
        Matcher m_html = p_html.matcher(htmlStr);
        htmlStr = m_html.replaceAll(""); // 过滤html标签

        Pattern p_html1 = Pattern
                .compile(regEx_html1, Pattern.CASE_INSENSITIVE);
        Matcher m_html1 = p_html1.matcher(htmlStr);
        htmlStr = m_html1.replaceAll(""); // 过滤html标签

        return htmlStr;
    }
    public static boolean isNullOrBlank(String input){
        if(input==null||"".equals(input.trim())){
            return true;
        }
        return false;
    }

}
