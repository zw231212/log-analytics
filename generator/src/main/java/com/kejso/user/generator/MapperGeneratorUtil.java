package com.kejso.user.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.NullProgressCallback;

public class MapperGeneratorUtil {

  /**
   * 配置文件位置
   */
  private static final String GENERATOR_CONF_NAME="/generatorConfig.xml";

  public void generator() throws Exception {
    List<String> warnings = new ArrayList<>();
    boolean overwrite = true;
    String path = MapperGeneratorUtil.class.getResource(GENERATOR_CONF_NAME).getPath();
    File configFile = new File(path);
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(configFile);
    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,callback, warnings);
    myBatisGenerator.generate(test1());

  }

  public static ProgressCallback test1(){
    System.out.println("test 1!");
    return new NullProgressCallback();
  }

  public static void main(String[] args) {
    MapperGeneratorUtil generatorUtil = new MapperGeneratorUtil();
    try{
      generatorUtil.generator();
    } catch (Exception e){
      e.printStackTrace();
    }
  }

}
