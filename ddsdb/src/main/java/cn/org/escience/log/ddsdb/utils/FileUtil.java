package cn.org.escience.log.ddsdb.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 文件相关的工具类
 * @author zzq
 * @email 191550636@qq.com
 */
public class FileUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileUtil.class);

    /**
     * 删除文件
     * @param fpath 文件全路径
     * @return
     */
    public static boolean deleteFile(String fpath) {
        if(fpath == null || "".equals(fpath.trim())){
            return false;
        }
        boolean flag = false;
        File file = new File(fpath);

        if (file.isFile() && file.exists()) {
            flag = file.delete();
        }
        return flag;
    }

    /**
     * 上传文件并进行备份拷贝
     * @param bytes       文件对象
     * @param filePath    上传文件地址
     * @param fileName    文件地址
     * @param copypath    文件备份地址
     * @return
     * @throws Exception
     */
    public static String uploadAndCopyFile(byte[] bytes, String filePath, String fileName,String copypath)throws Exception {
        //上传文件
        fileName = uploadFile(bytes, filePath, fileName);
        try{
            //检查copypath文件夹是否存在
            File copyFile = new File(copypath);
            copyFile.mkdirs();
            //拷贝文件
            copyFileUsingFileChannels(new File(filePath+"/"+fileName),
                new File(copypath+"/"+fileName));

        }catch (Exception e){
            //拷贝文件出错不往上报异常，只要上传成功就行了
            logger.error("拷贝文件出错");
            e.printStackTrace();
        }
        return fileName;
    }


    /**
     * 将一个String数组拼接成一个字符串，用空格分隔
     */
    public String changeStr(String[] arr) {
        int num = arr.length;
        String result = null;
        for (int i = 0; i < num; i++) {
            if (result == null) {
                result = arr[i];
            } else {
                result = result + " " + arr[i];
            }
        }
        if (result == null) {
            result = "";
        }
        return result;
    }

    /**
     * 文件输出
     *
     * @param path     输出文件路径
     * @param isAppend 是否拼接，若为true，则拼接；若为false，则覆盖
     */
    public static BufferedWriter initBufferedWriter(String path,
                                                    boolean isAppend) {
        OutputStreamWriter osw = null;
        BufferedWriter bos = null;
        try {
            osw = new OutputStreamWriter(new FileOutputStream(new File(path),
                    isAppend), "utf-8");
            bos = new BufferedWriter(osw);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return bos;
    }

    /**
     * 文件写入一个文件夹中
     * @param filePath 文件位置
     * @param content byte文件内容
     */
    public static void writeStringToFile(String filePath,byte[] content) {
        File txt = new File(filePath);
        FileOutputStream fos = null;
        try {
            if(!txt.exists()){
                boolean createResult = txt.createNewFile();
                if(!createResult){
                    logger.warn("创建文件 "+txt.getPath()+" 失败！");
                }
            }
            fos =new FileOutputStream(txt);
            fos.write(content,0,content.length);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 将文件读出一个列表，一行一行读取
     * @param path 文件路径
     * @return
     */
    public static List<String> readFile(String path){
        List<String> infos = null;
        InputStreamReader reader = null;
        BufferedReader bfr = null;

        try{
            File file = new File(path);
            if(!file.exists() || file.isDirectory()){
                return null;
            }
            infos = new ArrayList<>(64);
            reader = new InputStreamReader(new FileInputStream(file));
            bfr = new BufferedReader(reader);
            String lineText = null;
            while ((lineText = bfr.readLine())!=null){
                infos.add(lineText.trim());
            }
        }catch (Exception e){
            logger.error("read file exception,"+e.getMessage());
            e.printStackTrace();
        }finally {
            if(bfr != null){
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return infos;
    }

    /**
     * 将文件整体读取为一个string对象
     * @param path
     * @return
     */
    public static String readFile2Str(String path){
        StringBuffer buffer = new StringBuffer();

        InputStreamReader reader = null;
        BufferedReader bfr = null;
        try{
            File file = new File(path);
            if(!file.exists() || file.isDirectory()) return null;
            reader = new InputStreamReader(new FileInputStream(file),"UTF-8");
            bfr = new BufferedReader(reader);
            String lineText = null;
            while ((lineText = bfr.readLine())!=null){
                buffer.append(lineText.trim());
            }
        }catch (Exception e){
            logger.error("read file exception,"+e.getMessage());
            e.printStackTrace();
        }finally {
            if(bfr != null){
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return buffer.toString();
    }

    /**
     * 往文件里写入数据
     * @param filepath
     * @param data
     * @param flag
     */
    public static void writeFile(String filepath, String data,boolean flag) {
        if(filepath==null || "".equals(filepath.trim()) || data==null || "".equals(data.trim())){
            return;
        }
        File file = new File(filepath);
        FileOutputStream fos = null;
        if(file.exists() && file.isFile()){
            try {
                fos = new FileOutputStream(file,flag);
                fos.write(data.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(fos != null){
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    /**
     * 上传文件，文件名会被随机的文件名覆盖！
     * @param file 文件对象
     * @param filePath   文件地址
     * @param fileName   文件名
     * @return
     * @throws Exception
     */
    public static String uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        int lastIndex = fileName.lastIndexOf(".");
        String fileType = fileName.substring(lastIndex);
        fileName = UUID.nameUUIDFromBytes(fileName.getBytes()).toString()+fileType;
        FileOutputStream out = new FileOutputStream(filePath+"/"+fileName);
        out.write(file);
        out.flush();
        out.close();
        return fileName;
    }

    /**
     * 拷贝文件
     * @param source 文件源地址
     * @param dest   文件目录地址
     * @throws IOException
     */
    public static void copyFileUsingFileChannels(File source, File dest) throws IOException {
        if(!dest.exists()){
            boolean createResult = dest.createNewFile();
            if(!createResult){
                logger.warn("目标文件 "+dest.getPath()+" 创建失败");
            }
        }
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            if (inputChannel != null) {
                inputChannel.close();
            }
            if (outputChannel != null) {
                outputChannel.close();
            }
        }
    }
}
